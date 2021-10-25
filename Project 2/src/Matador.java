import java.util.Random;
import java.util.Scanner;

public class Matador {
	static boolean insta = false;
	public static void play(){
		int userScore=0,cpuScore=0,currentNumber = 0,roll1,roll2,turnResult;
		intro();
		Die sixer = new Die();
		boolean gameOver = false, turn = true, winner = true;
		Scanner scnr = new Scanner(System.in);
		
		
		do {
			Random rand = new Random();
			
			if(turn==true)
			System.out.println("\nPick a number 2-6");
			else {
			System.out.println("It is The Matador's turn.");
			}
			
			if(turn==true) {
				try {
					currentNumber = scnr.nextInt();
				}catch(Exception ime) {System.out.println("congrats you broke the program! numbers only next time!!!");
				try {Thread.sleep(1800);} catch (InterruptedException e) {e.printStackTrace();}};
				while(currentNumber <2 || currentNumber > 6){
					System.out.println("follow the rules please!");
					currentNumber = scnr.nextInt();
				}
			}
				
			else {
				currentNumber = (rand.nextInt(5))+2;
				System.out.println("\nThe Matador guesses "+currentNumber+".\n");
				try {Thread.sleep(750);} catch (InterruptedException e) {e.printStackTrace();}
			}
			
			roll1 = sixer.Roll();
			sixer.Draw();
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			roll2 = sixer.Roll();
			sixer.Draw();
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			turnResult = checkConditions(roll1,roll2,currentNumber);
			try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
			switch(turnResult) {
			
				case 1:
					
					if(turn == true) {
						userScore=userScore-25;
						System.out.println("\nSnake eyes......\n25 points will be subtracted from your score...");
					}
						
					else {
						cpuScore=cpuScore-25;
						System.out.println("\nSnake eyes!\nKaching!\nNow The Mattador loses 25 points!!!!");
					}
						
					turn = !turn;
				break;
				
				case 2:
					if(turn==true)
						System.out.println("\nAw shucks. \nYou rolled a 1.\nUnfortunatly no points are gained, and you lose your turn....");
					else
						System.out.println("\nNice!\nSince The Matador rolled a 1, you get your turn back!");
					
					turn=!turn;
				break;
				
				case 3:
					if(turn==true) {
						userScore = userScore + roll1 + roll2;
						if(userScore < 99)
						System.out.println("\nGreat galloping ghosts!?!\nBecause your chosen number was rolled,\nYou get another turn!!!");
					}
					else {
						cpuScore = cpuScore + roll1 + roll2;
						if(cpuScore < 99)
						System.out.println("\nOh no?!? \nThe Matador managed to correctly guess one of his rolls.\nMeaning he gets to go again...");
					}
					
				break;
				
				case 4:
					gameOver= true;
					if(turn == false)
						winner = false;

				if(winner ==true) {
					System.out.print("YOU HAVE DONE THE");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print(" I");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("M");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("P");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("O");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("S");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("S");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("I");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("B");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("L");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("E\n");
					try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.println("BOTH of your rolls were the guessed number!?!?");
					insta = true;
				}else{
					System.out.println("Bad luck. The Matador guessed both rolls.... \nIt's all over\n");
				}
					
				break;
				
				case 5:
					if(turn==true) {
						userScore = userScore + roll1 + roll2;
						if(userScore < 99)
						System.out.println("\nOk. You get your points.\nBut it is now The Matador's turn...");
					}
						
					else {
						cpuScore = cpuScore + roll1 + roll2;
						if(cpuScore<99)
						System.out.println("\nOk. The Matador gets his points.\nYou have your chance now..");
					}
						
					
					turn = !turn;
				break;
			}
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			if(userScore >= 99 || cpuScore >=99)
				gameOver = true;
			
			if(gameOver ==false)
			printScore(userScore,cpuScore);
			
			
		}while(gameOver == false);
		
		if(winner==false)
		{}//do nothing
		else {
			if(insta == false)
			if (userScore > cpuScore)
			{}//do nothing
			else {
				winner = false;
			}
		}
		
		if(winner == true)
			youWon();
		else
			youLost();
	
	}
	public static void playShorter(){
		int userScore=0,cpuScore=0,currentNumber,roll1,roll2,turnResult;
		intro();
		Die sixer = new Die();
		boolean gameOver = false, turn = true, winner = true;
		Scanner scnr = new Scanner(System.in);
		
		
		do {
			Random rand = new Random();
			
			if(turn==true)
			System.out.println("\nPick a number 2-6");
			else {
			System.out.println("It is The Matador's turn.");
			}
			
			if(turn==true) {
				currentNumber = scnr.nextInt();
				while(currentNumber <2 || currentNumber > 6){
					System.out.println("follow the rules please!");
					currentNumber = scnr.nextInt();
				}
			}
				
			else {
				currentNumber = (rand.nextInt(5))+2;
				System.out.println("\nThe Matador guesses "+currentNumber+".\n");
				try {Thread.sleep(750);} catch (InterruptedException e) {e.printStackTrace();}
			}
			
			roll1 = sixer.Roll();
			sixer.Draw();
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			roll2 = sixer.Roll();
			sixer.Draw();
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			turnResult = checkConditions(roll1,roll2,currentNumber);
			try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
			switch(turnResult) {
			
				case 1:
					
					if(turn == true) {
						userScore=userScore-25;
						System.out.println("\nSnake eyes......\n25 points will be subtracted from your score...");
					}
						
					else {
						cpuScore=cpuScore-25;
						System.out.println("\nSnake eyes!\nKaching!\nNow The Mattador loses 25 points!!!!");
					}
						
					turn = !turn;
				break;
				
				case 2:
					if(turn==true)
						System.out.println("\nAw shucks. \nYou rolled a 1.\nUnfortunatly no points are gained, and you lose your turn....");
					else
						System.out.println("\nNice!\nSince The Matador rolled a 1, you get your turn back!");
					
					turn=!turn;
				break;
				
				case 3:
					if(turn==true) {
						userScore = userScore + roll1 + roll2;
						if(userScore < 24)
						System.out.println("\nGreat galloping ghosts!?!\nBecause your chosen number was rolled,\nYou get another turn!!!");
					}
					else {
						cpuScore = cpuScore + roll1 + roll2;
						if(cpuScore < 24)
						System.out.println("\nOh no?!? \nThe Matador managed to correctly guess one of his rolls.\nMeaning he gets to go again...");
					}
					
				break;
				
				case 4:
					gameOver= true;
					if(turn == false)
						winner = false;
					
					
				if(winner ==true) {
					System.out.print("YOU HAVE DONE THE");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print(" I");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("M");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("P");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("O");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("S");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("S");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("I");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("B");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("L");
					try {Thread.sleep(900);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.print("E\n");
					try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
					System.out.println("BOTH of your rolls were the guessed number!?!?");
					insta = true;
				}else{
					System.out.println("Bad luck. The Matador guessed both rolls.... \nIt's all over\n");
				}
					
				break;
				
				case 5:
					if(turn==true) {
						userScore = userScore + roll1 + roll2;
						if(userScore < 24)
						System.out.println("\nOk. You get your points.\nBut it is now The Matador's turn...");
					}
						
					else {
						cpuScore = cpuScore + roll1 + roll2;
						if(cpuScore < 24)
						System.out.println("\nOk. The Matador gets his points.\nYou have your chance now..");
					}
						
					
					turn = !turn;
				break;
			}
			try {Thread.sleep(1500);} catch (InterruptedException e) {e.printStackTrace();}
			if(userScore >= 24 || cpuScore >=24)
				gameOver = true;
			
			if(gameOver ==false)
			printScore(userScore,cpuScore);
			
			
		}while(gameOver == false);
		if(insta == false)
		if(winner==false)
		{}//do nothing
		else {
			if(insta == false)
			if (userScore > cpuScore)
			{}//do nothing
			else {
				winner = false;
			}
		}
		
		if(winner == true)
			youWon();
		else
			youLost();
	}

	
	public static void printScore(int userScore, int cpuScore) {
		
		if(userScore == cpuScore)
			System.out.println("\n\nYou and The Matador are currently tied.\n");
		if(userScore > cpuScore)
			System.out.println("\n\nYou are currently beating The Matador!!!\n");
		else if(userScore < cpuScore) {
			if((cpuScore - userScore) > 35 )
			System.out.println("\n\nThe Matador thinks your attempts are pathetic");
			System.out.println("\n\nYou are currently losing to The Matador\n");
		}
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		
		System.out.println("Your score is:\t"+userScore+"\n");
		System.out.println("The Matador's:\t"+cpuScore+"\n");
		
		try {Thread.sleep(1300);} catch (InterruptedException e) {e.printStackTrace();}
		
		
	}
	
	public static int checkConditions(int roll1, int roll2, int currentNumber) {
		int result = 0;
		
		if(roll1 == 1 || roll2 == 1) {
			if(roll1 == 1 && roll2 == 1)
				result = 1;
			else
				result = 2;
		}else {
			if(currentNumber == roll1 || currentNumber == roll2) {
				if(currentNumber == roll1 && currentNumber == roll2) {
					result = 4;
				}else
				result = 3;
			}else
				result = 5;
		}
		return result;
	}
	
	public static void intro() {
		System.out.println("             ___     ___          ___                  __              ");
		try {Thread.sleep(165);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("  /\\\\,/\\\\,  -   -_, -   ---___-  -   -_, -_____      ,-||-,   -__ /\\   ");
		try {Thread.sleep(165);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println(" /| || ||  (  ~/||     (' ||    (  ~/||    ' | -,   ('|||  )    || \\,  ");
		try {Thread.sleep(165);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println(" || || ||  (  / ||    ((  ||    (  / ||   /| |  |` (( |||--))  /|| /   ");
		try {Thread.sleep(165);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println(" ||=|= ||   \\/==||   ((   ||     \\/==||   || |==|| (( |||--))  \\||/-   ");
		try {Thread.sleep(165);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("~|| || ||   /_ _||    (( //      /_ _||  ~|| |  |,  ( / |  )    ||  \\  ");
		try {Thread.sleep(165);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println(" |, \\\\,\\\\, (  - \\\\,     -____-  (  - \\\\,  ~-____,    -____-   _---_-|, ");
		try {Thread.sleep(165);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("_-                                       (                             ");
		try {Thread.sleep(165);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("                                                                       ");
		try {Thread.sleep(750);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("\n\tWELCOME TO MATADOR!!!\n\n");
		
		
	}
public static void youWon() {
		
	System.out.println("");
	System.out.println("");
	System.out.println("                              WW                                      WWW                           ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                          WX000000000000000000000000000000000000000000000KN                         ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                          WXOkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkO0N                         ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                           WN0O000000000000000000000000O000000000000000OKN                          ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                 WWWWWWWWWWWXK000000000000000000000000000000000000000000KNNWWWWWWWNWW               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                WKOOOOOOOOOOO00000000000000000000000000000000000000000000OOOOOOOOOOOX               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                WKkkkkkkkkkkO00000000000000000000KXXK00000000000000000000kkkkkkkkkkkK               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                WKkkkkO00000000000000000000000000XWWX0000000000000000000000000OkkkkkK               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                WKkkkk0NWWWWNK000000000000000000XW  NK000000000000000000KNW WWXOkkkkX               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                WKkkkkON    NK00000000000000000KN   WN000000000000000000KW    XOkkkOX               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                 XOkkkOX    NK00000000KKXXXXXXXNW    WNXXXXXXXK000000000KW   WKkkkkON               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                 N0kkkk0N   WK000000000KKNW               WWXKK000000000XW   NOkkkkKW               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                 WXOkkkkKW  WX000000000000KXNW          WNXK000000000000XW  WKkkkkON                ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                  WKkkkkOXW  X00000000000000KN         WX000000000000000N  WKOkkkkKW                ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                   N0kkkkOXW NK0000000000000KW   WWW    NK0000000000000KW WKOkkkkKW                 ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                    N0kkkkOKWWX000000000000KNW WNKKKXNW WX000000000000KNWNKkkkkkKN                  ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                     NKkkkkk0XNK00000000000XNNXK000000KXNNK00000000000XNXOkkkkOKW                   ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                      WXOkkkkO0XK0000000000KK000000000000KK0000000000KX0kkkkkOXW                    ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                       WN0OkkkkOO000000000000000000000000000000000000OOkkkkOKN                      ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                         WX0kkkkkkO00000000000000000000000000000000OkkkkkOKNW                       ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                           WXKOkkkkO000000000000000000000000000000OkkkkOKNW                         ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                             WNX0OkkOO00000000000000000000000000OkkkO0XW                            ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                WNXK0OOO0000000000000000000000OOO0KXW                               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                    WNXKKKK0000000000000000KKKKXNW                                  ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                         WWNXK0000000000KXNWW                                       ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                             WKxxkOOkxkXW                                           ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                             NkllllllllON                                           ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                            NkooooooooodON                                          ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                  WNXXXXXXXX0kxkkkkkkkxxkKXXXXXXXXNW                                ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                 WK00000000000000000000000000000000XW                               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                 NK00000000000000000000000000000000XW                               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                 NK00000000000000000000000000000000KW                               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                 NK00000000000000000000000000000000KW                               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                 NK00000000000000000000000000000000KW                               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                 WNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNW                               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("");
	try {Thread.sleep(550);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("You Won! The Matador tips his cap!");
	try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
	}
public static void youLost() {
	System.out.println("");
	System.out.println("");
	System.out.println("                                  W                                 WW                              ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                W0kK                               W0kKW                            ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                               W0ol0                               WOcoKW                           ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                  NKKN         0oloK                               W0oldK         N0KN              ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                  0ccOW       WOloxkKW                            W0xdoo0        Nk:lK              ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                  0c:cxKW     WOcoxdxKW        WWWWWWWWWW        N0xddll0      NKdc;c0              ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                  Ko:::lxKW   Wk:codooxKNNKKKKOolllllllcoOKKKXWN0xoddoccO    N0xl:;;oK              ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                  W0c,;:loxKW Wx;:col:;:ll,'',,'''''''...','';ll;;:llc;:O  N0xlc:;,lKW              ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                   Xd;,;:llokKNx,'''.........'''';c::,'.............''';kNKkolc:;,;xN               ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                    Xd,,;:codxOd;''''''''...'''':loolc;'...'...''''''',:xOxdoc:;,;xN                ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                    WXo,',;:lodxxxkxol;,'...''.';ccll:;'......',;:loxkxxxdol:;,',dNW                ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("          WNNNNNNW  WNd'..',;clodkO00kl;'...'''.'',,,,''''''..'cook00Okdol:;,'..,xNW  WNNNNW        ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("          W0dooddOXXXd,.....',;:clodxdc;'....'''........''....':lldxdolc:;,'....';xNXKOddooxKW      ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("           WXxolcloxkdc:;'....',,;::c:,''.......'......'.......',;:c:;;,,'...',;:cdkdocclok0XW      ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("             WNXOxo:clllc:,......'',''.....''.............''......'',''.....',:clllccox0XNW         ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("               WKd:'',,;;,''..............'''.............'''................',;;,'',:xXW           ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("              WKc..''...................'''''.............'''''...............'''...'.'lXW          ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("             WKl'.........................'''''..........'''''...................'.....'oX          ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("            W0c'........................................................................'lK         ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("            Wx'................''.....................................'''................,k         ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("           WXo................,;;,'.''''.......................'''''.',;;,...............'dN        ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("          WXd,............';;;:clc:,,,''''........''''........'''',,,:clc;;;;,'...........,xN       ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("          Xd,'..........',;c:;:cloolc:;,,,'......',,,,'......',,;:ccloolc;;c:;'...........'lKW      ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("          K:.............',;,,;:ccllloolc::;;,'''......'',,;;::codolllcc:;,,;'.............'lX      ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("          K:...........''..'.',;:c:cldxdlcllcccc:;,'.';:ccccllcldxdlc:::;,'.'..,;,..........cX      ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("          0;..........':;;;'..';;::cool:::cccloddoc;':oddolccc::clooc::;,'...,,;;'..........cX      ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("          K:........  ..':lc;..',,;;::ccloollldxkkkl:okkxdlcloollc::::;,'..':c;...  ........cX      ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("          K:..........  ..,::,..''''';:cloddooxkkxdoloxkxxooddol::;'''''..,:c:.   ..........cX      ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("          K:.......;c,.......'.,c:'...',;:clooloxo:loloxoloolc:,,'..',:c;';;;.....;l;.......cX      ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("          NO:......';,......  ..;:;::,....',;;;:c:;;;;:c:;;;,'....,::;:;. ........,:;'.....'dN      ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("           Nd'....''''''',:,.  ..'';:,....',,'''',,,,,,'''',,'....,:;''.   .';,,''.'''....,dN       ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("           WXo'....'',;,,',,..... ....''',:c:,''',;:c:,,'',:c;,'''.........'ll;;;;,''....'dXW       ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("            WKo'......',''''......   .;lc:,'..',''';c;'',...',:cl;..........','''.......,dX         ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("             WO;..''.......'..''''....;lol;...,:;.....';:,..':lol;....''''..'...........:KW         ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("              O;..,,,,.......''',,,,'.,cll:,.'col,....;oo:'.,cll:,.',,,,'''.............:K          ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("             WO;.;:,,'........''',,,'...,,'..',:;,..'',::,...',,...',,''''...........;'.:K          ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("              Nkc:;.............'''''............''''''............''''......''....'cc,.lK          ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("               WNOoc,.,cc,''...........''''.....''''''''.....''''..........''''''...'':kXW          ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                   N0olol;'''..............................................''';ol;;lk0N             ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                    Nxcc:,'''................''..........''.............'..''';cllkN                ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                    Nd:;;:;.......;,.......':l:.........'cl;'.......;;.......;:;;:kW                ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                    NxcokX0xxxxl,...,lo:..'cl;............;l:..'cdl'...,oxxxxKXklckW                ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                     NXN       N0dc,':do;..........':c,........:do;..,o0W      WNNN                 ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                 WWKkd:;;,,,lkkkkkk0WWKkkkxl,,,;;;:dkKW                             ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("                                     WNNXNNNW              WNXNNXNNW                                ");
	try {Thread.sleep(250);} catch (InterruptedException e) {e.printStackTrace();}
	System.out.println("");
	System.out.println("");	
	System.out.println("It is over... The Matador has won...\n\n");
	try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
	
}
}
