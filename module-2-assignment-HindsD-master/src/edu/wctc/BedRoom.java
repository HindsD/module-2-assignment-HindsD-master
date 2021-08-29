package edu.wctc;

public class BedRoom extends Room implements Interactable{
    public BedRoom(String room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return "You've entered Zeus' Bedroom. \nA white rug with a golden bed, it looks like it had been made of clouds. " +
                "The room looks so comfortable, you find yourself getting drowsy... No! you need to escape! He'll be back any minute";
    }

    public String interact(){
        // if(getInventory().contains("Zeus' Dumbbell")){
        return "You lay down in Zeus' bed... Now isn't the time to rest!!\n";
        //}
//        else{
//            return "You try to smash Zeus' piggy bank but you're not strong enough!";
//        }
    }


}