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
		    int v1=sc.nextInt();
		    int v2=sc.nextInt();
		    double s  = n*Math.sqrt(2);
	        double e = 2*n;
	        
	        double timestr = s/v1;
	        double timeele = e/v2;
	        
		    if(timestr>timeele)
		    System.out.println("Elevator");
		    else
		    System.out.println("Stairs");
		}
	}
}
