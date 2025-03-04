import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private List<Album> albums;

    public Artist(String name) {
        this.name = name;
        albums = new ArrayList<Album>();
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

