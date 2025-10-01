public class Book implements Prototype{
    private String author;
    private String title;
    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }
    @Override
    public Book clone(){
        return this;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }

}
