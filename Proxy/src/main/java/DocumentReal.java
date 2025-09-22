import java.util.Date;

public class DocumentReal implements Document{
    private int id;
    private String contents;
    private Date creationDate;
    private boolean isProtected;

    public DocumentReal(String contents){
        this.contents = contents;
        isProtected = true;
    }
    public DocumentReal(int id, String contents){
        this.id = id;
        creationDate = new Date();
        this.contents = contents;
        isProtected = false;

    }



    public String getContent(User user){
        return contents;
    }
    public int getId(){
        return id;
    }
    public Date getCreationDate(){
        return creationDate;
    }
    public void addAccess(User user){}
}
