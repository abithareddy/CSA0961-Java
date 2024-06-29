import java.util.*;
class reversestring
{
 public static void main(String[] args)
 {
  String s1="welcome";
  String rev="";
  char ch;
  int n=s1.length();
  for(int i=n-1;i>=0;i--)
  {
   ch=s1.charAt(i);
   rev=rev+ch;
  }
   System.out.println("reversed string is:"+rev );
 }
}

  