package edu.wctc;

public class WeightRoom extends Room implements Lootable{


    public WeightRoom(String room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return "You've entered Zeus' weight room. \nEvery imaginable machine, type of barbell, and range of weights available. Even Zeus needs to stay in shape!";
    }

    public String loot(){
        return "Zeus' Dumbbell";
    }

}
