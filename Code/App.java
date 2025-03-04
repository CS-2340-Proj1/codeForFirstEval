import java.util.ArrayList;
import java.util.List;

public class App {
    private List<User> users;
    private List<Artist> artists;

    public App() {
        users = new ArrayList<User>();
        artists = new ArrayList<Artist>();
    }
    

     //Adds song to a given playlist assuming no duplicate playlist name. 
    //If the playlist or song does not exist it is created.
    //Also automatically adds song to library
    //Returns false if user not registered, true otherwise
    public boolean addSongToPlaylist(User user, String playlistName, Song song) {
        if (Login(user)) {
            Library library = user.getLibrary();
            List<Playlist> playlists = user.getPlaylists();
            //If the song is not on public library then a new song with the name is made
            //(Local files for spotify or apple music equivalent)
            boolean added = false;
            if (!library.getallSongs().contains(song)) {
                
            }
            for (int i = 0; i < playlists.size(); i++) {
                if (playlists.get(i).getName().equals(playlistName)) {
                    playlists.get(i).addSong(song);
                    added = true;
                }
            }
            if (!added) {
                createPlaylist(user,playlistName);
            }
            addSongToLibrary(user,song);
        } else {
            return false;
        }
       
        return true;
        
    }

    public void createPlaylist(User user, String name) {
        //implementation here
        user.getPlaylists().add(new Playlist(name));
    }

    public void deletePlaylist(String name) {
        //implementation here
    }

    public void addSongToLibrary(User user, Song song) {
        user.getLibrary().getFavoriteSongs().add(song);
    }

    public void deleteSong(String name) {
        //implementation here
    }

    public boolean Login(User user) {
        if (users.contains(user)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addUser(User user) {
        return users.add(user);
    }

    public boolean removeUser(User user) {
        return users.remove(user);
    }

    public boolean addArtist(Artist artist) {
        return artists.add(artist);
    }

    public boolean removeArtist(Artist artist) {
        return artists.remove(artist);
    }
}
