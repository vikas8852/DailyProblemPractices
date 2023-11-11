/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
      public static long sum(long n){
        long s =0;
        while(n>0)
        {
            
            s=s+n%10;
            n=n/10;
        }
        return s;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
     		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int c=0,m=0;
		    for(int i =0;i<n;i++){
		        long a = sc.nextInt();
		        long b = sc.nextInt();
		        long ch = sum(a);
		        long mo = sum(b);
		        if(ch>mo)
		        c++;
		        else if(ch==mo)
		        {
		            c++;
		            m++;
		        }
		        else
		        m++;
		    }
		    if(c>m)
		    System.out.println(0+" "+c);
		    else if(m>c)
		    System.out.println(1+" "+m);
		    else
		    System.out.println(2+" "+m);
		    }
		    
	}
}
