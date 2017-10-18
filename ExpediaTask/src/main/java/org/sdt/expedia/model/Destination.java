
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
    "regionID",
    "associatedMultiCityRegionId",
    "longName",
    "shortName",
    "country",
    "province",
    "city",
    "tla",
    "nonLocalizedCity"
})
public class Destination {

    @JsonProperty("regionID")
    private String regionID;
    @JsonProperty("associatedMultiCityRegionId")
    private String associatedMultiCityRegionId;
    @JsonProperty("longName")
    private String longName;
    @JsonProperty("shortName")
    private String shortName;
    @JsonProperty("country")
    private String country;
    @JsonProperty("province")
    private String province;
    @JsonProperty("city")
    private String city;
    @JsonProperty("tla")
    private String tla;
    @JsonProperty("nonLocalizedCity")
    private String nonLocalizedCity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("regionID")
    public String getRegionID() {
        return regionID;
    }

    @JsonProperty("regionID")
    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    @JsonProperty("associatedMultiCityRegionId")
    public String getAssociatedMultiCityRegionId() {
        return associatedMultiCityRegionId;
    }

    @JsonProperty("associatedMultiCityRegionId")
    public void setAssociatedMultiCityRegionId(String associatedMultiCityRegionId) {
        this.associatedMultiCityRegionId = associatedMultiCityRegionId;
    }

    @JsonProperty("longName")
    public String getLongName() {
        return longName;
    }

    @JsonProperty("longName")
    public void setLongName(String longName) {
        this.longName = longName;
    }

    @JsonProperty("shortName")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("shortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("tla")
    public String getTla() {
        return tla;
    }

    @JsonProperty("tla")
    public void setTla(String tla) {
        this.tla = tla;
    }

    @JsonProperty("nonLocalizedCity")
    public String getNonLocalizedCity() {
        return nonLocalizedCity;
    }

    @JsonProperty("nonLocalizedCity")
    public void setNonLocalizedCity(String nonLocalizedCity) {
        this.nonLocalizedCity = nonLocalizedCity;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Destination [regionID=" + regionID + ", associatedMultiCityRegionId=" + associatedMultiCityRegionId
				+ ", longName=" + longName + ", shortName=" + shortName + ", country=" + country + ", province="
				+ province + ", city=" + city + ", tla=" + tla + ", nonLocalizedCity=" + nonLocalizedCity
				+ ", additionalProperties=" + additionalProperties + "]";
	}
    
    

}
