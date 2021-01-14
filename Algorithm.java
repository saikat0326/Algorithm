import java.util.*;

public class Algorithm {
	
	public void greetings() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please Enter Your Name >>> ");
		String name = in.next();
		
		name = name.toLowerCase();
		
		System.out.print("Hello ! "+name+" Lets Play Addition++");
		System.out.println();
	}
	
	public void toGenerate() {
		Scanner in = new Scanner(System.in);
		
		Random rn = new Random();
		int num1 = rn.nextInt((99-1)+1) + 1;
		int num2 = rn.nextInt((99-1)+1) + 1;
		int sum = num1+num2;
		
		System.out.println(num1+" + "+num2+" = ");
		int answer = in.nextInt();
		
		if(answer == sum)
			System.out.println("Congratulation Correct Answer !");
		else
			System.out.println("Wrong Answer");
		
		System.out.println();
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Algorithm add = new Algorithm();

		add.greetings();
		
		while(true) {
			add.toGenerate();
			
			System.out.println("Press Y to Play Again or N to Quit >>> ");
			String choice = in.nextLine();
			
			if(choice.toLowerCase().equalsIgnoreCase("y"))
				continue;
			else
				break;
		}
	}
}