package sxd;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String ab=sc.nextLine();
		String rev=" ";
		int len=ab.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+ab.charAt(i);
		}
		System.out.println("reverse string is " + rev);
	}

}
