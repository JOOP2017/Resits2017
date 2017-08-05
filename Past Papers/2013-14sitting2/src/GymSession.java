import java.util.HashMap;
public class GymSession extends ExerciseSession {
    private HashMap<String,Length> machines ; 
	
	public GymSession(String type, String place) {
		
		super(type,place);
		machines = new HashMap<String,Length>();
	}

	public void addMachine(String name, Length length) {
		
		if(machines.containsKey(name))
		{
			machines.replace(name,length);
		}
		else
		{
			machines.put(name,length);
		}
			
	}
	
	public String toString()
	{
		String result = super.toString();
		result +="\nMachines:";
		for(String name:machines.keySet())
		{
			result += "\n"+name+" "+machines.get(name);
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		GymSession test = new GymSession("Gym","Pleasance");
	    test.addMachine("Treadmill",new Length());
	    System.out.println(test.toString());
	}

}
