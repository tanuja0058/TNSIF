package MultilevelInharitance;

public class State extends Country {
	//data member 
	private String stateName;
	private String lang;
	
	//geter setter
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	//tostring
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", lang=" + lang + ", getCountry()=" + getCountry() + ", getCapital()="
				+ getCapital() + "]";
	}
	
	
	

}
