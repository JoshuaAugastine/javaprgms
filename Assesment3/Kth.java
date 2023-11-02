package Assesment3;

import java.util.Scanner;

public class Kth {
	
	public static void main(String[] xyz) {
       int n,pos;
       Scanner x = new Scanner(System.in);
       System.out.println("enter the no. of elements you want in array :");
       n = x.nextInt();
       int arr[]= new int [n];
       System.out.println("enter the no. of elements you want in array :");
       for(int i=0; i<n; i++) {
       arr[i] = x.nextInt();
       }
       System.out.println("enter Kth position at which you want to check number :");
       pos = x.nextInt();
       
       for(int i=0; i<1; i++) {
       if(arr[i]>pos) 
         System.out.print("number:"+ arr[pos-1]);
       } 
     }
}