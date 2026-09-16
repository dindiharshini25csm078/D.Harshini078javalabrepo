import java.util.*;
class marks
{
  public static void main (String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter your marks for each subject per 100:");
   System.out.println("maths:");
   int m=sc.nextInt();
   System.out.println("physics:");
   int p=sc.nextInt();
   System.out.println("chemistry:");
   int c=sc.nextInt();
   System.out.println("english:");
   int e=sc.nextInt();
   System.out.println("biologyy:");
   int b=sc.nextInt();
   int total=m+p+e+b+c;
   int average=total/5;
   System.out.println(" total marks:"+total);
   System.out.println(" total average:"+average);
  }
}   