import java.util.*;
class stringreplace
{
 public static void main(String[] arg)
 {
  Scanner sc=new Scanner(System.in);
  int i;
  System.out.println("enter the string s1:");
  String s1=sc.nextLine();
  String s2=s1.replace("e","o");
  i=s1.length();
  String s3=s1.toUpperCase();
  
  System.out.println("after replacing:"+s2);
  System.out.println("length of string is:"+i);
  System.out.println("uppercase is:"+s3);
 }
}
  
  
