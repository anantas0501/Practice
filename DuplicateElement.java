package sxd;

public class DuplicateElement {

	public static void main(String[] args) {
		int a[]= {1,2,5,8,9,11,8,5,11};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate element is " + a[j]);
				}
			}
		}
		

	}

}
