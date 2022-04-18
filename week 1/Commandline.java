/* Question 1: Write a java program to take input as a command line argument. Your name, course, universityrolino and

semester. Display the information.

Name: University RollNo:

Course:

Semester*/



class CommandLine {
	public static void main(String[] args)
	{
	String name, roll, course, Semester;
		if (args.length > 0) {
                    
			System.out.println("Arguments are : ");
			
	name=args[0];
	roll=args[1];
	course=args[2];
    Semester=args[3];

	System.out.println("Name :"+name);
	System.out.println("UniversityRoll :"+roll);
	System.out.println("Course :"+course);
        System.out.println("Semester :"+Semester);
        }

		else{
			System.out.println("No command line found.");
	}
}
}

