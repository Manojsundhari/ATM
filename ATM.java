package javaaa;

import java.util.Scanner;

public class ATM {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of numbers");
		int n=sc.nextInt();
		int domination[]=new int[n];
				int number[]=new int[n];
						int value[]=new int[n];
						for(int i=0;i<n;i++){
							System.out.println("enter the domination and number is ");
							 domination[i]=sc.nextInt();
					  
							 number[i]=sc.nextInt();
							  value[i]=domination[i]*number[i];
							  System.out.println("the valur is "+value[i]);
							 
						}
	}

}
