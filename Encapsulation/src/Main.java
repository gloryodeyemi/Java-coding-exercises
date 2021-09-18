public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(4, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        printer.addToner(50);
        int pages = printer.printPages(5);
        System.out.println("Pages printed was " + pages + " new total print count for printer = " + printer.getPagesPrinted());
        pages = printer.printPages(4);
        System.out.println("Pages printed was " + pages + " new total print count for printer = " + printer.getPagesPrinted());

    }
}
