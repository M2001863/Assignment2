package U4ProgrammingA2;

import java.util.Iterator;

public class Player implements Actions { //class must implent methods in the actions interface

    protected String firstName; //if class is inherited then the new class will have access to the variables

    protected String lastName;

    protected String teamName;

    int count = 0;

    public void player(String firstName, String lastName) { //sets each variable with passed parameters
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = firstName + lastName;
    }

    public String getFirstName() { //returns the player's first name that have been set by the user
        return firstName;
    }

    public String getLastName() { //returns the player's last name that have been set by the user
        return lastName;
    }

    public String getTeamName() { //returns the player's team name that have been set by the user
        return teamName;
    }

    @Override
    public void setFirstName() { //whatever the user inputs will be set as first name
        System.out.println("Enter first name");
        this.firstName = InputFactory.SC.next();
    }

    @Override
    public void setLastName() { //whatever the user inputs will be set as last name
        System.out.println("Enter last name");
        this.lastName = InputFactory.SC.next();
    }

    @Override
    public void setTeam() { //the team will be set as first name and last name
        this.teamName = firstName + lastName;
    }

    @Override
    public void addToArrayList() { //adding details into listPlayer
        String deats = (firstName + "\t" + lastName + "\t" + teamName);
        ShortStore.listPlayer.add(deats);
    }

    @Override
    public void add() { //gets user to add 20 new players to the array list
        while (ShortStore.listPlayer.size() <= 20) {
            setFirstName();
            setLastName();
            setTeam();
            addToArrayList(); //adds new player into the array list
        }
        Menu menu = new Menu(); //creates a new menu and call menu constructor
    }

    @Override
    public void view() { //when called it will display all players added by the user
        if (ShortStore.listPlayer.isEmpty()) { //if players are not in the listPlayer array it will notify the user to add some players
            System.out.println("Add players first");
        }
        System.out.println("list" + ShortStore.listPlayer);
        Iterator itr = ShortStore.listPlayer.iterator();
        while (itr.hasNext()) { //will loop through all players that have been inputted by the user
            System.out.println(itr.next());
        }
    }

    @Override
    public void remove() { //allows user to clear all players from the list
        ShortStore.listPlayer.clear();
    }
}
