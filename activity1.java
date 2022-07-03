import java.util.Scanner;

public class activity1 {
	
	
	
	  public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);
	        System.out.println("enter the number");
	        int x=sc.nextInt();
	  even(x);
	    }
	   public static void even (int x) {
	    if (x%2==0)
	        System.out.println("the number is even");
	    else 
	        System.out.println("the number is odd");} 

	   {
		   
		   
		        Scanner sc =new Scanner(System.in);
		        System.out.println("enter first number");
		        int x=sc.nextInt();
		        System.out.println("enter second number");
		        int y=sc.nextInt();
		        System.out.println("enter third number if you only have two numbers enter 0");
		        int z=sc.nextInt();
		        if (z==0) 
		             sum(x,y);
		        else
		            sum(x,y,z);

		  }

		      public static void sum (int firstNum , int secondNum) {
		       int sum = firstNum + secondNum ;
		       System.out.println("the sum of the numbers is "+sum);
		    }
		   public static void sum (int firstNum , int secondNum , int thirdNum) {
		       int sum = firstNum + secondNum + thirdNum ;
		       System.out.println("the sum of the numbers is "+sum);
		}
		   public static void sum (double firstNum , int secondNum) {
		       double sum = firstNum + secondNum  ;
		       System.out.println("the sum of the numbers is " +sum	)
		 
		   
		   }}