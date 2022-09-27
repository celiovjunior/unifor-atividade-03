package br.unifor.atividade;
import java.util.Date;

public class Album extends Release {
    String id;
    String name;
    double totalDuration;
    Composer composer;
    Artist artist;

    public Album(String id, double songDurationMinutes, Date releaseDate, String name, double totalDuration, Composer composer, Artist artist) {
        super(songDurationMinutes, releaseDate);
        this.id = id;
        this.name = name;
        this.totalDuration = totalDuration;
        this.composer = composer;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(double totalDuration) {
        this.totalDuration = totalDuration;
    }

    public Composer getComposer (Composer composer) {
        return composer;
    }

    public void setComposers(Composer composer) {
        this.composer = composer;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
