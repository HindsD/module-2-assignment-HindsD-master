package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int score = 0;
    private List<String> inventory = new ArrayList<String>();

    public void addToInventory(String item){
        inventory.add(item);
    }

    public void addToScore(int points){
        score +=  points;
    }

    public String getInventory(){
        if(inventory.isEmpty()){
            return "Your inventory is empty\n";
        }
        else {
            StringBuilder sb = new StringBuilder();
            sb.append("You have:\n");
            return inventory.toString();
        }
    }

    public int getScore(){
        return score;
    }
}
