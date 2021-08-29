package edu.wctc;

public class Basement extends Room implements Interactable{
    public Basement(String room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return "You've entered Zeus' Basement. \nThe room is dark and the air is thick. It feels as if nobody has been in here for years." +
                "The room is relatively empty, outside of a few critters that have turned it into their home";
    }

    public String interact(){
        return "You dust off some cobwebs\n";
    }

}
