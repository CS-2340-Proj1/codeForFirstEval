import java.util.ArrayList;
import java.util.List;

public class Library {
        private List<Song> allSongs;
        private List<Song> favoriteSongs;

        public Library() {
            allSongs = new ArrayList<Song>();
            favoriteSongs = new ArrayList<Song>();
        }

        public void addPlaylist(Playlist playlist) {
            //implementation here
        }

        public void removePlaylist(Playlist playlist) {
            //implementation here
        }

        public List<Song> getallSongs() {
            return allSongs;
        }

        
        public List<Song> getFavoriteSongs() {
            return favoriteSongs;
        }

        
}

