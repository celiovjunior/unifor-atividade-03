package br.unifor.atividade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Artist> allArtists = new ArrayList<>();
        ArrayList<Composer> allComposers = new ArrayList<>();
        ArrayList<Album> allAlbums = new ArrayList<>();
        ArrayList<Song> allSongs = new ArrayList<>();

        String filePath = "entrada1.txt";
        String filePath2 = "entrada2.txt";

        File file = new File(filePath);
        File file2 = new File(filePath2);

        try {
            Scanner scanner = new Scanner(file);
            int fileLine = 0;
            while(scanner.hasNext()) {
                if(fileLine < 2) {
                    String id = scanner.next();
                    String name = scanner.next();
                    int totalSongs = scanner.nextInt();
                    int totalAlbums = scanner.nextInt();

                    Artist artist = new Artist(id, totalSongs, totalAlbums, name);
                    allArtists.add(artist);
                    fileLine++;
                } else {
                    String id = scanner.next();
                    String name = scanner.next();
                    int bandMembers = scanner.nextInt();
                    int totalSongs = scanner.nextInt();
                    int totalAlbums = scanner.nextInt();

                    Composer composer = new Composer(id, name, bandMembers, totalSongs, totalAlbums);
                    allComposers.add(composer);
                    fileLine++;
                }

            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Scanner scanner = new Scanner(file2);
            int fileLine = 0;
            while(scanner.hasNext()) {
                if(fileLine < 2) {
                    String id = scanner.next();
                    String name = scanner.next();
                    int songAmount = scanner.nextInt();
                    double sells = scanner.nextDouble();

                    Album album = new Album(sells, id, name, songAmount);
                    allAlbums.add(album);
                    fileLine++;
                } else {
                    String id = scanner.next();
                    String name = scanner.next();
                    double sells = scanner.nextDouble();
                    boolean hasVideoclip = scanner.nextBoolean();

                    Song song = new Song(id, name, sells, hasVideoclip);
                    allSongs.add(song);
                    fileLine++;
                }

            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        int position = 0;

        // Ver qual foi o artista que mais gravou músicas.
        for(int i = 0; i < allArtists.size(); i++) {
            if (allArtists.get(i).totalSongs > allArtists.get(position).getTotalSongs()) {
                position = i;
            }
        }

        String outputPath = "resultado1.txt";
        File outputFile = new File(outputPath);

        try {
            FileWriter fw = new FileWriter(outputFile);
            fw.write("Artist ID: " + allArtists.get(position).getId() + "\n");
            fw.write("Name: " + allArtists.get(position).getName() + "\n");
            fw.write("Total songs: " + allArtists.get(position).getTotalSongs() + "\n");
            fw.write("Total albums: " + allArtists.get(position).getTotalAlbums() + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }


        // Ver qual foi a música que mais rendeu lucro;
        for (int i = 0; i < allSongs.size(); i++) {
            if(allSongs.get(i).sells > allSongs.get(position).getSells()) {
                position = i;
            }
        }

        String outputPath2 = "resultado2.txt";
        File outputFile2 = new File(outputPath2);


        try {
            FileWriter fw2 = new FileWriter(outputFile2);
            fw2.write("Song ID: " + allSongs.get(position).getId() + "\n");
            fw2.write("Name: " + allSongs.get(position).getName() + "\n");
            fw2.write("Sells: US$" + allSongs.get(position).getSells() + "\n");
            fw2.write("Has Videoclip? " + allSongs.get(position).getHasVideoclip() + "\n");
            fw2.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }


}
