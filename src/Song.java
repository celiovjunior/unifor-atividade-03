import java.util.Date;

public class Song extends Release {
    String id;
    String name;
    double duration;
    Boolean hasVideoclip;

    public Song(String id, double songDurationMinutes, Date releaseDate, String name, double duration, Boolean hasVideoclip) {
        super(songDurationMinutes, releaseDate);
        this.name = name;
        this.duration = duration;
        this.hasVideoclip = hasVideoclip;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
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
