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
		    int count=0;
		    int n=sc.nextInt();
		    while(n>0){
		        if(n%10==4)
		         count++;
		        n=n/10;
		    }
		    System.out.println(count);
		   
		}
	}
}
