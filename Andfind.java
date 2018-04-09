package Booking;
// Swapping the words in a strings with keyword useing and
public class Andfind {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="there is vicky and thangam";
		String v[]=a.split(" ");
		String temp=null;
		int k;int x;
		int count =0;
		
		for(int i=0;i<v.length;i++){
			
			if(v[i].equals("and")){
				count=i;
				}
		}
		
		
	
		k=count+1;
		x=count-1;
		temp=v[k];
		v[k]=v[x];
		v[x]=temp;
		
		
		for(String w:v){
			System.out.print(w+" ");
			
		}
		
		
	}

}
