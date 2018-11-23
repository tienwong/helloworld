import java.util.Scanner;
public class YourNameIs {
	public static void main(String[] args) {
		System.out.println("Enter your first name.");
			Scanner first_nameInput = new Scanner(System.in);
			String firstName;
			firstName = first_nameInput.next();
		System.out.println("Enter your last name.");
			Scanner last_nameInput = new Scanner(System.in);
			String lastName;
			lastName = last_nameInput.next();
		System.out.println("Hello, " + firstName + " " + lastName + ". " + "It's nice to meet you!");
	}
}
