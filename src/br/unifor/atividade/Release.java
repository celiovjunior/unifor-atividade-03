package br.unifor.atividade;

import java.util.Date;

abstract class Release {

    double sells;
    Date releaseDate = new Date();

    public Release(double sells, Date releaseDate) {
        this.sells = sells;
        this.releaseDate = releaseDate;
    }

    public double getSells() {
        return sells;
    }

    public void setSells(double sells) {
        this.sells = sells;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
