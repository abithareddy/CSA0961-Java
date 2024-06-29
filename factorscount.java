class factors
{
 public static void main(String[] args)
 {
  int i,n=100,factors_count=0;
  
  for(i=1;i<=n;i++)
  {
   if(n%i==0)
   {
   factors_count++;
   }
  }
   System.out.println("\nNumber of factors = " + factors_count);
 }
}