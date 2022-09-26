
public class Artist extends Producer {
    String id;
    String name;
    String style;

    public Artist(String id, int teamMembers, int totalSongs, int totalAlbums, String name, String style, double payment) {
        super(teamMembers, totalSongs, totalAlbums, payment);
        this.id = id;
        this.name = name;
        this.style = style;
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
