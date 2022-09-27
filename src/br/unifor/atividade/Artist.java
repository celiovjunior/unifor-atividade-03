package br.unifor.atividade;

public class Artist extends Producer {
    String id;
    String name;


    public Artist(String id,int totalSongs, int totalAlbums, String name, double payment) {
        super(totalSongs, totalAlbums, payment);
        this.id = id;
        this.name = name;

        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
