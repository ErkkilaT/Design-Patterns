public class XMLPrinter extends PrinterDecorator{
    public XMLPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        String messageXML = "<message>" + message + "</message>";
        super.print(messageXML);
    }
}
