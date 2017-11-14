import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello ASE2017 - How are you now? :)");

		System.out.print("Please enter your name: ");
		String name = scanner.next();

		HelloUser hello = new HelloUser(name);
		hello.greetUser();
	}

}
