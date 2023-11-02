package New;

import java.util.Scanner;

class Dec_to_Binary {
	 public static void main(String[] args)
	    {   
	    	Scanner x = new Scanner (System.in);
	    	System.out.println("ENTER THE DECIMAL VALUE : ");
	        int n = x.nextInt();
	        System.out.println("\nBINARY VALUE IS  : ");
	        int a[] = new int[n];
	        int i=0;
	        while (n != 0)
	        {
	            a[i] = n % 2;
	            n = n / 2;
	            i++;
	        }
	        for (int j=i-1; j>=0; j--)
	            System.out.print(a[j]);    
	        System.out.println("\nENTER THE POSITION YOU WANT TO CHECK : ");
	        int pos = x.nextInt();
	        System.out.println((pos=a[pos] ) + " " + "is present at the given pos");
	     }
	   
	    }

