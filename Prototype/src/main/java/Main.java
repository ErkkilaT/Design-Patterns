import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Recommendation> recommendations = new ArrayList<>();
        init(recommendations);

        Scanner sc = new Scanner(System.in);
        while(true){
            printRecommendations(recommendations);
            System.out.println("Pick which list to modify by typing it's number or");
            System.out.println("Type \"n\" to make new list or \"q\" to quit");
            String input = sc.nextLine();
            if(input.equals("n")){
                Recommendation newRec = new Recommendation();
                recommendations.add(newRec);
                modifyRecommendation(newRec);
            }
            else if(input.equals("q")){
                return;
            }
            else{
                Recommendation rec = recommendations.get(Integer.parseInt(input));
                System.out.println("Type m=modify list, c=make new copy");
                String s = sc.nextLine();
                if(s.equals("m")){
                    modifyRecommendation(rec);
                }
                else if(s.equals("c")){
                    Recommendation newRec = rec.clone();
                    recommendations.add(newRec);
                    System.out.println("Making copy of specified list");
                    modifyRecommendation(newRec);
                }
            }
        }



    }

    public static void modifyRecommendation(Recommendation r){
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while(running){
            r.printRecommendations();
            System.out.println("Type a=add book, c=change target audience, q=quit");
            String input = sc.nextLine();
            switch(input){
                case "a":
                    System.out.println("Enter Book title:");
                    String title = sc.nextLine();
                    System.out.println("Enter Book author:");
                    String author = sc.nextLine();
                    r.addBook(new Book(author,title));
                    break;
                case "c":
                    System.out.println("Enter new target audience:");
                    String audience = sc.nextLine();
                    r.changeAudience(audience);
                    break;
                case "q":
                    running = false;
                    break;
            }
        }

    }

    public static void printRecommendations(List<Recommendation> r){
        System.out.println("Recommendations: ");
        for(int i = 0; i<r.size();i++){
            System.out.println(i + ": " + r.get(i).getTargetAudience());
        }
    }


    public static void init(List<Recommendation> r){
        Book b1 = new Book("George Orwell", "1984");
        Book b2 = new Book("Harper Lee", "To Kill a Mockingbird");
        Book b3 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book b4 = new Book("J.K. Rowling", "Harry Potter and the Sorcerer’s Stone");
        Book b5 = new Book("J.R.R. Tolkien", "The Lord of the Rings");
        Book b6 = new Book("Mary Shelley", "Frankenstein");
        Book b7 = new Book("Jane Austen", "Pride and Prejudice");
        Book b8 = new Book("Mark Twain", "Adventures of Huckleberry Finn");
        Book b9 = new Book("Leo Tolstoy", "War and Peace");
        Book b10 = new Book("Homer", "The Odyssey");

        List<Book> r1List = new ArrayList<>();
        r1List.add(b1);
        r1List.add(b2);
        r1List.add(b3);
        List<Book> r2List = new ArrayList<>();
        r2List.add(b5);
        r2List.add(b6);
        r2List.add(b7);

        Recommendation r1 = new Recommendation(r1List, "Matille");
        Recommendation r2 = new Recommendation(r2List, "Mikolle");
        r.add(r1);
        r.add(r2);

    }
}
