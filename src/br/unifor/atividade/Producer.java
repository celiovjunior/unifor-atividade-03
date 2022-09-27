package br.unifor.atividade;

abstract class Producer {
    int totalSongs;
    int totalAlbums;

    public Producer(int totalSongs, int totalAlbums) {
        this.totalSongs = totalSongs;
        this.totalAlbums = totalAlbums;
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



}
