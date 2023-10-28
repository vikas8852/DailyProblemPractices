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
		    int w=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		    if(w==x|| w==y|| w==z||w==x+y+z||w==x+y||w==y+z||w==x+z){
		        System.out.println("Yes");
		  
		    }
		    else
		     System.out.println("No");
		}
	}
}
