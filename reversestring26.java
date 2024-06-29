import java.util.scanner;
class revstring
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the word to be reversed:");
  String s1=Scanner.next();
  String rev=reverseString(s1);
  System.out.prinln("after reversing:"+rev);
 }
public static String reverseString(String s1);
{
 String rev="";
 for(int i=s1.length()-1;i>=0;i--)
 {
  rev+=s1.charAt(i);
 }
  return rev;
 } 
}

  

 
