  import java.util.*;
  class Primepalindrome
  {
   boolean pri(int n)
   {
     int count=0;
	 for(int i=1;i<n;i++)
	 {
	   if(n%i==0)
	   count++;
	  }
	   return count==2;
	  }
	   boolean pal(int n)
	   { 
	     int rem=0,res=0,temp=n;
		 while(n>0)
		 {
		   rem=temp%10;
		   res=rem*10+rem;
		   temp/=10;
		  }
		 return res==n;
		}
	}
	class prime
	{
	 public static void main(String args[])
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number:");
	   int n=sc.nextInt();
	   Primepalindrome p=new Primepalindrome();
	   if(p.pri(n) && p.pal(n))
	   {
	    System.out.println("it is a primepalindrome:");
	   }
		else
		{
		 System.out.println("it is not a primepalindrome:");
		}
	}
}      