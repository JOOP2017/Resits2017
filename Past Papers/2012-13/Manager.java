
import java.util.ArrayList;

public class Manager extends Engineer {
	
	private ArrayList<Engineer> team;
	
	public Manager(String name, int salary) {
		super(name, salary);
		team = new ArrayList<Engineer>();
		//Engineer y = new Engineer("Joe Bloggs",20000);
		//team.add(y);
	}
	
	public void setEngineers(ArrayList<Engineer> t) {
		this.team = t;
	}
	public ArrayList<Engineer> getEngineers() {
		return team;
	}
	
	public String toString() {
		
		String m = super.toString();
		String manages = "\nManages:\n";
		
		String l = "";
		for(int i=0; i<team.size(); i++) {
			l += team.get(i) + "\n";
		}
		return m + manages + l;
		
	}
	/*
	public static void main(String args[]) {
		Manager mick = new Manager("Sue Smith", 30000);
		System.out.println(mick.toString());
		
	}*/
	
	

}
