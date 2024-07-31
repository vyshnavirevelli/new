import java.lang.*;
class overloaddemo
{
void test();
System.out.println("method with no parameters");
void test(int a)
{
System.out.println("a is " +a);
}
void test(int b)
{
System.out.println("b is " +b);
}
double test(double a)
{
System.out.println("a is" +a);
return a*a;
}
}
class overload
{
public static void maim(String args[])throws IOException
overloaddemo d1=new overload
o.test(10,20);
o.test(10);
double d=o.test(10.5);
}