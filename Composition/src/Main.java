public class Main {

    public static void main(String[] args) {
        // Room
        Door door = new Door("Cream", 5.2, 10.4, "Metal door");
        Closet closet = new Closet("Clothes", door);
        Fan fan = new Fan("Standing fan", "200v", "OX");

        Room room = new Room(door, closet, fan);
        room.enterRoom();
        room.getCloset().getDoor().doorAction(0);
        System.out.println("----------------------------");

        // Bedroom
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Glory", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }
}
