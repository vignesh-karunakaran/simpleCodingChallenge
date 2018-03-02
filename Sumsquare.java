package Booking;

import java.util.Scanner;

public class Sumsquare {
	
	
	public static void main(String[] args) {
		int d,r,sum=0;
		Scanner n= new Scanner(System.in);
		d= n.nextInt();
		while(d>0){
			r=d%10;
			d=d/10;
			sum=sum+r*r;
		}
		System.out.print(sum);
		
	}

}
