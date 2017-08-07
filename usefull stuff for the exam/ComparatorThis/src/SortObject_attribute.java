import java.util.Random;

public class SortObject_attribute {

	public static void main(String[] args) {
		Random rand=new Random();
		
		
		Mine[] peps = new Mine[25];
		
		for (int i =0;i<peps.length;i++){
			
			Mine pop = new Mine(rand.nextInt(1000));
			peps[i]=pop;
		}
		
		for (Mine pop: peps){
			
			System.out.println(pop.num);
			
			
		}
		
	peps=sort_Mines(peps);
	
	for (Mine pop: peps){
		
		System.out.println(pop.num);
		
		
	}
	
	
	}
	
	
	public static Mine[] sort_Mines(Mine[] peps){
		
		
		
		
		
		return new Mine[100];
	}

}
