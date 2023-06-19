package protice;

public class protice_test9 {

	public static void main(String[] args) {
		String str ="It is a fun java programming";
		int i =0;
		int cnt_a=0, cnt_g=0;
		while(i<str.length()) {
			if(str.charAt(i) == 'a') 
				cnt_a++;
			
			else if(str.charAt(i) == 'g') 
				cnt_g++;
				i++;
			
		}
			System.out.println(cnt_a);
			System.out.println(cnt_g);
			System.out.println(str.length());
			
		
	}

}
