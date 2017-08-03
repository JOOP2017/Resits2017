import java.util.*;
public class Cost {
	
	private Integer amount;
	private String currency;
	
	public Cost(Integer total, String choice){
		if (total>=0){
			amount = total;
		}
		if(choice.equals("pounds sterling")||choice.equals("US dollars")||choice.equals("euros")){
			currency = choice;
		}
	}
	
	public Cost(){
		amount = 0;
		currency = "pounds sterling";
	}

	public void setAmount(Integer amount) {
		if(amount>=0){
			this.amount = amount;
		}
	}


	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		if(currency.equals("pounds sterling")||currency.equals("US dollars")||currency.equals("euros")){
			this.currency = currency;
		}
	}

	public Integer getAmount() {
		return amount;
	}

	public void convert(String newCurrency, double rate) {
		if(newCurrency.equals("pounds sterling")||newCurrency.equals("US dollars")||newCurrency.equals("euros")){
			this.currency = newCurrency;
			this.amount = (int) Math.round(rate * this.amount);
		}
		
	}
	
	public String toString(){
		return amount + " " + currency;
	}
	
	public static void main(String args[]){
		Cost test = new Cost();
		System.out.print(test.toString());
	}

}
