 import java.util.*;
 class area
 {
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   String s1;
   System.out.println("enter s1:");
   s1=sc.nextLine();
   int n=s1.length();
   String s=s1.toLowerCase();
   int count=0;
   for(int i=0;i<n;i++)
   {
    char ch=s.charAt(i);
    if(!(ch>='a' && ch<='z')&& !(ch>='0' && ch<='9')&& !(ch==' '))
    {
     count++;
    }
  }
 System.out.println(count);
 }
}
   