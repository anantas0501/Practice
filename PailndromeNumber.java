package sxd;

import java.util.Scanner;

public class PailndromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		int num=sc.nextInt();
		int rev=0;
		
		int orgnum=num;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(orgnum==rev) {
			System.out.print(orgnum+ " Pailndrome number");
		}
		else {
			System.out.print(orgnum+ " not Pailndrome number");
		}
	}

}
