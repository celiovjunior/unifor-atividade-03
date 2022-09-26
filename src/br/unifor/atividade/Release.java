package br.unifor.atividade;

import java.util.Date;

abstract class Release {

    double sells;
    Date releaseDate = new Date();

    public Release(double songDurationMinutes, Date releaseDate) {
        this.sells = songDurationMinutes;
        this.releaseDate = releaseDate;
    }

    public double getSongDurationMinutes() {
        return sells;
    }

    public void setSongDurationMinutes(double songDurationMinutes) {
        this.sells = songDurationMinutes;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
