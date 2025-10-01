import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Prototype{
    private String targetAudience;
    List<Book> recommendations = new ArrayList<>();

    public Recommendation(List<Book> list, String audience){
        recommendations = list;
        targetAudience = audience;
    }
    public Recommendation(){
        targetAudience = "Not set";
    }
    public void changeAudience(String audience){
        targetAudience=audience;
    }
    public String getTargetAudience(){
        return targetAudience;
    }
    public void addBook(Book book){
        recommendations.add(book);
    }
    public List<Book> getRecommendations(){
        return recommendations;
    }
    public void printRecommendations(){
        System.out.println("----------------------------------");
        System.out.println("Audience: " + targetAudience);
        if(!recommendations.isEmpty()){
            for(Book b : recommendations){
                System.out.println(b.getTitle() + ", Author: " + b.getAuthor());
            }
        }
        System.out.println("----------------------------------");

    }



    public Recommendation clone(){
        List<Book> newList = new ArrayList<>();
        for(Book b : recommendations){
            newList.add(b.clone());
        }
        return new Recommendation(newList, targetAudience);
    }
}
