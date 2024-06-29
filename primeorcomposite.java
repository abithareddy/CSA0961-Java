
import java.util.*;
class prime
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int i,n;
  System.out.println("enter n");
  n=sc.nextInt();
  for(i=2;i<n;i++)
  { 
   if (n%i!=0)
   {
    System.out.println("prime:");
   break;
   }
   else
   {
    System.out.println("composite:");
   break;
   }
  }
 }
}
  

 