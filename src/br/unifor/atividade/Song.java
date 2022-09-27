package br.unifor.atividade;

public class Song extends Release {
    String id;
    String name;
    Boolean hasVideoclip;

    public Song(String id, String name, double sells, Boolean hasVideoclip) {
        super(sells);
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

    @Override
    public String toString() {
        return "Song{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hasVideoclip=" + hasVideoclip +
                ", sells=" + sells +
                '}';
    }
}
