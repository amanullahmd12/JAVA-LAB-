import java.util.*;
class A{
     void removeEvenLength(ArrayList<String> array) 
    {

        for (int i = 0; i < array.size(); i++) {
            String word = array.get(i);
            if (word.length() % 2 == 0) {
                array.remove(i);
                i--;
            }
        }
        for(String c:array)
        System.out.println(c);
        
    }
}
public class Collections
{
    public static void main(String args[])
    {
        ArrayList<String> arr=new ArrayList<String>();
         arr.add("java");
         arr.add("c++");
         arr.add("daa");
         arr.add("co");
         A obj= new A();
       obj.removeEvenLength(arr);
    }
}