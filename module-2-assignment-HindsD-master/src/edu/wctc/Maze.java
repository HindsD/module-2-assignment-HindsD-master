package edu.wctc;

public class Maze {
    Room currentRoom;
    Player player;
    boolean isFinished = false;

    public Maze() {
        player = new Player();

        Mudroom mr = new Mudroom("Zeus' Mud Room");
        LivingRoom lr = new LivingRoom("Zeus' Living Room");
        WeightRoom wr = new WeightRoom("Zeus' Weight Room");
        BedRoom br = new BedRoom("Zeus' Bedroom");
        Balcony bc = new Balcony("Zeus' Balcony");
        Basement bm = new Basement("Zeus' Basement");

        mr.setNorth(lr);
        lr.setSouth(mr);
        lr.setWest(wr);
        wr.setEast(lr);
        lr.setDown(bm);
        bm.setUp(lr);
        lr.setEast(br);
        br.setWest(lr);
        br.setNorth(bc);
        bc.setSouth(br);

        currentRoom = mr;

    }

    public String exitCurrentRoom(){
        if(currentRoom instanceof Exitable){
            isFinished = true;
            return ((Exitable) currentRoom).exit();
        }
        else{
            return "You can't exit through this room!\n";
        }
    }

    public String interactWithCurrentRoom(){
        if(currentRoom instanceof Interactable){
            player.addToScore(10);
            return ((Interactable) currentRoom).interact();
        }
        else{
            return "There's nothing to interact with!\n";
        }
    }

    public String lootCurrentRoom(){
        if(currentRoom instanceof Lootable){
            player.addToScore(100);
            String lootedItem = ((Lootable) currentRoom).loot();
            player.addToInventory(lootedItem);
            return "You picked up " + lootedItem + "!\n";
        }
        else{
            return "There's nothing to loot!\n";
        }
    }

    public boolean move(char direction){
        if(currentRoom.isValidDirection(direction)){
            currentRoom = currentRoom.getAdjoiningRoom(direction);
            return true;
        }
        else{
            return false;
        }
    }

    public int getPlayerScore(){
        return player.getScore();
    }

    public String getPlayerInventory(){
        return player.getInventory();
    }

    public String getCurrentRoomDescription(){
        return currentRoom.getDescription();
    }

    public String getCurrentRoomExits(){
        return currentRoom.getExits();
    }

    public boolean isFinished() {
        return isFinished;
    }
}