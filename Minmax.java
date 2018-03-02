package Booking;

public class Minmax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5,6,7,8};
	int min=0,max=a.length-1; 
		while(true){
		
			if(min<max){
				System.out.print(a[max--]);
				System.out.print(a[min++]);
			}
			else{
				if(min==max){
				System.out.print(a[min]);
				break;
				}
			}
			
		}
	}

}
