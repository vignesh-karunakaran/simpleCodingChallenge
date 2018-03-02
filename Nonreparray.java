package Booking;

public class Nonreparray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int a[]={1,2,2,3,1,1,6,6,7,3,9,9,8};

		int l=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
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
			if(l==1){
				System.out.println(a[i]);
			}
		}

	}

}
