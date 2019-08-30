/** 
 * Week#GuessProgram 
 * @author Mary 
 * @date Aug 30, 2019  
 * Generate a random number between 1-100
 * Prompt user with statement asking them to guess a number between 1-100
 * Loop while guessed number is not randomly generated number
 *      If number guessed is higher than randomly generated number tell user to guess a lower number
 *      If number guessed is lower than randomly generated number tell user to guess a higher number
 * Count number of tries
 * Output to user when they guess the correct number and tell them how many tries it took them 
 */
import java.util.*; 
public class GuessProgram 
{ 
  public static void main(String args[]) 
  { 
   Scanner keyboard = new Scanner(System.in);      //creates keyboard object to ask user to type in their guess 
   int a = 1 + (int) (Math.random() * 99);                    //one way to generate a random number using the Math class, casting it as an int 
   /* OR 
   Random rand = new Random();                            //creates Random object 
  
   int a = rand.nextInt(100) + 1;                                //another way to generate a random number of int data type 
   */
   int guess;                                                              //declare var to hold guess 
   int count = 0;                                                        //declare var to count up correct guesses
   System.out.println("I am thinking of a number from 1 to 100 ... guess what it is ?");      //ask user to enter their guess
   while((guess = keyboard.nextInt()) != a){                           //this line does two things, it assigns the number they entered to the guess var and it loops as long as
                                                                                              //guess is not equal to the random number  
                                        
     if (guess > a)                                                                   //If guess is greater than the random number output lower      
     {  
       System.out.println("lower!");                                          //outputs lower 
     } 
     else                                                                                 //if guess less than random number, output higher 
     { 
       System.out.println("higher!");                                       //outputs higher 
     } 
     count++;                                                                         //count the number of tries 
   } 
   System.out.println("Congratulations. You guessed the number with "+ count +" tries!");          //outputs text and the value of the count var 
  } 
} 
  