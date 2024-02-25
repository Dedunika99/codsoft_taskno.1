
package random.number;

import java.util.Random;
import java.util.Scanner;
public class RandomNumber {

    
    public static void main(String[] args) {
        int answer,guess;
        final int max=100;
        int score=0;
        
        
        Scanner input =new Scanner(System.in);
        Random r1=new Random();
        boolean playAgain=true;
        
        
        while(playAgain){
            answer =r1.nextInt(max) + 1;
            int attempts=0;
            boolean guessCorrectly=false;
       
        
        System.out.println("Enter a number between 1 to 100 ");  
        while(attempts<5){
            System.out.println("Attempt "+(attempts+1)+":");
        guess=input.nextInt();
        attempts++;
        
        if (guess>answer)
        {
            System.out.println("Too high");
        }
        else if (guess<answer){
            System.out.println("Too low");
        }
        
        else{
            System.out.println("Guess is correct ");
            guessCorrectly=true;
            break;
        }
        if(guessCorrectly){
            score +=5-attempts+1;
        }
        
        }     
            System.out.println("Attempts are over");
            System.out.println("Do you want to play again.(Yes/No)");
            input.nextLine();
            String playAgainInput= input.nextLine();
            playAgain=playAgainInput.equalsIgnoreCase("Yes");
    }
            System.out.println("Total Score is "+ score);
        input.close();
}
    }

    

