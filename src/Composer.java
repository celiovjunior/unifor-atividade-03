public class Composer extends Producer {
    String id;
    String name;

    public Composer(String id, int teamMembers, int totalSongs, int totalAlbums, String name, double payment) {
        super(teamMembers, totalSongs, totalAlbums, payment);
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
