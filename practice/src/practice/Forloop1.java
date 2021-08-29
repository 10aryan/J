package practice;

import java.util.Scanner;

public class Forloop1 {

	public static void main(String[] args) {
		
	    
	        Scanner sc = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = sc.nextInt();
	                
	        System.out.println("Multiplication Table of " + num);
	        
	        for(int i=1; i<=10; i++)
	        {
	            System.out.println(num +" x " + i + " = " + (num*i) );
	        }
	    }

	}


