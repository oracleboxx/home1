package protice;

public class portice_test5 {

	public static void main(String[] args) {
	String str = "it is a fun hava porogramming";
	int i =0;
	int cut_a =0, cut_g=0;
	while(i<str.length()) {
		if(str.charAt(i) == 'a') 
			cut_a++;
			
		
		
			else if(str.charAt(i) == 'g') 
			cut_g++;
			i++;
	}
	
			System.out.println(cut_a+"개수");
			System.out.println(cut_g+"개수");
			System.out.println("총 개수"+str.length());
		}
		}
