package Multimedia;

public class Video extends ElementoMultimediale implements Riproducibile,RegolabileInLuminosita{
    private int luminosita;
    private int volume;
    public Video(String titolo,int durata, int luminosita, int volume){
        super(titolo,durata);
        this.luminosita=luminosita;
        this.volume=volume;
    }
    public int getLuminosita() {
        return luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }
    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    public void abbassaVolume() {
        volume--;
    }

    public void alzaVolume() {
        volume++;
    }
    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            for (int j = 0; j < getVolume(); j++) {
                System.out.print(".");
            }
            for (int k = 0; k < luminosita; k++) {
                System.out.print("*");
            }
            System.out.println(getTitolo() + "!");
        }
    }
}
