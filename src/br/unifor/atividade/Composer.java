package br.unifor.atividade;

public class Composer extends Producer {
    String id;
    String name;

    public Composer(String id,String name, int totalSongs, int totalAlbums) {
        super(totalSongs, totalAlbums);
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
