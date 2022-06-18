
import java.util.*;

interface DemoInterface
{
 void volume();
 double pie=3.14 ;
}

class cone implements DemoInterface
{
 double r=0.00;
 double h=0.00;
 public void volume()
{
 double v =(pie*(r*r)*h)/3;
 System.out.println("Volume of cone : "+v);
}

}

class hemisphere implements DemoInterface
{
 double r=0.00;
 public void volume()
{
 double v =0.666*(pie*(r*r*r));
 System.out.println("Volume of Hemisphere : "+v);
}
}

class sphere implements DemoInterface
{
 double r=0.00;
 double h=0.00;
 public void volume()
{
 double v =pie*(r*r)*h;
 System.out.println("Volume of Sphere : "+v);

}
}

class Volume
{
public static void main(String []k)
{
 Scanner sc=new Scanner(System.in);

 cone c = new cone();
System.out.println("Enter Radius of cone :");
 c.r=sc.nextDouble();
System.out.println("Enter Height of cone :");
 c.h=sc.nextDouble();
 c.volume();

 hemisphere hs =new hemisphere();
 System.out.println("Enter Radius of Hemisphere :");
 hs.r=sc.nextDouble();
 hs.volume();

 sphere s= new sphere();
 System.out.println("Enter radius of sphere:");
 s.r=sc.nextDouble();
 System.out.println("Enter heiight of cone :");
 s.h=sc.nextDouble();
 s.volume();
}
}
