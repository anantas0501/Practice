package sxd;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		
		int count=1;
		
		if(num>1) {
			
			for(int i=1;i<num;i++) {
				if(num%i==0)
					count++;
			}
		}
		if(count==2) {
			System.out.print("no is prime");
		}
		else {
			System.out.print("no is not prime");
		}
	}

}
