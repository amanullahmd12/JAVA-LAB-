

class Command {
	public static void main(String[] args)
	{
	
		if (args.length > 0) {
			System.out.println("Arguments are : ");

			for (String s : args)
				System.out.println(s);
		}
		else
			System.out.println("No command line found.");
	}
}

