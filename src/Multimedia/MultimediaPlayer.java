package Multimedia;

import java.util.Scanner;

public class MultimediaPlayer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ElementoMultimediale[] media = new ElementoMultimediale[5];

        // Creazione degli elementi multimediale letti da tastiera
        for (int i = 0; i < media.length; i++) {
            System.out.println("Inserisci il tipo di elemento multimediale (1 per Immagine, 2 per Video, 3 per Registrazione Audio):");
            int tipo = input.nextInt();
            input.nextLine();

            System.out.println("Inserisci il titolo:");
            String titolo = input.nextLine();


            if (tipo == 1) {
                System.out.println("Inserisci la luminosità:");
                int luminosita = input.nextInt();

                media[i] = new Immagine(titolo, luminosita);
            } else if (tipo == 2) {
                System.out.println("Inserisci la durata:");
                int durata = input.nextInt();

                System.out.println("Inserisci il volume:");
                int volume = input.nextInt();

                System.out.println("Inserisci la luminosità:");
                int luminosita = input.nextInt();

                media[i] = new Video(titolo, durata, volume, luminosita);
            } else if (tipo == 3) {
                System.out.println("Inserisci la durata:");
                int durata = input.nextInt();

                System.out.println("Inserisci il volume:");
                int volume = input.nextInt();

                media[i] = new Audio(titolo, durata, volume);
            }
        }

        // Esecuzione degli elementi multimediale scelti dall'utente
        int scelta = -1;
        while (scelta != 0) {
            System.out.println("Quale elemento multimediale vuoi eseguire? (1-5, 0 per finire)");
            scelta = input.nextInt();

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elem = media[scelta-1];

                if (elem instanceof Immagine) {
                    ((Immagine) elem).show();
                } else if (elem instanceof Riproducibile) {
                    ((Riproducibile) elem).play();
                }
            }
        }

        input.close();
    }
}
