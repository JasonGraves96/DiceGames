import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		int selection;
		do {
			
			System.out.println("\n\nWelcome to Jason Graves' Dice Game(s)! \nPress a key to do something..."
					+ "\n1.Roll a Die.\n2.Roll 1000 dice!\n3.Play Guess.\n4.Play Matador to 24."
					+ "\n5.Play Matador to 99.\n6.View the rules to Matador\nAnything else to quit.");
			selection = scnr.nextInt();
			switch(selection) {
			case 1:
				int result;
				Die die = new Die();
				result = die.Roll();
				die.Draw();
				try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
				System.out.println("\nYou rolled a "+result+".\n\n");
					try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			break;
			
			case 2:
				rollingAThousando();
			break;
			
			case 3:
				Guess.play();
			break;
			
			case 4:
				Matador.playShorter();
			break;
			
			case 5:
				Matador.play();
			break;
			
			case 6:
				Rules();
				try {Thread.sleep(4000);} catch (InterruptedException e) {e.printStackTrace();}
			break;
			
			default:
			break;
			
			}
		}while(selection > 0 && selection < 7 );
		
	}//end main
	
	public static void rollingAThousando() {
		int[] numberOfEach = new int[] {0,0,0,0,0,0};
		for(int i=0;i<1000;i++) {
			int value;
			Die die2 = new Die();
			value = die2.Roll();
			die2.Draw();
				try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			switch(value) {
				case 1:
					numberOfEach[0]++;
				break;
				case 2:
					numberOfEach[1]++;	
				break;
				case 3:
					numberOfEach[2]++;
				break;
				case 4:
					numberOfEach[3]++;
				break;
				case 5:
					numberOfEach[4]++;
				break;
				case 6:
					numberOfEach[5]++;
				break;
			}
		}
		System.out.println("\nYou rolled 1000 dice!\nThere were:\n"+numberOfEach[0]+"\t1's\n"
				+numberOfEach[1]+"\t2's\n"+numberOfEach[2]+"\t3's\n"
				+numberOfEach[3]+"\t4's\n"+numberOfEach[4]+"\t5's\n"
				+numberOfEach[5]+"\t6'es\n\n");
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//endRollingAThousando
	
	public static void Rules() {
		System.out.println("Here are the rules of Matador:\r\n"
				+ "\r\n"
				+ "The game is played between the player and the computer.\r\n"
				+ "The player's score and the computer's score each begin at 0.\r\n"
				+ "The object of the game is to be the first reach 99 points.\r\n"
				+ "The player and the computer take turns. On each turn:\r\n"
				+ "The player / computer chooses a number from 2 through 6\r\n"
				+ "prompt the player to enter their choice on the keyboard\r\n"
				+ "the computer should choose randomly\r\n"
				+ "The player / computer rolls two dice. Determine the results for the player / computer (depending on who is rolling):\r\n"
				+ "if a 1 appears on both dice, their score is reduced by 25 and it becomes the other's turn.\r\n"
				+ "if a 1 appears on only one die, nothing is added to their score and it becomes the other's turn.\r\n"
				+ "if a 1 does not appear on either die, the sum of the two dice is added to the roller's score.\r\n"
				+ "if their chosen number appears on only one die, they roll again.\r\n"
				+ "if their chosen number appears on both dice, they win.\r\n"
				+ "if their chosen number did not appear on either die, it becomes the other's turn. \r\n"
				+ "The first to reach a total score of 99 wins. Create output charting the progress of the game and the result."
				+"");
	}
}
