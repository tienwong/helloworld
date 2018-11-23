import java.util.Scanner;
public class DateConverter {
	public static void main (String[] args) {
		System.out.println("Enter the present year.");
			Scanner inputYear = new Scanner(System.in);
			int theYear;
			theYear = inputYear.nextInt();
		System.out.println("Enter the name of the present month.");
			Scanner inputMonth = new Scanner(System.in);
			String theMonth;
			theMonth = inputMonth.next();
		System.out.println("Enter the numeric value of the day of the present month.");
			Scanner inputDate = new Scanner(System.in);
			int theDate;
			theDate = inputDate.nextInt();
		System.out.println("Today's date in the American dating system: " + theMonth + " " + theDate + ", " + theYear);
		System.out.println("Today's date in the British dating system: " + theDate + " " + theMonth + " " + theYear);
	}
}
