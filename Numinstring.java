package Booking;

public class Numinstring {

	public static void main(String[] args) {
		
		String a="a10b7";
		String tstr="";
		for(int i=a.length()-1;i>=0;i--){
			if(Character.isAlphabetic(a.charAt(i))){
				int n = Integer.parseInt(a.substring(i+1));
				for(int k=0;k<n;k++)
					tstr +=a.charAt(i);
					a= a.substring(0,i);
					
				
			}
		}
		
		
		System.out.print(new StringBuffer(tstr).reverse().toString());
		
	}
	
}
