package sxd;

public class Countchar {

	public static void main(String[] args) {
		String a="ananta Arun shinde";
		
		int count=1;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==' ' && a.charAt(i+1)!=' ')
				count++;
		}
		
		System.out.println("no of words are  " + count);
	}

}
