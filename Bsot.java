package Booking;

public class Bsot {
public static void main(String[] args) {
	
	int a[]={23,34,3,22,35,89,6,1,2};
	int temp=0;
	for(int i=0;i<a.length;i++){
		
		for(int j=i;j<a.length;j++){
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
	}
	
	for(int i=0;i<a.length;i++){
		
		System.out.println(a[i]);
	}
	
}
	
	
	
}
