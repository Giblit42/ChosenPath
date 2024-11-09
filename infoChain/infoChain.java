
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

			System.out.println("You Can");
			alarmChoice();
			playerTurn(myObj);
			response = myObj.nextLine();
			System.out.println("next branch looking at clock\n");
		}
		
		if(response.equals("B") || response.equals("b")) {	//user choose b
			System.out.println("You reach out and pull the small chain on your lamp and suddenly blast your eyes with a ray of light.\n");

			Thread.sleep(2500);			// slow down options to give ample time for the user to read options
			System.out.println("next branch from B");
		}

		if(response.equals("C") || response.equals("c")){
			System.out.println("You attempt to nudge tibs with you feet but he won't budge.");
			Thread.sleep(2500);
			// new choices for dealing with tibs
			System.out.println("You can\n");

			//choices for tibs
			System.out.println("A: Slap him on the ass to get him to move\n");
			Thread.sleep(2500);
			System.out.println("B: Use more force with you feet to try and move him\n");
			Thread.sleep(2500);
			System.out.println("C: Bribe him with food\n");
			Thread.sleep(2500);
			System.out.println("Choose one\n");
			playerTurn(myObj);
			response = myObj.nextLine();

			//Tibs path taken
			if(response.equals("A") || response.equals("a")){
				System.out.println("Slap Tim on the ass he wakes up to turn and scratch your arm\n");
				System.out.println("You are now bleeding profusely.");
				System.out.println("What will you do?");
				Thread.sleep(2500);
				System.out.println("Branch from getting scratched");
			}

			if(response.equals("B") || response.equals("b")){
				System.out.println("You really begin to put effort into moving Tim to the side so you can get your feet out of bed\n");
				System.out.println("However you forgot that Tim ways 500lbs and you hear a sudden snap followed by extream pain");
				System.out.println("It has dawned on you that you broke both of your ankles trying to lift tim");
				System.out.println("What will you do?\n");
				Thread.sleep(2500);
				System.out.println("Branch from getting your ankles broken");
			}

			if(response.equals("C") || response.equals("c")){
				System.out.println("You wisper in tims ear 'are you hungry?'\n");
				System.out.println("Tim wakes from the dead of sleep and leaps of the bed with such speed and grace the 500 lb cat should not have\n");
				System.out.println("What will you do?\n");
				Thread.sleep(2500);
				System.out.println("Branch from feeding him early");
			}
		}
	}

	private static void alarmChoice() throws InterruptedException{
		System.out.println("A: Sleep for another 3 hours\n");
		Thread.sleep(2500);
		System.out.println("B: You can get out of bed early\n");
		Thread.sleep(2500);
		System.out.println("C: Reach for the remote to turn on the TV\n");
		Thread.sleep(2500);
		System.out.println("Choose one\n");
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

