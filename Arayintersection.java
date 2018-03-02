package Booking;

public class Arayintersection {
public static void main(String[] args) {
	int i=0,j=0;
	int a[]={2,4,6,5,7,8};
	int b[]={2,6,8};
	while(i<a.length&&j<b.length){
		
		if(a[i]<b[j])
		{
			i++;
		}
		else if(a[i]>b[j])
		{
			j++;
		}
		else{
			System.out.print(b[j++]+"");
			i++;
		}
		
		
		
	}
	
	
}
}
