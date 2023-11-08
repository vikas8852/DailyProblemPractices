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
		   String st=sc.next();
		   int count1=0;
		   int count0=0;
		   
		   for(int i=0;i<st.length();i++){
		       if(st.charAt(i)=='1')
		       count1++;
		       else
		        count0++;
		   }
		   if(count1>count0)
		    System.out.println("WIN");
		   else
		    System.out.println("LOSE");
		}

	}
}
