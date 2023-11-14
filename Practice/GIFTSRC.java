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
		    int x=0,y=0;
		    for(int j=0;j<n;j++){
                if(j>0){
                    if(s.charAt(j)=='L' && s.charAt(j-1)=='L'){
                        continue;
                    }
                    else if(s.charAt(j)=='L' && s.charAt(j-1)=='R'){
                        continue;
                    }
                    else if(s.charAt(j)=='R' && s.charAt(j-1)=='R'){
                        continue;
                    } else if(s.charAt(j)=='R' && s.charAt(j-1)=='L'){
                        continue;
                    }
                    else if(s.charAt(j)=='U' && s.charAt(j-1)=='U'){
                        continue;
                    }
                    else if(s.charAt(j)=='U' && s.charAt(j-1)=='D'){
                        continue;
                    }
                    else if(s.charAt(j)=='D' && s.charAt(j-1)=='D'){
                        continue;
                    }else if(s.charAt(j)=='D' && s.charAt(j-1)=='U'){
                        continue;
                    }
                    else if(s.charAt(j)=='L'){
                        x = x-1;
                    }else if(s.charAt(j)=='R'){
                        x = x+1;
                    }else if(s.charAt(j)=='U'){
                      y=y+1;
                    }else if(s.charAt(j)=='D'){
                        y=y-1;
                    }
                }
                 else{
                     if(s.charAt(j)=='L'){
                        x = x-1;
                    }
                     else if(s.charAt(j)=='R'){
                        x = x+1;
                    }
                     else if(s.charAt(j)=='U'){
                        y=y+1;
                    }
                     else if(s.charAt(j)=='D'){
                        y=y-1;
                    }
                }
            }
            System.out.println(x + " " + y);

		}
	}
}
