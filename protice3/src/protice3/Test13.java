package protice3;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);

	        while (true) {
	            String line = scanner.nextLine();
	            if (line.equals("EOI")) {
	                break;
	            }

	            boolean found = line.toUpperCase().contains("NEMO");
	            if (found) {
	                System.out.println("Found");
	            } else {
	                System.out.println("Missing");
	            }
	        }
	    }
	}
