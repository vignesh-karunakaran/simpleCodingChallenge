package Booking;

public class Mergandnonrepeat {
public static void main(String[] args) {
	int a[]={2,3,4,5,6,7,8};
	int b[]={2,4,9,1,5};
	int i=0,j=0;
	
	while(i<a.length&&j<b.length){
		if(a[i]<b[j])
			System.out.print(a[i++]+"");
		else if(b[j]<a[i])
			System.out.print(b[j++]+"");
		else
		{
			System.out.print(b[j++]+"");
			i++;
		}
	}
		while(i<a.length)
			System.out.print(a[i++]+"");
		while(j<b.length)
			System.out.print(b[j++]+"");
			
		
			

	
	
	
	
	}
	
	
			
}

			
		

	
	
	
	
	
	
	
	
	
	

