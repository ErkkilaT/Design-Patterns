import java.util.Date;

public interface Document {

    public String getContent(User user);
    public Date getCreationDate();
    public int getId();
    public void addAccess(User user);

}
