class area
{
 double r;
 void get()
 {
  r=3;
 }
}
class sphere extends shape
{
 double A,V;
 void cal()
 {
  A=4*3.14*r*r;
  v=(4/3)*3.14*r*r*r;
  system.out.println("area of sphere:",A);
  system.out.println("volume of sphere:",V);
}