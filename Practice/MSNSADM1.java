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
		    int b[]=new int[n];
		    int g=20;
		    int f=10;
		    int max=-1;
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        
		        
		    }
		    for(int i=0;i<n;i++){
		        b[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++){
		      int ans=0;
		      ans+=((a[i]*g)-(b[i]*f));
		        if(ans>=max)
		         max=ans;
		        
		    }
		    if(max>0)
		    System.out.println(max);
		    else
		     System.out.println("0");
		}
	}
}
