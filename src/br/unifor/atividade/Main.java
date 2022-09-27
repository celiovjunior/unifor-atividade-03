package br.unifor.atividade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Artist> allArtists = new ArrayList<>();

        String filePath = "entrada1.txt";

        File file = new File(filePath);

        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String id = scanner.next();
                String name = scanner.next();
                int totalSongs = scanner.nextInt();
                int totalAlbums = scanner.nextInt();

                Artist artist = new Artist(id, totalSongs, totalAlbums, name);
                allArtists.add(artist);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < allArtists.size(); i++) {
            System.out.println(allArtists.get(i));
        }

    }
}
