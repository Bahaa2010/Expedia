package org.sdt.expedia.view.beans;

public class HotelView {
	String startDate;
	String endDate;
	int lengthOfStsay;
	String providence;
	String city;
	String hotelName;
	String hotelStarRating;
	String guestReviewRating;
	String imgURL;
	String averagePrice;
	String totalPrice;
	String originalPrice;
	String percentSaving;
	String hotelInfoSiteURL;
	String currency;
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getLengthOfStsay() {
		return lengthOfStsay;
	}
	public void setLengthOfStsay(int lengthOfStsay) {
		this.lengthOfStsay = lengthOfStsay;
	}
	public String getProvidence() {
		return providence;
	}
	public void setProvidence(String providence) {
		this.providence = providence;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelStarRating() {
		return hotelStarRating;
	}
	public void setHotelStarRating(String hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}
	public String getGuestReviewRating() {
		return guestReviewRating;
	}
	public void setGuestReviewRating(String guestReviewRating) {
		this.guestReviewRating = guestReviewRating;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public String getAveragePrice() {
		return averagePrice;
	}
	public void setAveragePrice(String averagePrice) {
		this.averagePrice = averagePrice;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getPercentSaving() {
		return percentSaving;
	}
	public void setPercentSaving(String percentSaving) {
		this.percentSaving = percentSaving;
	}
	public String getHotelInfoSiteURL() {
		return hotelInfoSiteURL;
	}
	public void setHotelInfoSiteURL(String hotelInfoSiteURL) {
		this.hotelInfoSiteURL = hotelInfoSiteURL;
	}
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public HotelView(String startDate, String endDate, int lengthOfStsay, String providence, String city,
			String hotelName, String hotelStarRating, String guestReviewRating, String imgURL, String averagePrice,
			String totalPrice, String originalPrice, String percentSaving, String hotelInfoSiteURL,String currency) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.lengthOfStsay = lengthOfStsay;
		this.providence = providence;
		this.city = city;
		this.hotelName = hotelName;
		this.hotelStarRating = hotelStarRating;
		this.guestReviewRating = guestReviewRating;
		this.imgURL = imgURL;
		this.averagePrice = averagePrice;
		this.totalPrice = totalPrice;
		this.originalPrice = originalPrice;
		this.percentSaving = percentSaving;
		this.hotelInfoSiteURL = hotelInfoSiteURL;
		this.currency = currency;
	}
	
	
}
