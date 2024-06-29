import java.util.*;
class Interest
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  double p,t,r,si;
  String seniorcitizen;
  System.out.println("enter p");
  p=sc.nextDouble();
  System.out.println("enter t");
  t=sc.nextDouble();
  System.out.println("are you a seniorcitizen(yes/no)");
  seniorcitizen=sc.next();
  if(seniorcitizen.equals("yes"))
  {
   r=12;
  }
  else
   {
    r=10;
   }
 si=(p*t*r)/100;
 System.out.println("simple interest:"+si);
 }
}