package Booking;

public class Rempalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello today deed is best malayalam  day";
		String[] sp= s.split(" ");
		for(int i=0;i<sp.length;i++){
			String rev = new StringBuffer(sp[i]).reverse().toString();
		
			if(rev.equals(sp[i])){
				
			}
			else{
			
				System.out.print(sp[i]+" ");
			}
			}
		}

}
