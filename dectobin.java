import java.util.*;
class dtb
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int n;
  System.out.println("enter decimal number:");
  n=sc.nextInt();
  int b=0;
  int c=0;
  while(n!=0)
  {
   b+=(n%2)*Math.pow(10,c);
   n/=2;
   c++;
  }
 System.out.println("binary value:"+b);
 sc.close();
 }
}
  
  