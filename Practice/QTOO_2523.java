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
		    String s =sc.next();  int count=1;
		    boolean b=false;
		    for(int i=0;i<n-1;i++){
		        for(int j=i+1;j<n;j++){
		            if(s.charAt(i)==s.charAt(j)){
		              b=true;
		              break;
		            
		             
		             
		            }
		          
		        }
		    }
		    if(b)
		     System.out.println(n-2);
		    else
		     System.out.println(-1);
		}

	}
}
