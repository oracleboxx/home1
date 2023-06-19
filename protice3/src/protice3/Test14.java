package protice3;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        while (true) {
	            String line = scanner.nextLine();
	            if (line.equals("#")) {
	                break;
	            }

	            int vowelCount = countVowels(line);
	            System.out.println(vowelCount);
	        }
	    }

	    private static int countVowels(String str) {
	        int count = 0;

	        for (char c : str.toCharArray()) {
	            if (isVowel(c)) {
	                count++;
	            }
	        }

	        return count;
	    }

	    private static boolean isVowel(char c) {
	        c = Character.toLowerCase(c);
	        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	    }
	}