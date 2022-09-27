package br.unifor.atividade;

import java.util.Date;

public class Album extends Release {
    String id;
    String name;
    int songAmount;

    public Album(double sells, String id, String name, int songAmount) {
        super(sells);
        this.id = id;
        this.name = name;
        this.songAmount = songAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSongAmount() {
        return songAmount;
    }

    public void setSongAmount(int songAmount) {
        this.songAmount = songAmount;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", songAmount=" + songAmount +
                ", sells=" + sells +
                '}';
    }
}
