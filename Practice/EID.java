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
		    int a[]=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		   Arrays.sort(a);
		   int min=Integer.MAX_VALUE;
		   int count=0;
		   for(int i=0;i<n-1;i++){
		      int diff=a[i+1]-a[i];
		      if(min>diff)
		       min=diff;
		   
		       
		   }
		
		    System.out.println(min);
		  
		    
		}
	}
}
