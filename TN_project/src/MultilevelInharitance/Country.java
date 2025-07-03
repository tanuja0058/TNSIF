package MultilevelInharitance;

public class Country {
	private String country;
	private String capital;
	
	//getter setter
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	//tostring
	@Override
	public String toString() {
		return "Country [country=" + country + ", capital=" + capital + "]";
	}
	
	
	

}
