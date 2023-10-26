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
		int tc=sc.nextInt();
		while(tc-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		 //   int mx=>Math.max(x,y);
		 if(x>y)
		 System.out.println(x-y);
		 else if(x<y)
		 System.out.println(y-x);
		 else
		  System.out.println("0");
		 
		    
		}
	}
}
