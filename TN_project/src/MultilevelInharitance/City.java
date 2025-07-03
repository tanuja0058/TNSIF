package MultilevelInharitance;

//multilevel inheritance 
public class City extends State{
	private String cityName;
	private String area;
	
	//getter steter
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	//tostring
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", getStateName()=" + getStateName() + ", getLang()="
				+ getLang() + ", getCountry()=" + getCountry() + ", getCapital()=" + getCapital() + "]";
	}
	
	

}
