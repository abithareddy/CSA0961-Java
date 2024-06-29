import java.util.*;
class btd
{
 public static void main(String[] args)
 {
  int b=1010;
  int decimal=0;
  int base=1;
  while(b>0)
  {
   int rem=b%10;
   b=b/10;
   decimal=decimal+rem*base;
   base=base*2;
  }
 System.out.println("decimal digit:"+decimal);
 }
}
