package Booking;

public class Plusop {

	public static void main(String[] args) {
		int a=2,b=8;
		
		int count=0;
		System.out.println("addition is :"+(a+b));
		
		a = -a;
		System.out.println("Subtraction is :"+(a+b));
		
		a= -a;
		for(int i=1;i<a;i++){
			b +=b;
		}
		System.out.println("multiplication is :"+b);
		
		while(true){
		
			if(b!=0){
			
				b -=a;
				count++;
			}
			else{
			break;
		}}
		
		System.out.println("divide is :"+b);
		System.out.println(count);
		
	}
	
}
