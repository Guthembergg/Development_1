package Multimedia;

abstract public class ElementoMultimediale {
    String titolo;
    int durata;
    public ElementoMultimediale( String titolo){
        this.titolo=titolo;
    }
    public ElementoMultimediale( String titolo, int durata){
        this.titolo=titolo;
        this.durata=durata;
    }
    public String getTitolo() {
        return titolo;
    }
}
