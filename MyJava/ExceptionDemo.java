

import java.util.*;

class NameDataException extends Exception 
{
  public String toString()
 {
   return "First Letter of name must be in Capital Letter ";
 }
}


class EmployeeIdDataInRangeException extends Exception
{
  public String toString()
 {
   return "Employee id should be between 2001 and 5001 ";
 }
}


class DepartmentEmployeeIdDataInRangeException extends Exception
{
  public String toString()
 {
   return "Department id should be an integer between 1 and 5";
 }
}


 public class ExceptionDemo
{

 static void EgetData(int e_Id) throws EmployeeIdDataInRangeException
{
 if(e_Id > 2001 && e_Id < 5001)
{
  throw new EmployeeIdDataInRangeException();
} 
 else
{
 System.out.println("Employee Id : "+e_Id);
}

}

static void DgetData(int d_Id) throws DepartmentEmployeeIdDataInRangeException
{
 if(d_Id < 1 && d_Id > 5)
{
  throw new DepartmentEmployeeIdDataInRangeException();
} 
 else
{
 System.out.println("Employee Departmemt Id : "+d_Id);
}


}
public static void main(String args[])
{ 
 Scanner sc= new Scanner(System.in);
try
{
 int employee_Id;
 System.out.println("Enter Employee Id");
 employee_Id=sc.nextInt();
 EgetData(employee_Id);
} 
 catch(EmployeeIdDataInRangeException e){
 System.out.println(e);
}

 String name;
 System.out.println("Enter Employee Name");
 name = sc.nextLine();

try{
 int dept_Id;
 System.out.println("Enter Employee Department Id");
 dept_Id =sc.nextInt();
 DgetData(dept_Id);
}
catch(DepartmentEmployeeIdDataInRangeException e)
{
 System.out.println(e); 
}
}
}
 