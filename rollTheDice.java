import java.util.Scanner;
import java.util.Random;


public class rollTheDice{

   public static void main(String[] args){
   
   
      Random randNumbers = new Random();
      
      int userChoice, numRolls;
      
      userchoice = 0;
      
      

      Scanner input = new Scanner(System.in);
      
      System.out.println(" Welcome to the Roll Dice Program ");
      System.out.println(" 1. To Start the program ");
      System.out.println(" 2. Quit the Program");
      userChoice = input.nextInt();
      
      switch(userChoice)
      {
         case 1:
         
            System.out.println("How many times would you like to roll the dice");
            numRolls = input.nextInt();
            
            timesRolled = 0;
            
            do{
                  diceMethod(randNumbers);
                  timesRolled++
            
            }while(numRolls <= timesRolled);
            
            System.out.println("The " timesRolled + "was a " );
            
            break;
            
         case 2:
         
        System.out.println("PEACEEEEE");
        
        System.exit(0);
        
         break;
         
         default:
         
            System.out.println("Int input ONLY!!!!!!!!!!!!!!!");
            
            break;
            
      
      
      }
      
      
     
   
   }
   
   public static RollDiceMethod(int r){
   
      //int value = r.nextInt(6);
      
      int d1, d2;
     
      d1 = d2 =0;
       
      d1 = rand.NextInt(6) + 1;
      d2 = rand.NextInt(6) + 1;
 
      return d1, d2;
   
   }
   

}