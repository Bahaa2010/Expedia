package org.sdt.expedia.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.sdt.expedia.model.Results;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TaskController {

	private Logger logger = LoggerFactory.getLogger(TaskController.class);

	@Autowired
	private TaskControllerUtils controllerUtils;

	@RequestMapping("/search")
	public String naseen(Model model, HttpServletRequest request) {
		controllerUtils.getRequestMap(request);
		Results r = null;
		try {
			r = controllerUtils.getHotelSearchResults(request);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		model.addAttribute("e", r.getOffers().getHotel());
		model.addAttribute("hs", controllerUtils.generateHotelViews(r));

		return "searchResult";
	}

	@ExceptionHandler(Exception.class)
	public String handleError(HttpServletRequest req, Exception ex, Model model) {
		logger.error("Something went wrong", ex);
		return "error";
	}
}
