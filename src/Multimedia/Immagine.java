package Multimedia;

 class Immagine extends ElementoMultimediale implements RegolabileInLuminosita
{
    private int luminosita;
    public Immagine(String titolo, int luminosita){
        super(titolo);
        this.luminosita=luminosita;
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
    public void show() {
        System.out.print(getTitolo() + ": ");
        for (int i = 0; i < getLuminosita(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
