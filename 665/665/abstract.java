import java.lang.*;
abstract class shape
{
abstract void area();
{
class Rectangle extends shape
{
double a,b;
Rectangle(double a,double b)
{
this.a=a;
this.b=b;
}
}
void area()
{
System.out.println("area of Rectangle is" +(a*b));
}
}
class Circle extends shape
{
double a;
Circle(double a)
{
this.a=a;
}
void area()
{
System.out.println("area of the Circle" +(3.14*a*a));
}
}
class Triangle extends shape
{
double a,b;
Triangle(double a,double b)
{
this.a=a;
this.b=b;
}
void area()
{
System.out.println("area of the triangle is"+(0.5*a*b));
}}
class abstract
{
public static void main(String args[])
{
Rectangle r=new Rectangle(10,20);
Circle c=new Circle(10);
Triangle t=new Triangle(10,20);
r.area();
c.area();
t.area();
}
}
