
package org.sdt.expedia.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "averagePriceValue",
    "totalPriceValue",
    "crossOutPriceValue",
    "originalPricePerNight",
    "percentSavings",
    "drr"
})
public class HotelPricingInfo {

    @JsonProperty("averagePriceValue")
    private Double averagePriceValue;
    @JsonProperty("totalPriceValue")
    private Double totalPriceValue;
    @JsonProperty("crossOutPriceValue")
    private Double crossOutPriceValue;
    @JsonProperty("originalPricePerNight")
    private Double originalPricePerNight;
    @JsonProperty("percentSavings")
    private Double percentSavings;
    @JsonProperty("drr")
    private Boolean drr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("averagePriceValue")
    public Double getAveragePriceValue() {
        return averagePriceValue;
    }

    @JsonProperty("averagePriceValue")
    public void setAveragePriceValue(Double averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    @JsonProperty("totalPriceValue")
    public Double getTotalPriceValue() {
        return totalPriceValue;
    }

    @JsonProperty("totalPriceValue")
    public void setTotalPriceValue(Double totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    @JsonProperty("crossOutPriceValue")
    public Double getCrossOutPriceValue() {
        return crossOutPriceValue;
    }

    @JsonProperty("crossOutPriceValue")
    public void setCrossOutPriceValue(Double crossOutPriceValue) {
        this.crossOutPriceValue = crossOutPriceValue;
    }

    @JsonProperty("originalPricePerNight")
    public Double getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    @JsonProperty("originalPricePerNight")
    public void setOriginalPricePerNight(Double originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    @JsonProperty("percentSavings")
    public Double getPercentSavings() {
        return percentSavings;
    }

    @JsonProperty("percentSavings")
    public void setPercentSavings(Double percentSavings) {
        this.percentSavings = percentSavings;
    }

    @JsonProperty("drr")
    public Boolean getDrr() {
        return drr;
    }

    @JsonProperty("drr")
    public void setDrr(Boolean drr) {
        this.drr = drr;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
