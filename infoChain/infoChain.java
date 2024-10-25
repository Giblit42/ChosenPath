
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
		System.out.println("Hello " + userName + " would you like to go on an adventure?\n");
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
		playerTurn(myObj);
	}

	private static void playerTurn(Scanner scanner){
        String userInput;
        while(true){
            System.out.println("Please select your choice");
            userInput = scanner.nextLine();
            if(isValid(userInput)){
                break;
            }
            
            else{
                System.out.println("Not a valid choice");
            }
            
        }
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

