package Multimedia;

import java.util.Scanner;

public class MultimediaPlayer {
    static Scanner input = new Scanner(System.in);
    static ElementoMultimediale[] media = new ElementoMultimediale[5];

    public static void main(String[] args) {
        creaPlayer();
        playNow();
        input.close();
    }

    public static void creaPlayer() {

        // Creazione degli elementi multimediale letti da tastiera
        for (int i = 0; i < media.length; i++) {
            System.out.println("Inserisci il tipo di elemento multimediale (1 per Immagine, 2 per Video, 3 per Registrazione Audio):");

            int tipo = input.nextInt();
            input.nextLine();


            switch (tipo) {
                case 1:
                    System.out.println("Inserisci il titolo:");
                    String titolo = input.nextLine();
                    System.out.println("Inserisci la luminosità:");
                    int luminosita = input.nextInt();
                    media[i] = new Immagine(titolo, luminosita);
                    break;
                case 2:
                    System.out.println("Inserisci il titolo:");
                    String titolo2 = input.nextLine();
                    System.out.println("Inserisci la durata:");
                    int durata2 = input.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volume2 = input.nextInt();
                    System.out.println("Inserisci la luminosità:");
                    int luminosita2 = input.nextInt();
                    media[i] = new Video(titolo2, durata2, volume2, luminosita2);
                    break;
                case 3:
                    System.out.println("Inserisci il titolo:");
                    String titolo3 = input.nextLine();
                    System.out.println("Inserisci la durata:");
                    int durata3 = input.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volume3 = input.nextInt();
                    media[i] = new Audio(titolo3, durata3, volume3);
                    break;
                default:
                    i--;
                    System.out.println("Scelta inesistente riprova");
                    break;

            }

        }


    }

    public static void playNow() {
        // Esecuzione degli elementi multimediale scelti dall'utente
        int scelta = -1;
        while (scelta != 0) {
            System.out.println("Quale elemento multimediale vuoi eseguire? (1-5, 0 per finire)");
            scelta = input.nextInt();

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elem = media[scelta - 1];

                if (elem instanceof Immagine) {
                    ((Immagine) elem).show();
                } else if (elem instanceof Riproducibile) {
                    ((Riproducibile) elem).play();
                }
            } else {
                System.out.println("Scelta inesistente, riprova");
            }
        }
    }


}
