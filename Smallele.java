package Booking;

import java.util.Scanner;

public class Smallele {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
int n,temp=0;
int a[]= new int[10];
System.out.println("enter limit ");
Scanner d= new Scanner(System.in);
n= d.nextInt();
System.out.println("======");
for(int i=0;i<n;i++){
	a[i]= d.nextInt();
	
}
int l=a.length;
for(int i=0;i<l;i++){
	for(int j=i;j<l-1;j++){
		if(a[i]>a[j]){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}

System.out.println(a[1]);




	}

}
