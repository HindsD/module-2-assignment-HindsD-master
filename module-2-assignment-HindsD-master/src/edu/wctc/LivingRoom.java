package edu.wctc;

public class LivingRoom extends Room implements Interactable{
    public LivingRoom(String room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return "You've entered Zeus' Living Room. \nAlthough bare, the room looks extremely pristine. The room covered in marble, with a comfortable couch, " +
                "and a fancy glass coffee table centered in the middle of the room";
    }

    public String interact(){
        return "You smash the glass coffee table!\n";
    }
}
