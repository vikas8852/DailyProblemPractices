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
		    String s=sc.next();
		    int count =0;
		   
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)=='1')
		         count++;}
		   if(count==0)
		    System.out.println("0");
		   else{
		   count=0;
		    for(int i=0;i<n-1;i++){
		       if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)=='1')
		       count++;
		    }
		    if(count>0)
		     System.out.println("2");
		    else
		     System.out.println("1");
		        
		   }
		    
		    
		}
	}
}
