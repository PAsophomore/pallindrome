/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class pallindrome {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a number to check pallindrome");
		int n=sc.nextInt();
		int i=n;
		int rev=0;
		while(i>0){
		    int d=i%10;
		    rev=rev*10+d;
                    i/=10;
		}
		if(rev==n)
		System.out.println("Number is pallindrome");
		else 
		System.out.println("Number is not a pallindrome number");
	}
}