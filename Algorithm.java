import java.util.*;

public class algorithm {
	
	public void greetings() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please Enter Your Name >>> ");
		String name = in.next();
		
		name = name.toLowerCase();
		
		System.out.print("Hello ! "+name+" Lets Play Rock Paper Scissors");
		System.out.println();
	}
	
	public void toStart(String choice) {
		Random rn = new Random();
		int temp = rn.nextInt((3-1)+1) + 1;
		switch(temp) {
		
		case 1: 
			if(choice.toLowerCase() == "rock") {
				System.out.println("Computer Choose >>> rock");
				System.out.println("Congrats you won !");
			}
			else {
				System.out.println("Computer Choose >>> rock");
				System.out.println("Sorry You Lose");
			}
			break;
			
		case 2:
			if(choice.toLowerCase() == "rock") {
				System.out.println("Computer Choose >>> rock");
				System.out.println("Congrats you won !");
			}
			else {
				System.out.println("Computer Choose >>> rock");
				System.out.println("Sorry You Lose");
			}
			break;
			
		case 3:
			if(choice.toLowerCase() == "rock") {
				System.out.println("Computer Choose >>> rock");
				System.out.println("Congrats you won !");
			}
			else {
				System.out.println("Computer Choose >>> rock");
				System.out.println("Sorry You Lose");
			}
			break;
		
		default:
			System.out.println("Invalid Choice ! Please Try again...");		
		}
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		algorithm add = new algorithm();
		
		add.greetings();
		
		System.out.print("Enter you choice [rock,paper,scissors] >>> ");
		String choice = in.next();
		
		add.toStart(choice);
	}
}