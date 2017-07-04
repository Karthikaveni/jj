import java.util.*;
import java.io.*;                                                                                                                                        import java.util.*;

public class PowerNumber1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
long n,p,r=1;
System.out.println("Enter Number");
n=sc.nextLong();
System.out.println("Enter Power");
p=sc.nextLong();
if(n>=0&&p==0)
{
  
  r=1;
  }
  else if(n==0&&p>=1)
  {
    
    r=0;
  }
  else{
    
    for(int i=1;i<=p;i++)
    {
      
      r=r*n;
      
      }
      
      }
      
      System.out.println(n+"^"+p+"="+r);
      
      }
      
      }

    
