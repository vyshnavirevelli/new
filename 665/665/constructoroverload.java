import java.lang.*;
class box
{
double width,height,length;
box()
{
width=height=length=-1;
}
box(double width,double height,double length)
{
this.width=width;
this.height=height;
this.length=length;
}
box(double side)
{
width=height=length=side;
}
double volume()
{
return width*height*length;
}
}
class Constructoroverload
{
public static void main(String args[])
{
box b1=new box();
box b2=new box(10,20,30);
box cube=new box(10);
System.out.println(b1.volume());
System.out.println(b2.volume());
System.out.println(cube.volume());
}
}