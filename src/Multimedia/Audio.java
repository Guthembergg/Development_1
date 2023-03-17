package Multimedia;

public class Audio extends ElementoMultimediale implements Riproducibile {
   private int volume;
   private int durata;

    public Audio(String titolo, int durata, int volume){
        super(titolo);
        this.durata=durata;
        this.volume=volume;

    }
    public int getDurata() {
        return durata;
    }
    @Override
    public void abbassaVolume() {
        volume--;

    }
    public int getVolume() {
        return volume;
    }
    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public void play() {

        for (int i=0; i< getDurata();i++){
            System.out.print(getTitolo() + ", volume: ");
            for(int j=0; j< getVolume();j++){
                System.out.print("!");
            } System.out.println();
        }
    }
}
