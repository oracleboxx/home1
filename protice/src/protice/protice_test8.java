package protice;

import java.util.ArrayList;

public class protice_test8 {

	public static void main(String[] args) {
		String str ="Have a nice day Have a nice day Have a nice day";
		ArrayList<Integer> arr = new ArrayList<>();
		int i=0;
		while(i<str.length()) {
			if(str.charAt(i) == 'a') 
				arr.add(i);
				i++;
			
			}
			System.out.println(arr);
		}
	}

