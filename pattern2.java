import java.util.*;
class patterns
{
 public static void main(String[] arg)
 {
  int i,j,n=5;
  for(i=1;i<=n;i++)
  {
   for (j=n;j>i;j--)
   {
    System.out.print(" ");
   }
     for(j=1;j<=2*i-1;j++)
    {
    System.out.print("*");
    }
    System.out.println( );
  }
 }
}
