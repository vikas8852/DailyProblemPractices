/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		while(testCase-->0){
		    int x1=sc.nextInt();
		     int y1=sc.nextInt();
		     int x2=sc.nextInt();
		     int y2=sc.nextInt();
		     if(x1+y1<x2+y2){
		         System.out.println(x1+y1);
		     }
		     else{
		         System.out.println(x2+y2);
		     }
		}
	}
}
