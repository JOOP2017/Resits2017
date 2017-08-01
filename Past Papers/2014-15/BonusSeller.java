import java.util.*;
public class BonusSeller extends Seller {
	private HashMap<String, Double> sales;
	
	 BonusSeller(String n){
		 super(n);
		 sales = new HashMap<String, Double>(10);
	 }
	 
	 BonusSeller(){
		 super("");
		 sales = new HashMap<String, Double>(10);
	 }
	 
	 public void sale(String name, double amount){
		 super.sale(amount);
		 double full = 0.0;
		 if(sales.containsKey(name)){
			 full = sales.get(name);
			 full += amount;
			 sales.replace(name, full);
		 }
		 full += amount;
		 sales.put(name, full);
	 }
	 
	 public String toString(){
		 String output = super.toString();
		 output = output + "\n" + "Sales per customer:";
		 for ( String key: sales.keySet()){
			 int cost = (int) Math.round(sales.get(key));
			 output = key + ":" + cost;
		 }
		 return output;
	 }
	 
	 public int calculateBonus(){
		 int t1 = 0;
		 for (String key: sales.keySet()){
			 if(sales.get(key) >= 20){
				 t1 += 1;
			 }
		 }
		 if (t1>=5){
			 if (t1<10){
				 return 5;
			 }
			 
			 if (t1>=10){
				 return 7;
			 }
		 }
		 return 0;
	 }
	 
}
