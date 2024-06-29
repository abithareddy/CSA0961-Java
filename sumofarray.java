import java.util.scanner;
class sumofnumbers
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int n=Scanner.nextInt();
  int[]numbers=new int[n];
  for(int i=0;i<n;i++)
  {
   numbers[i]=scanner.nextInt();
  }
   int sum=0;
   for(int i=0;i<n;i++)
   {
    sum+=numbers[i];
   }
    System.out.println(sum);
 }
}

