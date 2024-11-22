import java.util.Scanner;

public class IT24104203Lab5Q3 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("reservation starts from ");
	int first = input.nextInt();

	System.out.print("to ");
	int last = input.nextInt();

	if (31 > first && first >= 1 && 31 >= last && last > 1 && 31 > (last - first) && (last - first) > 0)
	{
	int days = last - first;
		if (3 > days)
		{
		System.out.println("your amount is " + (days * 48000));
		}
		else if (days == 3 || days == 4)
		{
		System.out.println("your amount is " + (days * 48000 * 0.9));
		}
		else if (days > 5)
		{
		System.out.println("your amount is " + (days * 48000 * 0.8));
		}
	}
	
	else
	{
	System.out.println("something is wrong, try again!");
	}
	}
}