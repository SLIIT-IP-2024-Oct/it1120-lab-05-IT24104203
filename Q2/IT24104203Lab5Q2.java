import java.util.Scanner;

public class IT24104203Lab5Q2 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("how many new members are introduced by the user? ");
	int members = input.nextInt();

	if (members == 1 || members == 2)
	{
	System.out.println("gift is a pen");
	}
	else if (members == 3 || members == 4)
	{
	System.out.println("gift is an umbrella");
	}
	else if (members == 5 || members == 6)
	{
	System.out.println("gift is a bag");
	}
	else if (members == 7)
	{
	System.out.println("gift is a traveling chair");
	}
	else if (members > 7)
	{
	System.out.println("gift is a headphone");
	}
	else
	{
	System.out.println("invalid input!");
	}
	}
}