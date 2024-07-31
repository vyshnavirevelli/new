class person{
String name;
int age;
int id;
person(String name,int age)
{
this.namw=name
this.age=age
}
void showdata()
{
System.out.println("name is" +name "age is" +age);
}
}
class student extends person
{
string name;
int age;
int id;
student(string name,int age,int id)
{
super(name,age);
this.id=id;
super.id=id;
}
void showdata2()
{
System.out.println("name is "+name"age is" +age"id is" +id);
}
}
class Inheritancedemo2
{
student s1=new student("manvi",20,577);
s1.showdata1();
s2.showdata2();
}
}