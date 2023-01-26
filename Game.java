// creating number guessing game
import java.util.Scanner;
public class Game 
{
	public static void	guessingNumberGame()	
	{	
	Scanner sc = new Scanner(System.in);
	int number;	
	number = 1 + (int)(100	* Math.random());
	System.out.println("Enter the number you have to guess : ");		 
	number=sc.nextInt();
	int K = 5; 		
	int i, guess; 		
	System.out.println("A number is chosen"+" between 1 to 100."+ "Guess the number"+ " within 5 trials.");    
		for (i = 0; i < K; i++) 
		{ 			
		System.out.println("Guess the number:");
		guess = sc.nextInt(); 						
			if (number == guess) 
			{				
			System.out.println("Congratulations! You guessed the number.");				
			break;		
			}			
			else if (number > guess && i != K - 1) 
			{
			System.out.println("The number is greater than " + guess);			
			}			
			else if (number < guess && i != K - 1) 
			{				
			System.out.println("The number is less than "+ guess);			
			}		
			} 		
			if (i == K) 
			{			
			System.out.println("You have exhausted K trials."); 			
			System.out.println("The number was " + number);		
			}	
			} 
  public static void main(String arg[])
  {
	 try
	{				
	guessingNumberGame();		
	}		
	catch(Exception e)		
	{			
	System.out.println("Enter the digit only");		
	}		
	finally
	{		
	System.out.println("Thank you");
	}	
	
}
	
}