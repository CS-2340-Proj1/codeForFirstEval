import java.util.List;

public class Album {
    private String title;
    private List<Song> songs;

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Song> getSong() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }



}

