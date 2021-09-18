public class Printer {
    private  int tonerLevel;
    private int noOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int noOfPagesPrinted, boolean duplexPrinter) {
        if (tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.noOfPagesPrinted = noOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner(int toner){
        this.tonerLevel += toner;
        System.out.println("The toner level is = " + this.tonerLevel + "%");
    }

    public void printPage(int pages){
        for (int i = 1; i <= pages; i++){
            if (duplexPrinter){
                System.out.println("Printing front and back of page " + i);
            } else {
                System.out.println("Printing page " + i);
            }
            this.noOfPagesPrinted += i;
        }
    }
}
