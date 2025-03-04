import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TransferQueue;

public class User{
    private String userID;
    private String email;
    private String password;
    private Subscriptions subscriptionType;
    private List<Playlist> playlists;
    private Library library;
    private boolean registered;

    public User() {
        playlists = new ArrayList<Playlist>();
        library = new Library();
    }



    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return userID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Subscriptions getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(Subscriptions subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {

        this.library = library;
    }
}

