public class Main {

    public static void main(String[] args) {
        Door door = new Door("Cream", 5.2, 10.4, "Metal door");
        Closet closet = new Closet("Clothes", door);
        Fan fan = new Fan("Standing fan", "200v", "OX");

        Room room = new Room(door, closet, fan);
        room.enterRoom();
        room.getCloset().getDoor().doorAction(0);

    }
}
