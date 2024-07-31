import java.lang.*;
class factorial
{
int fact(int n)
{
if(n==1)
{
return 1;
}
else
{
return n*fact(n-1);
}
}
}
class factorialdemo
{
public static void main(String args[])
{

factorial s=new factorial();
int x=s.fact(5);
System.out.println(+x);
}
}
