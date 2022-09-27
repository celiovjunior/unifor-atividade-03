package br.unifor.atividade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "entrada1.txt";

        File file = new File(filePath);

        ArrayList<Producer> producers = new ArrayList<Producer>();

        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String[] result = scanner.nextLine().split(" ");
                if (result[7].equals("artist")) {
                    Artist artist = new Artist(
                        result[0],
                        Integer.parseInt(result[3]),
                        Integer.parseInt(result[4]),
                        Integer.parseInt(result[5]),
                        result[1], result[2], Double.parseDouble(result[6])
                    );
                    producers.add(artist);
                }
            }
            Artist artist = (Artist) producers.get(0);
            System.out.println(artist.getName());
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
