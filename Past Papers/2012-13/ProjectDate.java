
public class ProjectDate {
	
	private int weekNo;
	private int dayNo;
	
	public void projectDate() {
		weekNo = 0;
		dayNo = 1;
	}
	
	public int getWeekNo() {
		return weekNo;
	}
	public int getDayNo() {
		return dayNo;
	}
	public void setWeekNo(int n) {
		weekNo = n;
	}
	public void setDayNo(int n) {
		if ( (n==1) || (n==2) || (n==3) || (n==4) || (n==5) ) {
			dayNo = n;
		}
	}
	
	public void advance(int n) {
		
		int d = getDayNo();
		int w = getWeekNo();
		int weeksMovedForward = (d + n)/7;
		int dayMovedForwardTo = (d + n)%7;
		
		setDayNo(dayMovedForwardTo);
		setWeekNo(weeksMovedForward + w);
		
	}
	
	public String toString() {
		
		return "Week: " + getWeekNo() + " Day: " + getDayNo();
		
	}

}
