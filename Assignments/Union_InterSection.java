package Assignments;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
 

public class Union_InterSection {

    // Function to find and display the union and intersection
    static void displayUnionAndIntersection(int[] arrayOne,int[] arrayTwo){
        Set<Integer> obj = new HashSet<>();
        int i,j;
        for(i=0; i<arrayOne.length; i++){
            obj.add(arrayOne[i]);
        }
        for(j=0; j<arrayTwo.length; j++){
            obj.add(arrayTwo[j]);
        }
        System.out.println("The union of both the arrays is");
        for(Integer I: obj){
            System.out.print(I + " ");
        }
        System.out.println();
        obj.clear();
        System.out.println("The intersection of both the arrays is");
        for(i=0; i<arrayOne.length; i++){
            obj.add(arrayOne[i]);
        }
        for(j=0; j<arrayTwo.length; j++){
            if(obj.contains(arrayTwo[j]))
                System.out.print(arrayTwo[j] + " ");
        }
    }
    // Function to read the input
    public static void main(String[] args) {
    	
    	Scanner br = new Scanner(System.in);
    	int m,n;
        System.out.println("Enter the size of the two arrays");
            n = br.nextInt();
            m = br.nextInt();
        
        int[] arrayOne = new int[n];
        int[] arrayTwo = new int[m];
        
        System.out.println("Enter the first array elements");
        int i,j;
        for(i=0; i<arrayOne.length; i++){
                arrayOne[i] = br.nextInt();
            }
        System.out.println("Enter the second array elements");
        for(i=0; i<arrayTwo.length; i++){
                arrayTwo[i] = br.nextInt();
            }
          
        displayUnionAndIntersection(arrayOne,arrayTwo);
    }
}