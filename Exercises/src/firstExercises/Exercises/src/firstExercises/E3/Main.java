package firstExercises.E3;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		int v;
		
		Player player=new Player();
		Scanner sc=new Scanner(System.in);
		
		
		do {
		System.out.println("Welcome to New Vegas!:");
		System.out.println("Player's money: "+player.getMoney());
		System.out.println("1.-Add Money \n2.-Play \n3.-Exit");
		while (!sc.hasNextInt()) {
			System.out.println("Incorrect command, try again");
			sc.next();
		};
		v=sc.nextInt();
		
		switch(v) {
		
		case 1:
			float add;
			Scanner sc2=new Scanner(System.in);
			do {
			System.out.println("Add quantity you would like to add:" );
			while (!sc2.hasNextInt()) {
				System.out.println("Incorrect quantity, try again");
				sc2.next();
			};
			add=sc2.nextFloat();
			if (add>0) {
			player.addMoney(add);}
			else {System.out.println("Quantity must be positive");}
			}while(add<0);
			break;
			
		case 2:
			float bet;
			Scanner sc3=new Scanner (System.in);
			Scanner sc4=new Scanner (System.in);
			System.out.println("Add slots to play (2-10): ");
			while (!sc3.hasNextInt()) {
				System.out.println("Invalid number, try again");
				sc3.next();
			};
			int slots=sc3.nextInt();
			slots=(slots>=2 && slots<=11)? slots:3;
			Machine machine=new Machine(slots);
			System.out.println("Slots setted to: "+slots);
			do {
			System.out.println("Add quantity to bet (bet a negative quantity to exit):");
			while (!sc4.hasNextFloat()) {
				System.out.println("Invalid bet, try again");
				sc4.next();
			};
			bet=sc4.nextFloat();
			if (player.validatePay(bet)) {
				player.retrieveMoney(bet);
				machine.roll();
				machine.show();
				if(machine.checkWin()){
					System.out.println("You win!");
					machine.pay(bet, player);
				}else {
					System.out.println("You lose!");
				}
				System.out.println("Player's money: "+player.getMoney());
			}else {
				if (bet>0) {
					System.out.println("You don't have that amount of money");
				}
				}
			}while(bet>=0);
		}
		}while(v!=3);
		System.out.println("Thanks for playing!");
	}
}
