package U4ProgrammingA2;

import static U4ProgrammingA2.InputFactory.SC;

public class Menu {

    private String sInput;

    public Menu() {
        int iInput;
        Player player = new Player(); //creates a new player
        Team team = new Team(); //creates a new team
        do {
            System.out.println("Select from the following:\n" + "1. Add Player         \t4. Add Team\n" + "2. View Player       \t5. View Team\n" + "3. Delete Player    \t6. Delete Team\n" + "7. Create Tournament" + "0. Exit\n");
            while (!InputFactory.SC.hasNextInt()) { //loops if there is no input 
                System.out.println("Whole numbers only");
                InputFactory.SC.next(); //looking for the next input
            }
            iInput = InputFactory.SC.nextInt(); //iInput is having a value set to it which is the user input
            if (iInput == 1) {
                player.add();
                break;
            } else if (iInput == 2) {
                player.view();
                break;
            } else if (iInput == 3) {
                player.remove();
                break;
            } else if (iInput == 4) {
                team.add();
                break;
            } else if (iInput == 5) {
                team.view();
                break;
            } else if (iInput == 6) {
                team.remove();
                break;
            }
        } while (iInput != 0); //if 0 is is inputted the loop will be exited
    }

    public static void eventType() { //waits for a user input to see which option they have choosen then sents that value to that variable 
        int iInput;
        do {
            System.out.println("One event or Five\n" + "1. One Event\n" + "2. Five Events");
            iInput = SC.nextInt();
            while (!InputFactory.SC.hasNextInt()) { 
                System.out.println("Must be 1 or 2");
                InputFactory.SC.next();
            }
        } while (iInput < 0 || iInput > 2); //checks for incorrect user input and restarts the loop
        if (iInput != 1) {
            Event.singleOrFiveEvents = 5; //sets the event type
        }
        individualOrTeam();
    }

    public static void individualOrTeam() { //waits for a user input to see which option they have choosen then sents that value to that variable 
        int iInput;
        do {
            System.out.println("Individual or Team\n" + "1. individual\n" + "2. team"); //incorrect wording said one event or five
            iInput = SC.nextInt();
            while (!InputFactory.SC.hasNextInt()) {
                System.out.println("Must be 1 or 2");
                InputFactory.SC.next();
            }
        } while (iInput < 0 || iInput > 2); //checks for incorrect user input and restarts the loop
        if (iInput != 2) {
            Event.individualOrTeam = 2; //incorrect variable. sets either individual or team type
        }
        sportingOrAcademic();
    }

    public static void sportingOrAcademic() { //
        int iInput;
        do {
            System.out.println("Sporting or Academic\n" + "1. sporting\n" + "2. academic"); //incorrect wording said one event or five
            iInput = SC.nextInt();
            while (!InputFactory.SC.hasNextInt()) {
                System.out.println("Must be 1 or 2");
                InputFactory.SC.next();
            }
        } while (iInput < 0 || iInput > 2); //checks for incorrect user input and restarts the loop
        if (iInput != 2) {
            Event.sportingOrAcademic = 2; //sets either sporting or academic type
        }
    }

    public static String collate() {
        return "";
    }
}
