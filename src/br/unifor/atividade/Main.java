package br.unifor.atividade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s1 = "./entrada1.txt";

        File f1 = new File(s1);

        try {
            Scanner s = new Scanner(f1);
            while(s.hasNext()) {
                String id = s.next();
                String name = s.next();
                String style = s.next();
                int teamMembers = s.nextInt();
                int totalSongs = s.nextInt();
                int totalAlbums = s.nextInt();
                double payment = s.nextDouble();
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
