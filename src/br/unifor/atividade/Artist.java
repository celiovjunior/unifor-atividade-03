package br.unifor.atividade;

public class Artist extends Producer {
    public double payment;
    String id;
    String name;


    public Artist(String id,int totalSongs, int totalAlbums, String name) {
        super(totalSongs, totalAlbums);
        this.id = id;
        this.name = name;
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

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    //    public void showData() {
//        System.out.println("Id: " + id +
//                "\n" + "totalSongs: " + totalSongs +
//                "\n" + "totalAlbums: " + totalSongs +
//                "\n" + "Name: " + name);
//    }


    @Override
    public String toString() {
        return "Artist{" +
                "payment=" + payment +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", totalSongs=" + totalSongs +
                ", totalAlbums=" + totalAlbums +
                '}';
    }
}
