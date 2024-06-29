import java.util.*;
class factors
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int i,n;
  System.out.println("enter n");
  n=sc.nextInt();
  for(i=1;i<=n;i++)
  { 
   if (n%i==0)
   {
    System.out.println("the factors are:"+i);
   }
  }
 }
}
