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
		    int n=sc.nextInt();
		   if(n<4){
		       System.out.println("1");
		   }
		   else {
		       if(n%4!=0)
		        System.out.println(n/4+1);
		       else
		        System.out.println(n/4);
		   }
		   
		}
	}
}
