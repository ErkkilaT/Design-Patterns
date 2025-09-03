public class Main {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print("ABCD");

        Printer printer2 = new EncryptedPrinter(new XMLPrinter(new BasicPrinter()));
        printer2.print("ABCD");

        Printer printer3 = new XMLPrinter(new EncryptedPrinter(new BasicPrinter()));
        printer3.print("ABCD");


    }
}
