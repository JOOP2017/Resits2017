package learn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class ComparatorTesting {

	
	public static Double get_mag(Double[] a){
		
		return Math.sqrt(a[0]*a[0]+a[1]*a[1]);
	}
	
	public static ArrayList<Double[]> sort(ArrayList<Double[]> ls){
		
		
		ls.sort(new Comparator<Double[]>(){
			public int compare(Double[]a,Double[] b){
				return get_mag(a).compareTo(get_mag(b));
			}
		});
		
		
		
		return ls;
	}
	
	
	public  static  void print(ArrayList<Double[]> ls){
		for(Double[] i:ls){
			System.out.println(Arrays.toString(i));
		}
		System.out.println();
	}
	
	public static void main (String[] args){
		ArrayList<Double[]> ls = new ArrayList<Double[]>();
		ls.add(new Double[]{100.0,2.0});
		ls.add(new Double[]{2.0,3.0});
		ls.add(new Double[]{-1.0,-9.0});
		String str="abcdefghijklmnopqrstuvwxyz";
		str=str.replace(" ", "");
		StringBuffer s = new StringBuffer(str);
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		HashSet<Character> hs = new HashSet<Character>();
		for(Character c:str.toCharArray()){
			hs.add(c);
		}
		ArrayList<Character> al = new ArrayList<Character>(hs);
		
		
		for(Character c:al){
			map.put(c, 0);
		}
		System.out.println(map.toString());
		while(s.length()>0){
			Character c=s.charAt(0);
			int val=map.get(c);
			map.put(c, val+1);
			s.deleteCharAt(0);
		}
		System.out.println(map.toString());
		
		
		for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            
        }
    }
	}

