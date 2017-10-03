package com.nextdot.android_mvp_practice.Model.RetrofitModel;


import com.google.gson.annotations.SerializedName;


public class IPResponse {

	@SerializedName("country")
	private String country;

	@SerializedName("loc")
	private String loc;

	@SerializedName("hostname")
	private String hostname;

	@SerializedName("city")
	private String city;

	@SerializedName("org")
	private String org;

	@SerializedName("ip")
	private String ip;

	@SerializedName("postal")
	private String postal;

	@SerializedName("region")
	private String region;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setLoc(String loc){
		this.loc = loc;
	}

	public String getLoc(){
		return loc;
	}

	public void setHostname(String hostname){
		this.hostname = hostname;
	}

	public String getHostname(){
		return hostname;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setOrg(String org){
		this.org = org;
	}

	public String getOrg(){
		return org;
	}

	public void setIp(String ip){
		this.ip = ip;
	}

	public String getIp(){
		return ip;
	}

	public void setPostal(String postal){
		this.postal = postal;
	}

	public String getPostal(){
		return postal;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}
}