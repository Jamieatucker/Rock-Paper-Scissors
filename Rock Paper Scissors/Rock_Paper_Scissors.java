import java.io.*;
import java.util.*;

public class Rock_Paper_Scissors
{
   public static void main(String args[]){
     
     int userScore = 0;
     int cpuScore = 0;
     Scanner kbReader = new Scanner (System.in);
     
     for(int i = 1; i <= 5; i++){
     int rand = (int)(Math.random() * 2 + 1);
     System.out.println("Rock, Paper, or Scissors? ");
     String choice = kbReader.next();
     switch(choice){
      case "Rock":
         if (rand == 0){
            System.out.println("It's a tie.");
         }
         if (rand == 1){
            System.out.println("Round lost...");
            cpuScore++;
         }
         if (rand == 2){
            System.out.println("Round won!");
            userScore++;
         }
       break;
       
      case "Paper":
         if (rand == 0){
            System.out.println("Round won!");
            userScore++;
         }
         if (rand == 1){
            System.out.println("It's a tie.");
         }
         if (rand == 2){
            System.out.println("Round lost...");
            cpuScore++;
         }
         break;
         
      case "Scissors":
         if (rand == 0){
            System.out.println("Round lost...");
            cpuScore++;
         }
         if (rand == 1){
            System.out.println("Round won!");
            userScore++;
         }
         if (rand == 2){
            System.out.println("It's a tie...");
         }
         break;
         
       case "rock":
         if (rand == 0){
            System.out.println("It's a tie.");
         }
         if (rand == 1){
            System.out.println("Round lost...");
            cpuScore++;
         }
         if (rand == 2){
            System.out.println("Round won!");
            userScore++;
         }
       break;
       
      case "paper":
         if (rand == 0){
            System.out.println("Round won!");
            userScore++;
         }
         if (rand == 1){
            System.out.println("It's a tie.");
         }
         if (rand == 2){
            System.out.println("Round lost...");
            cpuScore++;
         }
         break;
         
      case "scissors":
         if (rand == 0){
            System.out.println("Round lost...");
            cpuScore++;
         }
         if (rand == 1){
            System.out.println("Round won!");
            userScore++;
         }
         if (rand == 2){
            System.out.println("It's a tie...");
         }
         break;
         
      case "r":
         if (rand == 0){
            System.out.println("It's a tie.");
         }
         if (rand == 1){
            System.out.println("Round lost...");
            cpuScore++;
         }
         if (rand == 2){
            System.out.println("Round won!");
            userScore++;
         }
       break;
       
      case "p":
         if (rand == 0){
            System.out.println("Round won!");
            userScore++;
         }
         if (rand == 1){
            System.out.println("It's a tie.");
         }
         if (rand == 2){
            System.out.println("Round lost...");
            cpuScore++;
         }
         break;
         
      case "s":
         if (rand == 0){
            System.out.println("Round lost...");
            cpuScore++;
         }
         if (rand == 1){
            System.out.println("Round won!");
            userScore++;
         }
         if (rand == 2){
            System.out.println("It's a tie...");
         }
         break;


       }
     
     }
      if(userScore > cpuScore){
         System.out.println("You are the supreme RPS Master. Fantasic execution.");
      }
      if (userScore < cpuScore){
         System.out.println("Your human mind is incomparable to my robotic processors.");
      }
      if(userScore == cpuScore){
         System.out.println("I never thought I would expect this from a human, but it is a tie. How inconvienent.");
      }
   }
   
   
}