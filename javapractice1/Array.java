package javapractice1;

import java.util.Scanner;

public class Array {
	public static void main (String[] args) {
		int ref1=0;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=sc1.nextInt();
		int[]arr=new int[n];
		System.out.println("enter the Numbers:");
		for(int i=0;i<n;i++) {
			arr[i]=sc1.nextInt();
		}
		for(int re:arr) {
			ref1+=re;
		}
		System.out.println("total value by adding:"+ref1);
		int avg=ref1/arr.length;
		System.out.println("average value "+avg);
		
		
	}}
