public class EncryptedPrinter extends PrinterDecorator{
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) { // super basic Ceasar with no corrections on going over
        String encryptedMessage = "";
        for(int i = 0; i< message.length(); i++){
            char c = message.charAt(i);
            c +=3;
            encryptedMessage += c;
        }
        super.print(encryptedMessage);
    }
}
