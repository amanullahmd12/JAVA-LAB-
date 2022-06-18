 class StaticExample
{
int a;
Static int b;
void get(int p)
{
  a=p;
  b++;
} 
void display()
{
 System.out.println("value of a = "+ a);
 System.out.println("value of b = "+ b);
}
public.static.void.main(String args[])
{ 
 StaticExample a1=new StaticExample();
 StaticExample a2=new StaticExample();
 StaticExample a3=new StaticExample();
 StaticExample a4=new StaticExample();
 a1.get(10);
 a1.disp();
 a2.get(23);
 a2.disp();
 a3.get(45);
 a3.disp();
 a4.get(89);
 a4.disp();
}
}