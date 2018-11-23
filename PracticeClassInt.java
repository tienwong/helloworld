
import java.util.Scanner;
public class PracticeClassInt {
// The program will ask for my age.
// Once the program obtains my age, it will output the ages of my mom and dad.
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter your age.");
		int myAge;
		myAge = user_input.nextInt();
		
		
		int myDadsAge = myAge + 26;
		int myMomsAge = myAge + 35;
		System.out.println("Tien, your age is " + myAge);
		System.out.println("Your dad's age is " + myDadsAge);
		System.out.println("Your mom's age is " + myMomsAge);
	}

}
