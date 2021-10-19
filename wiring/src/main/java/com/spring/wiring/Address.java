package com.spring.wiring;

public class Address {
	
	private String cityname;
	private String statename;
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public Address(String cityname, String statename) {
		super();
		this.cityname = cityname;
		this.statename = statename;
	}
	@Override
	public String toString() {
		return "Address [cityname=" + cityname + ", statename=" + statename + "]";
	}	
	
	public Address() {

}
}
