package br.unifor.atividade;

public class Composer extends Producer {
    String id;
    String name;
    int bandMembers;

    public Composer(String id, String name, int bandMembers, int totalSongs, int totalAlbums) {
        super(totalSongs, totalAlbums);
        this.name = name;
        this.id = id;
        this.bandMembers = bandMembers;
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

    public int getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(int bandMembers) {
        this.bandMembers = bandMembers;
    }

    @Override
    public String toString() {
        return "Composer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bandMembers=" + bandMembers +
                ", totalSongs=" + totalSongs +
                ", totalAlbums=" + totalAlbums +
                '}';
    }
}
