package edu.wctc;

public class Mudroom extends Room{
    public Mudroom(String room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return "You've entered Zeus' Mud Room. \nA battered jacket rest on the coat hanger next to you, and a few pairs of dirty shoes lie across the floor";
    }

}
