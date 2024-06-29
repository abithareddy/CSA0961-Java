import java.util.*;
class palindrome
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int no,rem,rev=0;
  System.out.println("enter no");
  no=sc.nextInt();

   while (no>0)
   {
    rem=no%10;
    rev=(rev*10)+rem;
    no=no/10;
   }
   System.out.println("reversed number:"+rev);
 if(no==rev)
    System.out.println("it is palindrome");
 else
    System.out.println("not a palindrome");
 }
}