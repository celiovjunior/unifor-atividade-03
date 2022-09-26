package br.unifor.atividade;

public class ComposerPaycheck implements IPaycheck {
    @Override
    public double tax(double albumTotalSells) {
        double taxAmount = albumTotalSells * 0.015;
        return taxAmount;
    }

    @Override
    public double payment(double albumTotalSells) {
        double composerPayment = albumTotalSells * 0.25;
        return composerPayment;
    }
}
