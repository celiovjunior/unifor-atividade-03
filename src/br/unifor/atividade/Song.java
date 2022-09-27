package br.unifor.atividade;

import java.util.Date;

public class Song extends Release {
    String id;
    String name;
    Boolean hasVideoclip;

    public Song(String id, Date releaseDate, String name, double sells, Boolean hasVideoclip) {
        super(sells, releaseDate);
        this.name = name;
        this.hasVideoclip = hasVideoclip;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHasVideoclip() {
        return hasVideoclip;
    }

    public void setHasVideoclip(Boolean hasVideoclip) {
        this.hasVideoclip = hasVideoclip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
