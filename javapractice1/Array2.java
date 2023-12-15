package javapractice1;

import java.util.Scanner;

public class Array2 {
  public static void main (String[] args) {
	  Scanner sc1= new Scanner(System.in);
	  System.out.println("Enter the size:");
	  int n=sc1.nextInt();
	  int arr[]=new int[n];
	  System.out.println("Enter the number:");
	  for(int i=0;i<n;i++) {
		  arr[i]=sc1.nextInt();
	  }
	  for(int i=0;i<n;i++) {
		  
		for(int j=i+1;j<arr.length;j++) {
		//  arr[i]=arr[j];
		  if (arr[i]==arr[j]) {
			  System.out.println(arr[j]);
		  }
		}
			
		  
	  }
	  
  }
}
