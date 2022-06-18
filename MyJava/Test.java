import java.util.*;

class MyThreads extends Thread
{
public void run()
{
 int i=1;
 while(true)
{
 
 System.out.println ("Hello");

 i++;
}
}

}

class Test 
{

public static void main(String args[])
{  
 
 MyThreads t = new MyThreads();
 t.start();

 int i=1;
 while(true)
 {
 System.out.println ("Hello");
 i++;
}

}

}
