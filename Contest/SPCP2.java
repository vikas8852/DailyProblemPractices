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
		    int n=sc.nextInt();
		    if(n<=x*100)
		     System.out.println("0");
		    else{
		        int r=n-(x*100);
		        if(r%100!=0)
		         System.out.println((r/100)+1);
		        else
		        System.out.println(r/100);
		    }
		    
		}

	}
}
