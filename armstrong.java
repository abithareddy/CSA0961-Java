import java.util.*;
class Armstrong
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int n,rev=0,rem,temp;
  System.out.println("enter n");
  n=sc.nextInt();
  temp=n;
  while (n!=0)
  {
   rem=n%10;
   rev=(rev*10)+(rem*rem*rem);
   n=n/10;
  }
    if(temp==rev)
   {
    System.out.println("it is armstrong");
   }
   else
   {
   System.out.println("not armstrong");
   }
 }
}

   
   