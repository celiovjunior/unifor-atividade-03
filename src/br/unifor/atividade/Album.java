package br.unifor.atividade;

import java.util.ArrayList;
import java.util.Date;

public class Album extends Release {
    String id;
    String name;
    double totalDuration;
    ArrayList<Composer>[] composers;
    Artist artist;

    public Album(String id, double songDurationMinutes, Date releaseDate, String name, double totalDuration, ArrayList<Composer>[] composers, Artist artist) {
        super(songDurationMinutes, releaseDate);
        this.id = id;
        this.name = name;
        this.totalDuration = totalDuration;
        this.composers = composers;
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

    public ArrayList<Composer>[] getComposers() {
        return composers;
    }

    public void setComposers(ArrayList<Composer>[] composers) {
        this.composers = composers;
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
