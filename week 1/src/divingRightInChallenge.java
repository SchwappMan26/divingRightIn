import java.util.Scanner;
public class divingRightInChallenge 
{

	public static void main(String[] args) 
		{
			Scanner userImput = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = userImput.nextLine();
			System.out.println("What is your age?");
			int age = userImput.nextInt();
			System.out.println("what is your year of birth?");
			int yearOfBirth = userImput.nextInt();
			System.out.println("Nice to meet you "+name);
			System.out.println(" ");
			if (age<=16)
				{
					System.out.println("Oh that sucks");
				}
			else if (age>=17)
				{
					System.out.println("Good work being over 16");
				}
			System.out.println(" ");
			for (int i=0;i<=age;i++)
				{
					if (i==1)
						{
							System.out.println("In "+(yearOfBirth+i)+" you were "+i+ " year old ");
						}
					else 
						{
							System.out.println("In "+(yearOfBirth+i)+" you were " +i+ " years old ");
						}
				}
			System.out.println(" ");
			System.out.println("You are "+age*7+" years old in dog years");
		}
}
