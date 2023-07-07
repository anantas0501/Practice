package sxd;

public class MinimumNumber {

	public static void main(String[] args) {
		int a[]= {1,0,2,3,6,8};
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("minimum number is " + min);
	}

}
