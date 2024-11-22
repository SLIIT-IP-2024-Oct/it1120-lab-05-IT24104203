import java.util.Scanner;

public class IT24104203Lab5Q1 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("enter a number: ");
	int no1 = input.nextInt();

	System.out.println("enter another number: ");
	int no2 = input.nextInt();

	System.out.println("enter another number: ");
	int no3 = input.nextInt();

	if (no1 == no2)
	{
	System.out.println("error, two or more inputs are equal!");
	}
	else if (no1 == no3)
	{
	System.out.println("error, two or more inputs are equal!");
	}
	else if (no2 == no3)
	{
	System.out.println("error, two or more inputs are equal!");
	}

	else
	{

		if (no1 > no2) 
		{
			if (no3 > no1) 
			{	
			System.out.println("largest number is " + no3);
			System.out.println("smallest number is " + no2);
			}
			else if (no3 > no2)
			{
			System.out.println("largest number is " + no1);
			System.out.println("smallest number is " + no2);
			}
			else 
			{
			System.out.println("largest number is " + no1);
			System.out.println("smallest number is " + no3);
			}
		}
		else 
		{
			if (no3 > no2)
			{
			System.out.println("largest number is " + no3);
			System.out.println("smallest number is " + no1);
			}
			else 
			{
				if (no3 > no1)
				{
				System.out.println("largest number is " + no2);
				System.out.println("smallest number is " + no1);
				}
				else
				{
				System.out.println("largest number is " + no2);
				System.out.println("smallest number is " + no3);
				}
			}	
		}	
	}
	}
}