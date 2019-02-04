package firstjavaproject;
public class argument 
{
	     public static void main(String[] args)          
	     {	      
	     int len, a, b , c;
	     len=args.length;
	      a = Integer.parseInt(args[1]);
	      b = Integer.parseInt(args[2]);
		 String str = args[0];
		 System.out.print("args 0 value"+ str);
		 if (len > 3)
	     {	
	     System.out.print(".......Enter 3 value only....... :\n ");
	     }
	     else if (str == "+")
	    	 {
	    	    c= a + b ;
	    		 System.out.printf(" addition..../n"+ c);
	    	 }
	     else if (str == "-")
	    	 {
	    		 c= a - b ;
	    		 System.out.printf(" subtraction..../n"+ c);
	    	 }
	     else if (str == "*")
	    	 {
	    		 c= a * b ;
	    		 System.out.printf(" multiplication..../n"+ c);
	    	 }
	     else if (str == "/")
	    	 {
	    		 c= a / b ;
	    		 System.out.printf(" division..../n"+ c);
	    	 }
	   	
	     else
	
    	 {
    
    		 System.out.printf("....Invalid Parameter..../n");
    	 }
   	
	     }}	     
	     

	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     

