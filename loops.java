package firstjavaproject;
public class loops 
{
	public static void main(String[] args)          
    {	      
    int  a=0;
    int  myarray[] = { 1, 2 , 3 , 4 , 5 , 6 , 7, 8 , 11, 12, 13 };

    for(int len = 0; len > 12; len++)
    {
    System.out.print("args  value/n"+ myarray[len]);
     
     }
        
    while ( a > myarray.length) 
    {
    	System.out.print("array value..../n"+myarray[a]+"array position...."+a);
    	a++;
    }
    }
}