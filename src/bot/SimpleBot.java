package bot;
import java.util.Scanner;

public class SimpleBot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		short botBirthYear = 2022;
		String personName;
		
		System.out.println("Hello! My name is Diaz. ");
		System.out.println("I was created in " + botBirthYear + ".");
		System.out.print("Please, remind me your name: ");
		personName = scanner.nextLine();
		System.out.println("What a great name you have, " + personName + "!");
		
		byte remainder3, remainder5, remainder7;
		System.out.println("Let me guess your age...");
		System.out.println("Enter remainders of dividing your age by: ");
		System.out.print("3 (Three): ");
		remainder3 = scanner.nextByte();
		System.out.print("5 (Five): ");
		remainder5 = scanner.nextByte();
		System.out.print("7 (Seven): ");
		remainder7 = scanner.nextByte();
		byte personAge = (byte) ((remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105);
		System.out.println("So... your age is " + personAge + ", right?");
		
		System.out.println("Now I will prove to you that I can count to any number you want");
		System.out.print("Tell me a number to count: ");;
		short numberToCount = scanner.nextShort();
		for (int i = 0; i <= numberToCount; i++) {
			System.out.print(i + " ");
		}
		
		scanner.close();
	}

}