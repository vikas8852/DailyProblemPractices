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
		    int a[]= new int[n];
		    for(int i=0;i<n;i++)
		       a[i]=sc.nextInt();
		  
		    Arrays.sort(a);
		    int max=0;
		    int count=1;
		    for(int i=0;i<n-1;i++){
		       if(a[i]==a[i+1])
		        count++;
		       else
		        count=1;
		       if(count>max)
		        max=count;
		    
		    }
		    System.out.println(n-max);
		}

	}
}
