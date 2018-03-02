package Booking;

public class oneTimea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,1,3,4,2,5,6,7,8};
		int l=0;
		for(int i=0;i<a.length;i++){
			for(int j=1;j<a.length;j++){
				if(i!=j){
				if(a[i]!=a[j]){
					
					l=1;
				}
				else{
					l=0;
					break;
				}
				}
				
			}
			if(l==0){
				System.out.print(a[i]);
			}
		}
		
		
	}

}
