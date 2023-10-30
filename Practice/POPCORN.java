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
		    int a1=sc.nextInt();
		    int a2=sc.nextInt();
		    int b1=sc.nextInt();
		    int b2=sc.nextInt();
		    int c1=sc.nextInt();
		    int c2=sc.nextInt();
		    if(a1+a2>=b1+b2 && a1+a2>=c1+c2)
		    System.out.println(a1+a2);
		    else if(b1+b2>=a1+a2 && b1+b2>=c1+c2)
		    System.out.println(b1+b2);
		    else if(c1+c2>=b1+b2 && c1+c2>=a1+a2)
		    System.out.println(c1+c2);
		}
		
		
	}
}
