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
		    int b=sc.nextInt();
		    int k=sc.nextInt();
		    int g=n-b;
		    int rb=b%k;
		    int rg=g%k;
		    if(rb>rg)
		    System.out.println(rb-rg);
		    else if(rb==rg)
		     System.out.println("0");
		     else
		      System.out.println(rg-rb);
		}

	}
}
