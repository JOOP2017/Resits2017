package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		System.out.println(a.size());
		int[] myNums = new int[] {1,3,7,5,10};
		Arrays.sort(myNums);
		System.out.println(Arrays.toString(myNums));
		System.out.println(a);
		
		HashMap<String,Integer> dict = new HashMap<String,Integer>();
		String[] words="hello world ha asdf;m".split(" ");
		for(String word: words){
			dict.put(word, word.length());
		}
		System.out.println(dict.toString());
	}

}
