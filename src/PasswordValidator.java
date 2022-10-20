import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);

		System.out.print("Create a password 7-12 characters long and contains "
				+ "at least one lowercase and an uppercase letter and an exclamation mark: ");
		String input = scnr.nextLine();
		int inputLength = input.length();

		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				hasUpperCase = true;
			} else if (Character.isLowerCase(input.charAt(i))) {
				hasLowerCase = true;
			}
		}

		if (hasUpperCase == true && hasLowerCase == true && inputLength >= 7 && inputLength <= 12
				&& input.contains("!"))
			System.out.println("Password valid and accepted");
		else {
			System.out.println("Error");
		}

	}
}
