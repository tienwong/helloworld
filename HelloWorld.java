
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello Tien!");
		// This causes the system to print out "Hello Tien!"
		int myFirstNumber = (10 + 5) + (2 * 10);
		int mySecondNumber = 12;
		int myThirdNumber = myFirstNumber * 2;
		// On lines 6 through 8, three types of data are stored.
		// The 'int' part defines the data type as an integer.
		// 'my___Number' just names the data being stored
		// What comes after the equals sign assigns numeric value to that datum
		int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
		// This integer is defined as a summation of the above numbers
		int aThousandMinus = 1000 - myTotal;
		// This integer is defined as 1000 minus the summation of first-third #s
		System.out.println(aThousandMinus);
		// This causes the difference between 1000 and myTotal to be printed out
	}
}
