import java.util.*;
class Convert
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  double c,f;
  System.out.println("enter f");
  f=sc.nextDouble();
  c=(f-32)*0.5;
  System.out.println("farenheit to celsius:"+c);
  }
}