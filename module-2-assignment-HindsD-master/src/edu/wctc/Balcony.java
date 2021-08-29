package edu.wctc;

public class Balcony extends Room implements Exitable{
    //boolean windowOpen = false;

    public Balcony(String room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return "You've walk into Zeus' Bathroom. \nThe toilet sits right in front of you, his sink and his toiletries to your right." +
                " Light filters in from the slightly cracked window above the toilet..." +
                " There looks like there might be just enough room for you to squeeze through.";
    }

//    public String interact(){
//        if(getInventory().contains("Zeus' Dumbbell")){
//            //windowOpen = true;
//            return "You used the dumbbell to smash the window open!\n";
//        }
//        else{
//            return "You try to open the window, but you can't with just your bare hands\n";
//        }
//
//    }


    public String exit(){
        //if(windowOpen){
        return "You squeeze through the window and escape!";
        //}
        //else{
        //return "You try to open the window, but you can't with just your bare hands\n";
        //}
    }
}
