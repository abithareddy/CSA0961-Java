class A extends Thread
{
 public void run()
 {
  for(int i=1;i<=5;i++)
  {
   System.out.println(9+"*"+i+"="+(i*9));
  }
 }
}
class B extends Thread
{
 public void run()
 {
  for(int i=1;i<=5;i++)
  {
   System.out.println(11+"*"+i+"="+(i*11));
  }
 }
}
class TableTest
{
 public static void main(String args[])
 {
  A obj1=new A();
  B obj2=new B();
  obj1.start();
  obj2.start();
 }
}

  