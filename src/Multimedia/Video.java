package Multimedia;

public class Video extends ElementoMultimediale implements Riproducibile,RegolabileInLuminosita{
    private int luminosita;
    private int durata;
    private int volume;
    public Video(String titolo,int durata,  int volume ,int luminosita){
        super(titolo);
        this.durata=durata;
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
           System.out.print(getTitolo()+ ", volume:  ");
            for (int j = 0; j < getVolume(); j++) {
                System.out.print("!");
            } System.out.print(" - luminosita: ");
            for (int k = 0; k < luminosita; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
