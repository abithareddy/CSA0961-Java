System.out.println("enter the string s1:");
 String s1="lool";
 String rev="";
 char ch;
 int n=s1.length();
 for(int i=n-1;i>=0;i--)
 {
  ch=s1.charAt(i);
  rev=rev+ch;
 }
  if (rev.equals(s1))
  {
   System.out.println(s1 +"is a palindrome");
  }
   else
   {
    System.out.println(s1 +"not a palindrome");
   }
 }
}
