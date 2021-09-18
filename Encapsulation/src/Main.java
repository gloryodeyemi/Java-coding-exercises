public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(4, 2, true);
        printer.fillToner(50);
        printer.printPage(5);
    }
}
