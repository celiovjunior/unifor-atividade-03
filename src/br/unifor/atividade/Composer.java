package br.unifor.atividade;

public class Composer extends Producer {
    String id;
    String name;

    public Composer(String id, int totalSongs, int totalAlbums, String name, double payment) {
        super(totalSongs, totalAlbums, payment);
        this.name = name;
        this.id = id;
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
