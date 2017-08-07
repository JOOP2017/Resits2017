import java.util.*;

public class FruitySmartPhone extends Phone {
	private HashMap<String,Integer> installedApps;
	private int cpuSpeed;
	private int freeMemory;

	public int getCpuSpeed() {
		return cpuSpeed;
	}

	public int getFreeMemory() {
		return freeMemory;
	}

	public FruitySmartPhone(String name, int memory, int speed) {
		super(name);
		this.cpuSpeed = speed;
		this.freeMemory = memory;
		installedApps = new HashMap<String,Integer>();
	}

	public static void main(String[] args) {
		FruitySmartPhone p = new FruitySmartPhone("John Smith",100,10);
		p.installApp(new App("Camera",1,2));
		p.installApp(new App("Music",2,3));
		p.installApp(new App("Podcast",2,11));
		p.useApp("Music");
		System.out.println(p.getInstalledApps());

	}

	public boolean installApp(App app) {
		if(installedApps.containsKey(app.getName())||this.getFreeMemory()< app.getMemoryReq() || this.cpuSpeed < app.getCpuReq()){
			return false;
		}else{
			installedApps.put(app.getName(), app.getMemoryReq());
			this.freeMemory -= app.getMemoryReq();
			return true;
		}
	}

	public boolean uninstallApp(App app) {
		if(installedApps.containsKey(app.getName())){
			freeMemory += app.getMemoryReq();
			installedApps.remove(app.getName());
			return true;
		}else{
			return false;
		}
	}

	public boolean useApp(String s) {
		if(installedApps.containsKey(s)){
			if(installedApps.get(s) + 1 <= freeMemory){
				int old = installedApps.get(s)+1;
				installedApps.replace(s, old);
				freeMemory -= 1;
				return true;
			}
			else{
				return false;
			}
		}else{
			return false;
		}
	}

	public ArrayList<String> getInstalledApps() {
		if(installedApps.size()==0){
			return new ArrayList<String>(0);
		}
		ArrayList <String> result = new ArrayList <String>();
		for (String key : installedApps.keySet()){
			result.add(key);
		}
		Comparator<String> cSort = new Comparator <String>()
		{
			public int compare(String s1, String s2){
				return installedApps.get(s1).compareTo(installedApps.get(s2));
			}
		};
		
		Collections.sort(result, cSort);
		Collections.reverse(result);
		
		return result;
	}
		
}

