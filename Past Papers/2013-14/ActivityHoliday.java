import java.util.*;
public class ActivityHoliday extends Holiday{
	HashMap<String,Cost> activities;
	public ActivityHoliday(String destination, int days) {
		super(destination,days);
		activities = new HashMap<String,Cost>(10);
	}

	public void addActivity(String name, Cost cost) {
		if(activities.containsKey(name)){
			activities.replace(name, cost);
		}else{
			activities.put(name, cost);
		}
		
	}
	@Override
	public String toString(){
		String output = super.toString();
		output += "\nActivities:";
		for (String name : activities.keySet()){
			output  += "\n" + name + " " + (activities.get(name).toString());
		}
		
		return output;
		
	}

	public static void main(String args[]){
		ActivityHoliday test = new ActivityHoliday("Glasgow", 14);
		test.addActivity("Hunterian Museum", new Cost());
		System.out.print(test.toString());
	}
	
	
}
