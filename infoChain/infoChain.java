
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
		while(true){
			//insert story into here to fix other button options
			System.out.println("You awake in a dark room to your left is a digital alarm clock on a night stand\n");
			Thread.sleep(3000);					// slow down options to give ample time for the user to read options
			System.out.println("To your right is a tall lamp that is currently turned off\n");
			Thread.sleep(3000);					// slow down options to give ample time for the user to read options
			System.out.println("And at your feet is an extemly oveweight hairless cat named Tibs\n");
			Thread.sleep(3000);					// slow down options to give ample time for the user to read options

			System.out.println("You can\n");

			// first set of choices
			System.out.println("A: Turn the alarm clock so you can see the time\n");
			Thread.sleep(2000);					// slow down options to give ample time for the user to read options
			System.out.println("B: Turn on your lamp\n");
			Thread.sleep(2000);					// slow down options to give ample time for the user to read options
			System.out.println("C: Attemp to toss Tibs off of you bed\n");
			Thread.sleep(2000);					// slow down options to give ample time for the user to read options

			System.out.println("Choose one");
			response = myObj.nextLine();

			// choices the user can make
			if(response.equals("A") || response.equals("a")) {	// user choose a
				System.out.println("You turn the alram clock to see what time it is,and see that you have 3 more hours until you go into work\n");
				Thread.sleep(2500);				// slow down options to give ample time for the user to read options

				System.out.println("Do you want to\n");
				Thread.sleep(2500);				// slow down options to give ample time for the user to read options

				System.out.println("A: Start your day early?\n");
				Thread.sleep(2500);				// slow down options to give ample time for the user to read options

				System.out.println("B: Pet your cat?\n");
				Thread.sleep(2500);				// slow down options to give ample time for the user to read options

				System.out.println("C: Go back to bead?\n");
				Thread.sleep(2500);				// slow down options to give ample time for the user to read options

				System.out.println("Choose one");
				response = myObj.nextLine();			//reads response of user

				if(response.equals("A") || response.equals("a")) {	//usr choose a
					System.out.println("You get out of bed and notice that you forgot to take out the trash last night.\n");
				}//continue this branch

				if(response.equals("B") || response.equals("b")) {	//user choose b
					System.out.println("You move closer to the foot of the bed and begin to stroke the fuzzy fat ball until you hear him begin to purr.\n");

					Thread.sleep(2500);			// slow down options to give ample time for the user to read options
					System.out.println("After about five minuets of petting your cat it has moved just enough for you to get your feet out from underneath it "
							+ "It then begins to move its nine chins in an upward mtion to look at you with its diabete encrusted eyes\n");
					Thread.sleep(2500);			// slow down options to give ample time for the user to read options

					System.out.println("What will you do?");
				}// continue this branch

				if(response.equals("C") || response.equals("c")) {	//use choose c
					System.out.println("You close your eyes until you drift back off to sleep\n");
					Thread.sleep(2500);				// slow down options to give ample time for the user to read options
					System.out.println("You slowly awake to an alarm clock blaring, and as you slowly slide your sleep encrusted eyes you realize\n"
							+ " that you over slept by 2 hours\n");

					System.out.println("What will you do?\n");
					Thread.sleep(2500);				// slow down options to give ample time for the user to read options

					System.out.println("A: Call into work sick and hope they will let it go\n");
					Thread.sleep(2500);				// slow down options to give ample time for the user to read options

					System.out.println("B: Start you moring as you always do and show up to work late\n");
					Thread.sleep(2500);				// slow down options to give ample time for the user to read options

					System.out.println("C: Get out of bed and grab you keys\n");
					Thread.sleep(2500);				// slow down options to give ample time for the user to read options

					System.out.println("Choose one");
					response = myObj.nextLine();

					if(response.equals("A") || response.equals("a")) {
						System.out.println("You reach underneath your cat and pull out your phone, after calling in you crawl back to bed to "
								+ "sleep an additional 16 hours.\n");
					}//possibly end maybe one more set of choices?

					if(response.equals("B") || response.equals("b")) {
						System.out.println("You slowly get out of bed and shamble over to the bathroom, when you look in the mirror you relize"
								+ "that god was not kind to you.\n");
					}//continue this branch

					if(response.equals("C") || response.equals("C")) {
						System.out.println("You rush out of bed so fast you trip over you bowling ball and smash through your second story window"
								+ "and land in the trash can out side your front door.(Well you always knew you were trash)\n");
					}//end this one

				}//continue this branch

			}// go down this path

			if(response.equals("B") || response.equals("b")) {
				System.out.println("You turn the knob on the lamp and stare directly into a miniture sun\n");
				System.out.println(" Now, do you wish to... ");
				Thread.sleep(2000);			// slow down options to give ample time for the user to read options

				System.out.println("A: Continue to stare at it?\n");
				Thread.sleep(2000);			// slow down options to give ample time for the user to read options

				System.out.println("B: Turn it back off?\n");
				Thread.sleep(2000);			// slow down options to give ample time for the user to read options

				System.out.println("C: Let out a scream?\n");
				Thread.sleep(2000);			// slow down options to give ample time for the user to read options

				System.out.println("Choose one\n");
				response = myObj.nextLine();		// read user's response

				// second level choice tree
				if(response.equals("A") || response.equals("a")) {
					System.out.println("You continue to stare at the light for another 12 hours and become blind in the process\n");
				}//dead end?
				if(response.equals("B") || response.equals("b")) {
					System.out.println("You turn the dial back to off and go back to bed. Congradulations you have the motor functions of a monkey\n");
				}
				// might continue with this branch
				if(response.equals("c") || response.equals("c")) {
					System.out.println("You let out a blood curdling scream, it must be maiting season for you\n");
				}
				//might continue with this branch
			}// go down this path

			if(response.equals("C") || response.equals("c")) {
				System.out.println("You attempt to use your feet to lift your 400lb cat only to have your feet snap at the ankles. Congradulations "
						+ "you are now in pain\n");
			}// go down this path
			//one end of the path?

			//Do nothing when other buttons are hit
			else{
				System.out.println("The response you chose does not match one of the ones given please choose again\n");
				break;
			}
		}












	}



}

