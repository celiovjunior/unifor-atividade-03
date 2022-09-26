package br.unifor.atividade;

public class ArtistPaycheck implements IPaycheck {
    @Override
    public double tax(double albumTotalSells) {
        double taxAmount = albumTotalSells * 0.15;
        return taxAmount;
    }

    @Override
    public double payment(double albumTotalSells) {
        double artistPayment = albumTotalSells * 0.2;
        return artistPayment;
    }
}
