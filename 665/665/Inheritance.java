import java.lang.*;
class A
{
int a=27,b=2;
void getdetails()
{
System.out.println("a is "+a);
System.out.println("b is "+b);
}
}
class B extends A
{
void sum()
{
int add;
add=a+b;
System.out.println("sum is" +add);
}
}
class Inheritance
{
public static void main(String args[])
{
B b1=new B();
b1.getdetails();
}
}
