package sxd;

public class MaximumNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,8,9,25};
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("maximum number is " + max);
	}

}
