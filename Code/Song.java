public class Song implements Playable {
    private String title;
    private Artist artist;
    private Artist featureArtist;
    private Album album;
    private double duration;

    

    public Song(String title, Artist artist, Artist featureArtist, Album album, double duration) {
        this.title = title;
        this.artist = artist;
        this.featureArtist = featureArtist;
        this.album = album;
        this.duration = duration;
    }

    @Override
    public void play() {
        //implementation here
    }

    @Override
    public void pause() {
        //implementation here
    }

    @Override
    public void stop() {
        //implementation here
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Artist getFeatureArtist() {
        return featureArtist;
    }

    public void setFeatureArtist(Artist featureArtist) {
        this.featureArtist = featureArtist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}

