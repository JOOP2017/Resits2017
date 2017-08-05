
public class Engineer {
	
	private String name;
	private int salary;
	
	public Engineer(String n, int s) {
		name = n;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int s) {
		salary = s;
	}
	
	public String toString() {
		return name + " (" + salary + ")";
	}

}
