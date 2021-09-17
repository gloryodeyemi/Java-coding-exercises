public class Fan {
    private String type;
    private String powerSupply;
    private String model;

    public Fan(String type, String powerSupply, String model) {
        this.type = type;
        this.powerSupply = powerSupply;
        this.model = model;
    }

    public void onFan(int speed){
        System.out.println("The fan is blowing at number " + speed);
    }

    public String getType() {
        return type;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getModel() {
        return model;
    }
}
