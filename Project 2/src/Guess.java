import java.util.Random;
import java.util.Scanner;

public class Guess {
	public static void play() {
	System.out.println("\n\nGuess a number between 2 and 12!");
	int roll1,roll2,difference,total,guess,counter =0;
	boolean ender = false, winner = false;
	
	Scanner scnr = new Scanner(System.in);
	guess = scnr.nextInt();
	
	do {
		Die sixer = new Die();
		roll1 = sixer.Roll();
		sixer.Draw();
		
		roll2 = sixer.Roll();
		sixer.Draw();
		
			try {
				Thread.sleep(850);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		total = roll1+roll2;
		difference = Math.abs(total-guess);
	
		if(difference !=0) {
			System.out.print("You rolled "+roll1+" & "+roll2+" which was "+difference+" away from your guess of "+guess);
				if(guess > 12 || guess < 2)System.out.print(" which is literally impossible....");
			System.out.print("\n\n");
			counter++;
			if(counter == 3)
				ender = true;
			}
		else {
			System.out.println("\nYou guessed "+guess+" and it was "+total+"!\n\n");
			ender = true;
			winner = true;
		}
		
		try {
			Thread.sleep(2550);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}while(ender == false);
	if(winner == true) {
	System.out.println(" /$$     /$$ /$$$$$$  /$$   /$$       /$$      /$$  /$$$$$$  /$$   /$$ /$$ /$$ /$$");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("|  $$   /$$//$$__  $$| $$  | $$      | $$  /$ | $$ /$$__  $$| $$$ | $$| $$| $$| $$");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println(" \\  $$ /$$/| $$  \\ $$| $$  | $$      | $$ /$$$| $$| $$  \\ $$| $$$$| $$| $$| $$| $$");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("  \\  $$$$/ | $$  | $$| $$  | $$      | $$/$$ $$ $$| $$  | $$| $$ $$ $$| $$| $$| $$");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("   \\  $$/  | $$  | $$| $$  | $$      | $$$$_  $$$$| $$  | $$| $$  $$$$|__/|__/|__/");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("    | $$   | $$  | $$| $$  | $$      | $$$/ \\  $$$| $$  | $$| $$\\  $$$            ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("    | $$   |  $$$$$$/|  $$$$$$/      | $$/   \\  $$|  $$$$$$/| $$ \\  $$ /$$ /$$ /$$");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("    |__/    \\______/  \\______/       |__/     \\__/ \\______/ |__/  \\__/|__/|__/|__/\n\n");
		try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	else {
		System.out.print("\nYou lose");
		try {Thread.sleep(350);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.print(".");
		try {Thread.sleep(350);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.print(".");
		try {Thread.sleep(350);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.print(".");
		try {Thread.sleep(350);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.print(".\n\n");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
	System.out.println("\n");
		
	}
	}

}
