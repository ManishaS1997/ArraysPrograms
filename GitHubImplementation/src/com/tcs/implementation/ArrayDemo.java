package com.tcs.implementation;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		
		int size;
		System.out.println("Enter how many elements you want to store in array");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt(); //3
		
		int a[]=new int[size];  // 45 89 45
		System.out.println("Enter "+size+" elements in array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();  //a[0]=45
		}
		
		
		System.out.println("Your entered array elements are: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.println("a["+i+"]= "+a[i]); //a[0]=1 a[1]=2
		}
		
		

	}

}
