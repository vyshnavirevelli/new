import java.lang.*;
class A
{
void display()
{
System.out.println("inside class A");
}
}
class B extends A
{
void display()
{
System.out.println("inside class B");
}
}
class C extends A
{
void display()
{
System.out.println("inside class C");
}
}
class overriding
{
public static void main(String args[])
{
A a=new A();
B b=new B();
C c=new C();
A r;
r=a;
r.display();
r=b;
r.display();
r=c;
r.display();
}
}