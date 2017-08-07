import java.util.ArrayList;
import java.util.*;

public class SnowSquirrelBrowser extends Browser{
    private HashMap<String,Double> installedPlugins =new HashMap<>();
	private String version;
	private double availableQuota;
	public String getVersion() {
		return version;
	}

	

	public double getQuota() {
		return availableQuota;
	}

	
	public SnowSquirrelBrowser(String string, double d, String string2) {
		// TODO Auto-generated constructor stub
		super(string);
		version = string2;
		availableQuota = d;
	}

	public boolean installPlugin(Plugin a1) {
		// TODO Auto-generated method stub
		if((installedPlugins.containsKey(a1.getName()))||(a1.getQuotaReq()>availableQuota)||(!a1.getVersionReq().equals(version)))
				{
			     return false;
				}
		else
		{
			installedPlugins.put(a1.getName(),a1.getQuotaReq());
			availableQuota -= a1.getQuotaReq();
			return false;
		}
	}

	public boolean uninstallPlugin(Plugin a1) {
		if(!(installedPlugins.containsKey(a1.getName())))
		{
	     return false;
		}
		else
		{
			installedPlugins.remove(a1.getName());
			availableQuota += a1.getQuotaReq();
			return true;
		}
	}

	public boolean usePlugin(String string) {
		if(!(installedPlugins.containsKey(string))||installedPlugins.get(string)>this.availableQuota){
                               return false;

	}
		else
		{
			double a = installedPlugins.get(string)+1;
			installedPlugins.replace(string,a);
			availableQuota+=1;
			return true;
		}
	}

	public ArrayList<String> getInstalledPlugins() {
		if(installedPlugins.size()==0)
		{
			return new ArrayList<String>();
		}
		else
		{
			ArrayList<String> result = new ArrayList<>();
			for(String name: installedPlugins.keySet())
			{
				result.add(name);
			}
			Comparator<String> cSort = new Comparator<String>()
		    {
			   	public int compare(String a, String b){
			   		return installedPlugins.get(a).compareTo(installedPlugins.get(b));
			   	}
			};
			Collections.sort(result,cSort);
			Collections.reverse(result);
			return result;
			       
		}
	}
	public static void main(String[] args)
	{
		SnowSquirrelBrowser s = new SnowSquirrelBrowser("John Smith",10,"1.0");
		s.installPlugin(new Plugin("Shopping",2.0,"1.0"));
		s.installPlugin(new Plugin("VPN",3.0,"1.0"));
		s.installPlugin(new Plugin("Email",2.0,"2.0"));
		s.usePlugin("VPN");
		System.out.println(s.getInstalledPlugins());
	}

}
