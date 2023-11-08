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
		    int x=sc.nextInt();
		    int s=sc.nextInt();
		   for(int i=0;i<s;i++){
		      int a=sc.nextInt();
		     int b=sc.nextInt();
		     if(x==a||x==b)
		     x=a+b-x;
		   }
		   
		  System.out.println(x);
	
		}

	}
}
