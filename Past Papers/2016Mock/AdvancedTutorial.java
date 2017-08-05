import java.util.ArrayList;
import java.util.HashMap;

public class AdvancedTutorial extends Tutorial {
	private String topic;
	public AdvancedTutorial(String topic, String tutor, String time) {
		super(tutor,time);
		this.topic = topic;
	}
	
	public String toString(){
		return("Topic: " + topic + " " + super.toString());
	}

	public boolean couldCombineWith(AdvancedTutorial t) {
		if(topic.equals(t.topic) && this.getTime().equals(t.getTime())){
			return true;
		}
		return false;
	}

	public static HashMap<String, ArrayList<AdvancedTutorial>> construct(String[] s) {
		
		HashMap<String, ArrayList<AdvancedTutorial>> result = new HashMap<>(); 
		
		for(int i=0;i<s.length-2;i++)
		{
			AdvancedTutorial addition = new AdvancedTutorial(s[i],s[i+1],s[i+2]);
		
			{	if(result.containsKey(s[i])){
				ArrayList<AdvancedTutorial> a = new ArrayList<>();
	 			a.addAll(result.get(s[i]));
	 			a.add(addition);
				
				
			}
			else
			{
				ArrayList<AdvancedTutorial> a = new ArrayList<>();
				a.add(addition);
				result.put(s[i], a);
			}
				
			
			}}
		
		 return result;
		
	
	}

	public static void main(String[] args) {
		
		String[] a = new String[args.length];
		if(args.length%3==0&&args.length>0)
		{
			   System.out.println(construct(a));
		}
		else
		{
		  	
		   System.out.println("Wrong number of arguments!");
		}
		
		/*AdvancedTutorial test1 = new AdvancedTutorial("OP","Tim","0900");
		AdvancedTutorial test2 = new AdvancedTutorial("OP","Ben","0900");
		System.out.print(test1.couldCombineWith(test2));
		*/
	}

}
/*
	public static HashMap<String, ArrayList<AdvancedTutorial>> construct(String[] s) {
		HashMap<String, ArrayList<AdvancedTutorial>> result = new HashMap<String, ArrayList<AdvancedTutorial>>();
		// since we're already checking whether or not the array is a multiple
		// of 3, there's no need
		// for i<s.length-2
		// i+=3, because, the key new key comes after 3 iterations ,otherwise we
		// would be adding
		// tutor and time to the keySet , which is wrong!
		for (int i = 0; i < s.length; i += 3) {
			AdvancedTutorial addition = new AdvancedTutorial(s[i], s[i + 1], s[i + 2]);

			{
				if (result.containsKey(s[i])) {
					ArrayList<AdvancedTutorial> a = new ArrayList<>();
					a.remove(result.get(s[i]));
					a.add(addition);
					result.put(s[i], a);

				} else {
					ArrayList<AdvancedTutorial> a = new ArrayList<>();
					a.add(addition);
					result.put(s[i], a);
				}

			}
		}

		return result;
	}

	public String toString() {
		return "Topic: " + topic + " " + super.toString();
	}

	public static void main(String[] args) {
		String[] a = new String[args.length];
		for(int i = 0;i<args.length;i++)
		{
			a[i] = args[i];
		}
		if (args.length % 3 == 0 && args.length > 0) {
			System.out.println(construct(a));
		} else {

			System.out.println("Wrong number of arguments!");
		}
	}
	*/
