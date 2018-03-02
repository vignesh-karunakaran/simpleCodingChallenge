package Booking;

public class rotatearray {

	static int  gcd(int e,int f){
		if(f==0)
			return e;
		else
			return gcd(f,e%f);
	}
		
	public static void main(String[] args) {
	int a[]={1,2,3,4,5,6};
	int	d=4,n=a.length,j,k,temp;
	for(int i=0;i<gcd(d,n);i++){
		temp=a[i];
		j=i;
		while(true){
			k=j+d;
			if(k>=n)
				k=k-n;
			if(k==i)
				break;
			a[j]=a[k];
			j=k;
		}
		a[j]=temp;
	}

		for(int s=0;s<a.length;s++){
			System.out.println(a[s]);
		}
		
		
	}

	
}
