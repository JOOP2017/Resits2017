import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
public class Student extends Person{
    
	private ArrayList<Course> activeCourses = new ArrayList<>() ;
	private ArrayList<Course> completedCourses= new ArrayList<>();
	private int maxCourses;
	public Student(String name, String name2, ArrayList<Course> active, ArrayList<Course> completed, int i) {
		// TODO Auto-generated constructor stub
		super(name,name2);
		activeCourses = active;
		completedCourses = completed;
		maxCourses = i;
	}



	public int getMaxCourses() {
		return maxCourses;
	}



	public void setMaxCourses(int maxCourses) {
		this.maxCourses = maxCourses;
	}



	public boolean canEnroll(Course c2) {
	   
		if((!activeCourses.contains(c2))&&(completedCourses.containsAll(c2.getPrerequisiteCourses())&&(!completedCourses.contains(c2))&&(activeCourses.size()==maxCourses))){
			return true;
		}
		else
			return false;
	
	}

	public boolean enroll(Course c2) {
		if(canEnroll(c2)){
			activeCourses.add(c2);
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean complete(String courseName) {
		//THE FOLLOWING CODE IS INCORRECT AS YOU CANNOT REMOVE ELEMENTS FROM AN ARRAYLIST WHILE ITERATING THROUGH IT!
		/*for(Course c : activeCourses){
			if(c.getName()==string){
				return activeCourses.remove(c)&&completedCourses.add(c);
			}
		}
		return false;
         */
		
			Course l = null;
			for (Course c : activeCourses) {
				if (c.getName() == courseName) {
					l = activeCourses.get(activeCourses.indexOf(c));
				}
			}
			if (l != null) {
				activeCourses.remove(l);
				completedCourses.add(l);
				return true;
			}
			return false;
		
	}

	public HashMap<Course, String> getAllCourses() {
		HashMap<Course, String> result =new HashMap<>();
		for(Course a: activeCourses)
		{
			result.put(a,"active");
		}
		for(Course b: completedCourses)
		{
			result.put(b, "completed");
		}
		return result;
	}

	public String summary() {
		String result = "";
		HashMap<Course, String> cool = new HashMap<>();
		cool = getAllCourses();
		Set<Course> right = new HashSet<>();
		right = cool.keySet();
		for(Course a: right)
		{
			result += a+" ("+cool.get(a)+")";
			result +="\n";
		}
		return result;
	}

}
