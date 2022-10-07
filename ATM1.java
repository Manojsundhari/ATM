package javaaa;

import java.util.Scanner;

public class ATM1 {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value to be inserest");
		int n=sc.nextInt();
		int accno[]=new int[n];
		String acchol[]=new String[n];
		int pinno[]=new int[n];
		int accbal[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter the account number");
			accno[i]=sc.nextInt();
			System.out.println("enter the account holder");
			acchol[i]=sc.next();
			System.out.println("enter the pinno");
		   pinno[i]=sc.nextInt();
		   System.out.println("enter the account balance");
		   accbal[i]=sc.nextInt();
		   System.out.println("Account number Account holder pinno Account balance ");
		   for(i=0;i<n;i++)
			   System.out.println("    "+accno[i]+"    "+acchol[i]+"    "+pinno[i]+"    "+accbal);
		}
		
		

			  
	}
	

}
