
public class UG1Student extends Student {
	private char mainSchedule;

	public UG1Student(String name, String uun, char group) {
		super(name, uun, 1);
		mainSchedule = group;
		
	}

	public UG1Student() {
		this("not set", "not set", 'X');
	}

	public boolean addCourse(Course c) {
		if(c.getLevel() == 7 || c.getLevel() == 8){
			super.addCourse(c);
			return true;
		}
		return false;
	}

	public boolean addCourses(Course[] courses) {
		boolean b = true;
		for (Course course : courses){
			b = b & addCourse(course);
		}
		return b;
	}
	
	public String toString(){
		String name = super.toString();
		char s = mainSchedule;
		String mainie = "Main Schedule " + s +" courses:";
		Course[] t = this.getCourses();
		String output = name + "\n" + mainie;
		for (int i = 0; i < t.length; i++){
			output = output + "\n" + t[i].getName();
		}
		return output;
	}
	
	public static void main(String args[]) {
		UG1Student x = new UG1Student("James", "342", 'O');
		Course y = new Course();
		x.addCourse(y);
		String Yammy = x.toString();
		System.out.print(Yammy);
		
	}
}
