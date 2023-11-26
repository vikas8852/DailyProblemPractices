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
		    String str=sc.next();
		    int one=0;
		    int zero=0;
		    for(int i=0;i<n;i++){
		        if(str.charAt(i)=='1')
		        one++;
		        else
		        zero++;
		        
		    }
		    if(one>zero)
		    System.out.println(zero+1);
		    else
		    System.out.println(one);
		}
	}
}
