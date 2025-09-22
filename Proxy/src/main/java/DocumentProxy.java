import java.util.Date;

public class DocumentProxy implements Document{
    private int id;
    private Date creationDate;
    private DocumentReal realDocument;
    private AccessControlService acs;
    public DocumentProxy(int id, String contents, User user){
        this.id = id;
        creationDate = new Date();
        realDocument = new DocumentReal(contents);
        acs = AccessControlService.getInstance();
        acs.addAccess(this, user);

    }
    public String getContent(User user){
        if(acs.isAllowed(user.getUsername(), id)){
            return realDocument.getContent(user);
        }
        else{
            throw new AccessDeniedException("User " + user.getUsername() + " is not allowed to view this content!");
        }
    }
    public Date getCreationDate(){
        return creationDate;
    }
    public int getId(){
        return id;
    }
    public void addAccess(User user){
        acs.addAccess(this, user);
    }
}
