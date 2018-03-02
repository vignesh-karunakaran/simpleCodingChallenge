package Booking;

public class Rearray {
	
	
	public static void main(String[] args) {
		int a[]= {2,2,3,4,2,1,2};
		int b[]= new int[10];
	
		int times[]= new int[a.length];
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					b[i]=a[i];
					times[i]++;
					
				}
			}
			
		}
		
		//for(int i=0;i<times.length;i++){
		//	for(int j=i+1;j<times.length;j++){
		//		if(times[i]<times[j]){
		//			temp=times[i];
		//			times[i]=times[j];
			//		times[j]=temp;
			//		}
		//	}
		//}
		for(int g=0;g<times.length;g++){
			System.out.println(times[g]);
		}
		
		//int k =times[2];
		
		//System.out.println("the secondmost repeatd element is"+a[k]);
		
		
	}

}
