package firstExercises.E1;

import java.lang.Math; 
import java.util.Scanner;

public class Game_Class {
		  public void run(){
		  int numberToss,tossH,tossT;
		  Scanner sc=new Scanner(System.in);
		   System.currentTimeMillis();
		   numberToss=0;
		   tossH=0;
		   tossT=0;
		    
		    do{ 
		   System.out.println("Number of tries (1-100):");
		   numberToss=sc.nextInt();
		    //numberToss=10;
		    }while(numberToss<=0 && numberToss>100);
		   
		    for (byte i=0; i<numberToss;i++){
		      if  (Math.random()<=.5){
		        tossH++;
		      }else{
		      tossT++;
		      }
		    }
		      
		     System.out.print("# Toss: "+numberToss+"\n# Heads:"+tossH+"\n# Tails: "+tossT);
		      
		}

}
