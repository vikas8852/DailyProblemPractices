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
		    char[]c=s.toCharArray();
		    for(int i=0;i<n-1;i+=2){
		        char t =c[i];
		        c[i]=c[i+1];
		        c[i+1]=t;
		    }
		    for(int j=0;j<n;j++){
		        c[j]=(char)(219-(int)c[j]);
		        System.out.print(c[j]);
		        
		        
		    }
		    System.out.println();
		}
	}
}
