package Booking;

import java.util.Scanner;

public class Xos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String word;
		Scanner c= new Scanner(System.in);
		word=c.next();

       int l= word.length();
        for (int i = 0; i < l; i++) {

        
            for (int j = 0; j < l; j++) {
                if (j == i || j == (l- 1 - i)) {
                    System.out.print(word.charAt(j));
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

	}

}
