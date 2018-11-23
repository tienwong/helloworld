import java.util.Scanner;
public class YourWeightInKilograms {
	public static void main (String[] args) {
		System.out.println("Enter your weight in pounds.");
		Scanner user_input = new Scanner(System.in);
		double numberOfPounds;
		numberOfPounds = user_input.nextDouble();
		double numberOfKilograms = numberOfPounds * 0.45359237;
		System.out.println("You weigh " + numberOfKilograms + " kilograms.");
	}
}
