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
		    int o=n;
		    int p=0;
		   while(n>0){
		       int t=n%10;
		       p=p*10+t;
		       n=n/10;
		       
		   }
		   if(o==p)
		    System.out.println("wins");
		   else
		    System.out.println("loses");
		}
	}
}
