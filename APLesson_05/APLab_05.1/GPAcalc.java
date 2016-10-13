import java.util.Scanner;
public class GPAcalc
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your letter grade in science?");
		String science = keyboard.next();
		System.out.println("What is your letter grade in math?");
		String math = keyboard.next();
		System.out.println("What is your letter grade in english");
		String english = keyboard.next();
		System.out.println("What is your letter grade in history?");
		String history = keyboard.next();
		System.out.println("What is your letter grade in language");
		String language = keyboard.next();
		System.out.println("What is your letter grade in compsci?");
		String compsci = keyboard.next();
		System.out.println("What is your letter grade in your elective?");
		String elective = keyboard.next();
		
		double gPoints = calcPoints(science) + calcPoints(math) + calcPoints(english) + calcPoints(history) +calcPoints(language) +calcPoints(compsci) + calcPoints(elective);
		
		double gpa = gPoints/7;
		
		System.out.printf("\nYour GPA is %2.1f", gpa);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		else
			return 0.0;	
	}
}