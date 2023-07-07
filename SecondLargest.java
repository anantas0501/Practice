package sxd;

public class SecondLargest {

	public static void main(String[] args) {
		int temp,size;
		
		int a[]= {1,5,8,11};
		size=a.length;
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]>a[j])
					temp=a[i];
				a[i]=a[j];
				temp=a[j];
			}
		}
		System.out.println("second largest number is " + a[size-2]);
		
	}

}
