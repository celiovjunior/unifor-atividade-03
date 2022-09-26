package br.unifor.atividade;

abstract class Producer {
    int teamMembers;
    int totalSongs;
    int totalAlbums;
    double payment;

    public Producer(int teamMembers, int totalSongs, int totalAlbums, double payment) {
        this.teamMembers = teamMembers;
        this.totalSongs = totalSongs;
        this.totalAlbums = totalAlbums;
        this.payment = payment;
    }

    public int getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(int teamMembers) {
        this.teamMembers = teamMembers;
    }

    public int getTotalSongs() {
        return totalSongs;
    }

    public void setTotalSongs(int totalSongs) {
        this.totalSongs = totalSongs;
    }

    public int getTotalAlbums() {
        return totalAlbums;
    }

    public void setTotalAlbums(int totalAlbums) {
        this.totalAlbums = totalAlbums;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
}
