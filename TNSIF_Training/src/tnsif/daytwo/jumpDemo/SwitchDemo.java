package tnsif.daytwo.jumpDemo;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput = 4;
		
		switch(userInput)
		{
		case 1: System.out.println("Current recharge details.");
		break;
		
		case 2: System.out.println("Current reacharge expiry.");
		break;
		
		case 3: System.out.println("New offers!!!");
		break;
		
		case 4:System.out.println("Talk to your customer support person.");
		break;
		
		default :
			System.out.println("Is not valid input given by you.");
			break;
		}

	}

}
