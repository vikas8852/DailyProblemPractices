/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
	  while(t-->0){
		    int n = s.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i]= s.nextInt();
		    }
		    int count =0;
		    for(int j=0; j<n-1; j++){
	            if(a[j]>a[j+1]){
	                int temp = a[j];
	                a[j] = a[j+1];
	                a[j+1] = temp;
	                break;
	            }
	        }
		    for(int i =0;i<n-1;i++){
		        if(a[i]>a[i+1]){
		            count++;
		        }
		    }
		    if(count>0){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		   
	  }
	}
}
