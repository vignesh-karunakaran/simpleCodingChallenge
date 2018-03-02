package Booking;

import java.util.Scanner;

public class Str {
	
	
	public static void main(String[] args) {

		String str;
		Scanner v= new Scanner(System.in);
		System.out.println("\n enter your String");
		str=v.next();
		int[] count=new int[10];
		for(int i=0;i <str.length() ;i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count[i]++;
					char er=str.charAt(j);
		
				System.out.print(er);
				}
				
			}
			
		}
		
		


}}

