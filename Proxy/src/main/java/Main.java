public class Main {
    public static void main(String[] args) {
        User mikko = new User("Mikko");
        User teemu = new User("Teemu");
        User mari = new User("Mari");




        Library lib = new Library();



        Document doc1 = lib.createDocument(1,"Mikko's unprotected doc",mikko,false);
        Document doc2 = lib.createDocument(2,"Mari's unprotected doc",mari,false);
        Document doc3 = lib.createDocument(3,"Teemu's private doc", teemu, true);
        Document doc4 = lib.createDocument(4,"Mikko's and Mari's shared document", mikko, true);
        doc4.addAccess(mari);

        System.out.println("Doc1 as Teemu: ");
        System.out.println(doc1.getContent(teemu));
        System.out.println("Doc2 as Teemu: ");
        System.out.println(doc2.getContent(teemu));

        System.out.println("Doc4 as Mikko");
        System.out.println(doc4.getContent(mikko));
        System.out.println("Doc4 as Mari");
        System.out.println(doc4.getContent(mari));
        System.out.println("Doc4 as Teemu");
        System.out.println(doc4.getContent(teemu));
/*
        System.out.println("Doc3 as Teemu: ");
        System.out.println(doc3.getContent(teemu));
        System.out.println("Doc3 as WrongUser");
        System.out.println(doc3.getContent(mikko));
*/


    }
}
