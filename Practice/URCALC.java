/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    String c=sc.next();
		    if(c.charAt(0)=='+')
		    System.out.println(a+b);
		    else if(c.charAt(0)=='-')
		    System.out.println(a-b);
		    else if(c.charAt(0)=='*')
		    System.out.println(a*b);
		     else 
		    System.out.println((a*1.0)/b);
		
	}
}
