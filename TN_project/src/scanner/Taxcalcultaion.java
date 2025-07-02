package scanner;

public class Taxcalcultaion {
	
	//function to calculate tax
	public void calculateTax(person person)
	{
		if(person.getAge()>65 || person.getGender().equalsIgnoreCase("female")) {
			person.setTax(0);
			System.out.println("Tax is no Applicable");
		}
		else {
			if(person.getIncome()<=160000) {
				person.setTax(0);
				System.out.println("Tax not applicable");
			}
			else if (person.getIncome()>160000 && person.getIncome()<=150000) {
				person.setTax((person.getIncome()-160000)*10/100);
				
			}
			else if (person.getIncome()>500000 && person.getIncome()<=800000) {
				person.setTax((person.getIncome()-500000)*20/100+34000);
				
			}
			else {
				person.setTax((person.getIncome()-80000)*30/100+94000);
			}
		}
		
	}

}
