/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++){
		    String s = read.next();
		    String ans = "yes";
		    for(int j=0; j<s.length(); j=j+2){
		        Character c1 = s.charAt(j);
		        Character c2 = s.charAt(j+1);
		        if(c1.equals(c2)){
		            ans = "no";
		            break;
		        }
		    }
		    System.out.println(ans);
		}
		     
		   
		
	}
}
