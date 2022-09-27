package br.unifor.atividade;

import java.util.Date;

abstract class Release {
    double sells;

    public Release(double sells) {
        this.sells = sells;
    }

    public double getSells() {
        return sells;
    }

    public void setSells(double sells) {
        this.sells = sells;
    }

}
