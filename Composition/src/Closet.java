public class Closet {
    private String item;
    private Door door;

    public Closet(String item, Door door) {
        this.item = item;
        this.door = door;
    }

    public Door getDoor() {
        return door;
    }

    public String getItem() {
        return item;
    }
}
