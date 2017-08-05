
public class Length {
     
	private int number;
	private String units; 
	
	public Length()
	{
		number = 0;
		units = "km";
	}
	public String getUnits() {
		return units;
	}

	public void setUnits(String s) {
		if(units.equals("km")||units.equals("miles")||units.equals("minutes"))
		{
			units = s;
		}
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int n) {
		if(n>=0)
		{
			number = n;
	    }
		
	}

	public void convert(String newUnits, double rate) {
		if(newUnits.equals("km")||newUnits.equals("miles")||newUnits.equals("minutes"))
		{
			units = newUnits;
			number = (int)Math.round(number*rate);
		}
	}
	
	public String toString()
	{
		return number+" "+units;
	}
	
	public static void main(String args[])
	{
		Length test = new Length();
		test.setUnits("minutes");
		test.setNumber(40);
		System.out.println(test.toString());
	}

}
