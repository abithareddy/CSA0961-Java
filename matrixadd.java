import java.util.*;
class matrixadd
{
 public static void main(String[] args)
 {
  int a[][]={{1,2,3},{4,5,6},{1,2,6}};
  int b[][]={{1,1,1},{1,1,1},{1,1,1}};
  int c[][]=new int[3][3];
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
    c[i][j]=a[i][j]+b[i][j];
    System.out.print(c[i][j] + " "); // print the element
   }
   System.out.println(); // print a newline after each row
  }
 }
}
