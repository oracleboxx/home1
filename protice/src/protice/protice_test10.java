package protice;

public class protice_test10 {

	public static void main(String[] args) {
		String str = new String("tESt sTring 	change		first");
		String[] changestr = str.split("\\s+");
		for(int i =0; i<str.length(); i++) {
			String  a= changestr[i].substring(0,1);
			String  b= changestr[i].substring(1);
				
		}
	}

}
