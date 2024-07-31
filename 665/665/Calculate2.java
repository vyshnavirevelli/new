import java.lang.*;
class Rectangle
{
static int area(int x,int y)
int z;
z=x*y;
return z;
}
int perimeter(int x,int y)
int z;
z=2(x+y);
return z;
}
class Calculate2
{
public static void main(String args[])
{
int a=10,b=20,c;
Rectangle r=new Rectangle();
c=r.area(a,b);
System.out.println("the area of rectangle is" +c);
c=r.perimeter(a,b);
System.out.println("the perimeter of rectangle is" +c);
}
}
