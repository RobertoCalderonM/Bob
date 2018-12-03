package firstExercises.E2;

import java.util.Scanner;

public class Game {

	public static void main(String[] args)
	  {
	int G=0,W=0,L=0;	
	do {
	Scanner sc=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	do {
	System.out.println("Welcome to Cats & Mice: ");
	System.out.println("0.- Play \n1.- Exit");
	G=sc.nextInt();
	}while(G!=1 && G!=0);
	
	switch (G){
		case 0:
			Cat cat=new Cat();
			Mouse mouse=new Mouse();
			int x,y;
			
			System.out.println(mouse.getX()+" "+mouse.getY());
			
			while (cat.num_tries()<5 && !mouse.isCatched()) {
			System.out.println("Write your the coordenate: X,Y");
			try {
			String[] part=sc2.nextLine().split(",");
			x=Integer.parseInt(part[0]);
			y=Integer.parseInt(part[1]);
			cat.catch_mouse(x, y, mouse);
			}catch(Exception e) {
				System.out.println("Incorrect input, try again: "+e.getMessage());}
			}
			if (mouse.isCatched()) {
				System.out.println("You win!");
				W++;
			}else {
				System.out.println("You lose!");
				L++;
			}
			break;
			
		case 1:
		System.out.println("Thanks for playing!");
		System.out.println("Wins: "+W+"\nLosses: "+L);
			break;
	}
	}while(G==0);
	}
}
