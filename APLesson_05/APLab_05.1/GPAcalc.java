import java.util.Scanner;
public class GPAcalc
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your letter grade in all 7 of your classes?");
		String science = keyboard.next();
		String math = keyboard.next();
		String english = keyboard.next();
		String history = keyboard.next();
		String language = keyboard.next();
		String compsci = keyboard.next();
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