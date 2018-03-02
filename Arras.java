
package Booking;

import java.util.Scanner;

public class Arras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m=3,n=3;
int sum=0;
		int a[][]= new int[m][n];
		
		Scanner v=new Scanner(System.in);
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=v.nextInt();
			}
		}
		System.out.println("enter the index numbers to diaplay from");
		
		int k=v.nextInt();
		int l=v.nextInt();
		int i=v.nextInt();
		int j=v.nextInt();
		k=k-1;
		l=l-1;

		for(int p=k;p<i;p++){
		for(int q=l;q<j;q++){
			System.out.print(a[p][q]);
			System.out.print(",");
			sum=sum+a[p][q];
		}
		System.out.println("");
	}
		
		System.out.println("sum is :"+sum);
	}

}
