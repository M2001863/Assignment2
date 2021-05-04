package U4ProgrammingA2;

import java.util.Iterator;

public class Team extends Player implements Actions { //class must implent methods in the actions interface

    Player player = new Player(); //creating a new player

    public void teamPlayer(String firstName, String lastName, String teamName) { //sets each variable with passed parameters
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
    }

    @Override
    public void setFirstName() { //overrides the player.setFirstName function
        player.setFirstName();
    }

    @Override
    public void setLastName() { //overrides the player.setLastName function
        player.setLastName();
    }

    @Override
    public void setTeam() { //asks player to set a team name then set the team name into the variable
        System.out.println("Enter team name");
        this.teamName = InputFactory.SC.next();
    }

    @Override
    public void add() { //gets user to add 20 new teams to the array list
        while (ShortStore.listTeam.size() <= 20) {
            setFirstName();
            setLastName();
            setTeam();
            addToArrayList(); //adds new teams into the array list
        }
        Menu menu = new Menu(); //creates a new menu and call menu constructor
    }

    @Override
    public void addToArrayList() { //adding details into listPlayer
        String deats = (player.firstName + "\t" + player.lastName + "\t" + teamName);
        ShortStore.listPlayer.add(deats);
    }

    @Override
    public void view() { //when called it will display all teams added by the user
        if (ShortStore.listTeam.isEmpty()) { //if teams are not in the listTeam array it will notify the user to add some teams
            System.out.println("You have no teams");
        }
        for (Iterator<String> iterator = ShortStore.listPlayer.iterator(); iterator.hasNext(); ) { //iterates through all of the team names and prints them out
            String team = iterator.next();
            System.out.println(team);
        }
    }

    @Override
    public void remove() { //allows user to clear all players from the list
        ShortStore.listPlayer.clear();
    }
}
