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
		   int girl[]=new int[n];
		   for(int i=0;i<n;i++){
		       girl[i]=sc.nextInt();
		   }
		   int max=-1;
		   
		   for(int i=0;i<n-(k-1);i++){
		       int sum=0;
		     for(int  j=i;j<i+k;j++){
		         sum+=girl[j];
		     }
		       
		       if(sum>max)
		        max=sum;
		       
		   }
		   System.out.println(max);
		}
	}
}
