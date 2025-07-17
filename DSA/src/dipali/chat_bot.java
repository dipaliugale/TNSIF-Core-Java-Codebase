package dipali;
import java.util.Scanner;

public class chat_bot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(":) Hello! I'm JavaBot. Ask me anything (type 'Bye' to exit");
		
		while(true) {
			System.out.println("You: ");
			String input = sc.nextLine().toLowerCase();
			
			if(input.contains("hi") || input.contains("Hello")) {
				System.out.println("JavaBot: Hello there! How can i help you?");
			}
			else if (input.contains("How are you")) {
				System.out.println("JavaBot: I'm just  code, but I'm doing great!");
			}
			else if (input.contains("name")) {
				System.out.println("JavaBot: I'm JavaBot, your friendly terminal assistant.");
			}
			else if (input.contains("Bye")) {
				System.out.println("JavaBot: GoodBye! have a great day.");
			}
			else {
				System.out.println("JavaBot: Sorry, I didn't understand that.");
			}
			
		}
			
		 

	}

}
