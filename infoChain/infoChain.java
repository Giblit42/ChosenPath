
package infoChain;
import java.util.Scanner;

public class infoChain {

	private static Scanner myObj;

	public static void main(String[] args) throws InterruptedException {
		myObj = new Scanner(System.in);  // create new scanner object
		String response = "";
		System.out.println("Hello please enter in your name"); //prompt user to entr name
		String userName = myObj.nextLine(); //Read user input
		System.out.println("Username is: " + userName + "\n");

		//start the story
		System.out.println("Hello " + userName + " would you like to go on an adventure?");
		System.out.println("please enter yes or no\n");
		response = myObj.nextLine();
		System.out.println("You chose " + response + "\n");

		// create the option of ending early
		if(response.equals("No") || response.equals("no")) {	//check if user enters in lower or upper case response
			System.out.println("Have a nice day");		// user decided not to play
			return;
		}

		// continue on with the adventure
		System.out.println("Then " + userName + " let us begin\n");
		Thread.sleep(3000);						//begin to delay the story

		//Begin the story

		//Start asking the player story questions here
		System.out.println("You awake in a dark room to your left is an alarm clock on a night stand\n");
		Thread.sleep(3000);
		System.out.println("To your right is a tall lamp that is currently turned off\n");
		Thread.sleep(3000);
		System.out.println("At your feet is a hairless overweight cat named Tibs\n");
		Thread.sleep(3000);

		//fist choice question
		System.out.println("You can\n");

		// first set of choices
		System.out.println("A: Turn the alarm clock so you can see the time\n");
		Thread.sleep(2500);					// slow down options to give ample time for the user to read options
		System.out.println("B: Turn on your lamp\n");
		Thread.sleep(2500);					// slow down options to give ample time for the user to read options
		System.out.println("C: Attemp to toss Tibs off of you bed\n");
		Thread.sleep(2500);					// slow down options to give ample time for the user to read options

		System.out.println("Choose one\n");
		playerTurn(myObj); //checks if answer is valid
		response = myObj.nextLine(); // they have to enter in the same letter twice possible bug
		

		//Take new path
		if(response.equals("A") || response.equals("a")){
			System.out.println("You turn the alram clock to see what time it is,and see that you have 3 more hours until you go into work\n");
			Thread.sleep(2500);				// slow down options to give ample time for the user to read options

			System.out.println("next branch from A");
		}
		
		if(response.equals("B") || response.equals("b")) {	//user choose b
			System.out.println("You move closer to the foot of the bed and begin to stroke the fuzzy fat ball until you hear him begin to purr.\n");

			Thread.sleep(2500);			// slow down options to give ample time for the user to read options
			System.out.println("next branch from B");
		}

		if(response.equals("C") || response.equals("c")){
			System.out.println("You close your eyes until you drift back off to sleep");
			Thread.sleep(2500);
			System.out.println("next branch from C");
		}
	}

	private static void playerTurn(Scanner scanner){
        String userInput;
        while(true){

            userInput = scanner.nextLine();
            if(isValid(userInput)){
                break;
            }
            
            else{
                System.out.println("Not a valid choice");
            }
            
        }
		System.out.println("please enter in same letter while computer thinks");
    }

	private static boolean isValid(String userInput){
		switch(userInput){
            case "a":
                return true;
            case "b":
                return true;
            case "c":
                return true;
            default:
                return false;
        }
	}



}

