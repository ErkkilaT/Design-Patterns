public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.write("This should go in default file.");
        logger.setFileName("newLog.txt");
        logger.write("And now the new file, yes?");
        logger.write("Still new file, new line?");
        logger.close();
    }
}
