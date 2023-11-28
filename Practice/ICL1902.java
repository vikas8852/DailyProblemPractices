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
		int t=sc.nextInt();
	while(t-->0)
		{
		    int n=sc.nextInt();
		    int c=0;
		    while(n!=0)
		    {
		        double m=Math.floor(Math.sqrt(n));
		        n-=(m*m);
		        c++;
		    }
		    System.out.println(c);
		}
	}
}
