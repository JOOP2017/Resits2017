
public class UG1Student extends Student {
	
	private char mainSchedule;

	public UG1Student(String name, String uun, char schedule) {
		super (name, uun, 1);
		schedule = mainSchedule;
	}
	
	public UG1Student () {
		this ("not set", "not set",'X');
	}

	public boolean addCourse(Course c) {
		if (c.getLevel() == 7 || c.getLevel() == 8) {
			super.addCourse(c);
			return true;
		}
		return false;
	}

	public boolean addCourses(Course[] cs) {
		boolean b = true;
		for (Course c : cs ) {
			b = b & addCourse(c);
			}
		return b;
		}
		
	
	public String toString () {
		
		String output = super.toString() + "\n Main schedule " + mainSchedule + " courses:";
		
		for (Course c : getCourses()) {
			output += "\n" + c.getName();
		}
		return output;
	}
}


