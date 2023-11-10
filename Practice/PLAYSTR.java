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
		    String r=sc.next();
		  
		    int cs_1=0;
		    
		    int cr_1=0;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i)=='1')
		         cs_1++;
		        if(r.charAt(i)=='1')
		         cr_1++;
		       
		        
		    }
		    if(cs_1==cr_1)
		     System.out.println("YES");
		    else
		     System.out.println("NO");
		}

	}
}
