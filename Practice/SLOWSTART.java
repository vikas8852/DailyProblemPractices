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
	  int x=sc.nextInt();
		    int h=sc.nextInt();
		 int damage=x/2;
		 int count=0;
		 int j=0;
		 while(h>0 && j<5){
		     h=h-damage;
		     count++;
		     j++;
		 }
		 while(h>0){
		     h=h-x;
		     count++;
		     
		 }
		        System.out.println(count);
		    
		}
	}
}
