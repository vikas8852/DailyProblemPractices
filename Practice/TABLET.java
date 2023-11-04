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
		    int b=sc.nextInt();
		    int a[][]=new int[n][3];
		   for(int i=0;i<n;i++){
		       for(int j=0;j<3;j++)
		       a[i][j]=sc.nextInt();
		   }
		   int max=0;
		   int p=0;
		   for(int i=0;i<n;i++){
		       if(a[i][2]<=b){
		        p=a[i][0]*a[i][1];
		       
		           }
		      if(p>max)
		       max=p;
		   }
		  if(max==0)
		   System.out.println("no tablet");
		  else
		   System.out.println(max);
		   
		   
		   
		    }
		    
		
	}
}
