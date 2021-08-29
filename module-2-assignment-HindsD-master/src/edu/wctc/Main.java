package edu.wctc;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Maze zeusHouse = new Maze();

        do{
            System.out.println(zeusHouse.getCurrentRoomDescription());
            System.out.println("Your exits are: " + zeusHouse.getCurrentRoomExits());
            System.out.println("What would you like to do?");
            char input = keyboard.nextLine().charAt(0);

            if (Character.toLowerCase(input) == 'n'){
                zeusHouse.move(input);
            }
            else if (Character.toLowerCase(input) == 's'){
                zeusHouse.move(input);
            }
            else if (Character.toLowerCase(input) == 'e'){
                zeusHouse.move(input);
            }
            else if (Character.toLowerCase(input) == 'w'){
                zeusHouse.move(input);
            }
            else if (Character.toLowerCase(input) == 'u'){
                zeusHouse.move(input);
            }
            else if (Character.toLowerCase(input) == 'd'){
                zeusHouse.move(input);
            }
            else if (Character.toLowerCase(input) == 'i'){
                System.out.println(zeusHouse.interactWithCurrentRoom());
            }
            else if (Character.toLowerCase(input) == 'l'){
                System.out.println(zeusHouse.lootCurrentRoom());
            }
            else if (Character.toLowerCase(input) == 'x'){
                System.out.println(zeusHouse.exitCurrentRoom());
            }
            else if (Character.toLowerCase(input) == 'v'){
                System.out.println(zeusHouse.getPlayerInventory());
            }
            else{
                System.out.println("Invalid command!");
            }

        }while(zeusHouse.isFinished == false);

        if (zeusHouse.isFinished == true){
            System.out.println("Final Score: " + zeusHouse.getPlayerScore());
        }

    }
}
