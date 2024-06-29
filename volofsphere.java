import java.util.*;
class Volume
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  double pie,r,volume;
  System.out.println("enter r");
  r=sc.nextDouble();
  System.out.println("enter pie");
  pie=sc.nextDouble();
  volume=1.3*pie*r*r*r;
  System.out.println("volume of sphere:"+volume);
  }
}