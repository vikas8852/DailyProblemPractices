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
		    int k=sc.nextInt();
		    int hgt[]=new int[n];
		    int count=0;
		    for(int i=0;i<n;i++){
		        hgt[i]=sc.nextInt();
		        if(hgt[i]>k)
		         count++;
		    }
		    System.out.println(count);
		 
		}
	}
}
