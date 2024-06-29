import java.util.*;
class skip
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int m,n,k,i;
  System.out.println("enter m");
  m=sc.nextInt();
  System.out.println("enter n");
  n=sc.nextInt();
  System.out.println("enter k");
  k=sc.nextInt();
  for(i=m;i<=n;i+=k)
  {
   System.out.println(i);
  }
 }
}  
   