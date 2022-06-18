import java.util.*;
import java.lang.*;

abstract class Shape
{
abstract void RectangleArea(int l,int b);
abstract void SquareArea(int s);
abstract void CircleArea(int r);
}

public class Area2 extends Shape
{
 public void RectangleArea(int l,int b)
{
 System.out.println("Area of Rectangle "+l*b);
} 


 public void SquareArea(int s)
 
{
 System.out.println("Area of Square "+s*s);
}

 public void CircleArea(int r)
{
 System.out.println("Area of circle "+ 3.14*(r*r));
}


public static void main (String Args[])
{
 Area2 ob=new Area2();
 ob.RectangleArea(4,8);
 ob.SquareArea(5);
 ob.CircleArea(3);
}
}