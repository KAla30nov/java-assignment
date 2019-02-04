package firstjavaproject;
import java.util.Scanner;

public class calculations
{


    public static void main(String args[])
    {    
       int choice, a, b, result;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("1......For addition of  Two Numbers....... :\n ");
       System.out.print("2......For Multiplication of two Numbers...:\n");
       System.out.print("3.......for subtraction of two numbers.........:\n");
       System.out.print("4......For division of two numbers.......:\n");
       choice  = scan.nextInt();
       
       if(choice > 4) 
    	   {
    	   System.out.print("....invalid seletion........");
       	
       	   }	
       
       else if (choice ==1)
       {
    	   System.out.print(" Enter first no :..\n");
           System.out.print("enter second no....\n");
           a = scan.nextInt();
           b = scan.nextInt();
            result = a + b;
            System.out.print("Result = " +result);
        
       }
       else if (choice ==2)
       {	   
	   System.out.print(" Enter first no :..\n");
       System.out.print("enter second no....\n");
       a = scan.nextInt();
       b = scan.nextInt();
	   result = a * b;
        System.out.print("Result = " +result);
        
       }
       else if (choice == 3)
       {   
       System.out.print(" Enter first no :..\n");
       System.out.print("enter second no....\n");
       a = scan.nextInt();
       b = scan.nextInt();
	   result = a - b;
        System.out.print("Result = " +result);
       
       }
       else
       {	   
       System.out.print(" Enter first no :..\n");
       System.out.print("enter second no....\n");
       a = scan.nextInt();
       b = scan.nextInt();
	   result = a / b;
        System.out.print("Result = " +result);
       }
    }
}



    
    
   