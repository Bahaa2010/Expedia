package org.sdt.expedia.controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.sdt.expedia.model.Hotel;
import org.sdt.expedia.model.Results;
import org.sdt.expedia.view.beans.HotelView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@PropertySource(value = { "classpath:task.properties" })
public class TaskControllerUtils {

	private Logger logger = LoggerFactory.getLogger(TaskController.class);
	@Autowired
	Environment env;

	List<String> getPropertiesList() {
		return Arrays.asList(env.getProperty("filters").split(","));
	}

	List<HotelView> generateHotelViews(Results r) {
		List<HotelView> views = new ArrayList<>();
		if (r.getOffers().getHotel() == null) {
			logger.info("No results");
			return views;
		}
		for (Hotel h : r.getOffers().getHotel()) {
			String startDate = h.getOfferDateRange().getTravelStartDate().get(0) + "-"
					+ h.getOfferDateRange().getTravelStartDate().get(1) + "-"
					+ h.getOfferDateRange().getTravelStartDate().get(2);
			String endDate = h.getOfferDateRange().getTravelEndDate().get(0) + "-"
					+ h.getOfferDateRange().getTravelEndDate().get(1) + "-"
					+ h.getOfferDateRange().getTravelEndDate().get(2);
			HotelView hotelView = new HotelView(startDate, endDate, h.getOfferDateRange().getLengthOfStay(),
					h.getDestination().getProvince(), h.getDestination().getCity(), h.getHotelInfo().getHotelName(),
					String.valueOf(new Double(h.getHotelInfo().getHotelStarRating()).intValue()),
					String.valueOf(h.getHotelInfo().getHotelGuestReviewRating()), h.getHotelInfo().getHotelImageUrl(),
					String.valueOf(h.getHotelPricingInfo().getAveragePriceValue()),
					String.valueOf(h.getHotelPricingInfo().getTotalPriceValue()),
					String.valueOf(h.getHotelPricingInfo().getOriginalPricePerNight()),
					String.valueOf(h.getHotelPricingInfo().getPercentSavings()),
					String.valueOf(h.getHotelUrls().getHotelInfositeUrl()), r.getOfferInfo().getCurrency());
			views.add(hotelView);
		}

		return views;
	}

	Map<String, String> getRequestMap(HttpServletRequest request) {
		Map<String, String> map = new HashMap<>();

		for (String property : getPropertiesList()) {
			if (StringUtils.isNoneBlank(request.getParameter(property))) {
				map.put(property, request.getParameter(property));
			}
		}
		return map;
	}

	Results getHotelSearchResults(HttpServletRequest request) throws IOException {
		URL url = new URL(buildSearchURL(request));
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		String responsJSON = "";
		try {
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("eeeeeeeee");
			}
			responsJSON = IOUtils.toString(conn.getInputStream());
		} finally {
			conn.disconnect();
		}
		return getSearchResultFromJson(responsJSON);

	}

	private Results getSearchResultFromJson(String result)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Results e = mapper.readValue(result, Results.class);
		return e;
	}

	private String buildSearchURL(HttpServletRequest request) {
		StringBuilder sb = new StringBuilder();
		sb.append(env.getProperty("url"));
		Map<String, String> filtersMap = getRequestMap(request);
		for (Entry<String, String> entry : filtersMap.entrySet()) {
			sb.append("&");
			sb.append(URLEncoder.encode(entry.getKey()));
			sb.append("=");
			sb.append(URLEncoder.encode(entry.getValue()));
		}
		return sb.toString();

	}
}
