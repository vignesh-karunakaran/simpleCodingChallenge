package Booking;


import java.util.Scanner;

public class Holiday {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the how many day u wanna search in less than seven?");
		Scanner v= new Scanner(System.in);
		int k= v.nextInt();
		String a[]=new String[k];
		for(int i=0;i<a.length;i++){
		a[i]=v.next().toString();
		
		
		}
		for(int k1=0;k1<a.length;k1++){
		if(a[k1].equals("sunday")||a[k1].equals("saturday")||a[k1].equals("Sunday")||a[k1].equals("Saturday")){
		
		System.out.println(a[k1]+"  is an holiday");	
		}
		else{
		
			System.out.println(a[k1]+"  is not holiday");
			}
		
		
		
		}
		
		
		
		
	}

}
