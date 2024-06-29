import java.util.*;
class index
{
 public static void main(String[] arg)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the string s1:");
  String s1=sc.nextLine();
  
  char ch ='p';
  int index=-1;
  for(int i=0;i<s1.length();i++)
  {
   if(s1.charAt(i)==ch)
   {
    index=i;
    break;
   }
  }
 if(index!=-1)
 {
  System.out.println("character'"+ch+"'is present at index"+index);
 }
  else
  {
  System.out.println("character'"+ch+"'is not present in string");
  }
 }
}
  
  

  
