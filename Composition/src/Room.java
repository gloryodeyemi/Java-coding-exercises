public class Room {
    private Door door;
    private Closet closet;
    private Fan fan;

    public Room(Door door, Closet closet, Fan fan) {
        this.door = door;
        this.closet = closet;
        this.fan = fan;
    }

    public void enterRoom(){
        door.doorAction(1);
        fan.onFan(3);
    }

    private Door getDoor() {
        return door;
    }

    public Closet getCloset() {
        return closet;
    }

    private Fan getFan() {
        return fan;
    }
}
