package edu.wctc;

public abstract class Room extends Player {
    String room;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    public Room(String room) {
        this.room = room;
    }

    public abstract String getDescription();

    public Room getAdjoiningRoom(char direction){
        if (direction == 'u'){
            return up;
        }
        if (direction == 'd'){
            return down;
        }
        if (direction == 'n'){
            return north;
        }
        if (direction == 's'){
            return south;
        }
        if (direction == 'e'){
            return east;
        }
        if (direction == 'w'){
            return west;
        }
        return null;
    }
    public String getExits(){
        String exit = "";
        if (north != null){
            exit = exit + "North ";
        }
        if (south != null){
            exit = exit + "South ";
        }
        if (west != null){
            exit = exit + "West ";
        }
        if (east != null){
            exit = exit + "East ";
        }
        if (up != null){
            exit = exit + "Up ";
        }
        if (down != null){
            exit = exit + "Down ";
        }
        return exit;
    }

    public String getName(){
        return room;
    }

    public boolean isValidDirection(char direction) {
        if (direction == 'd') {
            if (down != null) {
                return true;
            }
            return false;
        } else if (direction == 'u') {
            if (up != null) {
                return true;
            }
            return false;
        } else if (direction == 'e') {
            if (east != null) {
                return true;
            }
            return false;
        }
        else if (direction == 'n'){
            if(north != null){
                return true;
            }
            return false;
        }
        else if (direction == 's'){
            if(south != null){
                return true;
            }
            return false;
        }
        else if (direction == 'w'){
            if(west != null){
                return true;
            }
            return false;
        }
        return false;
    }

    public void setNorth(Room n) {
        north = n;
    }

    public void setSouth(Room S) {
        south = S;
    }

    public void setEast(Room E) {
        east = E;
    }

    public void setWest(Room W) {
        west = W;
    }

    public void setUp(Room U) {
        up = U;
    }

    public void setDown(Room D) {
        down = D;
    }

}
