package Multimedia;

abstract public class ElementoMultimediale {
    private String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String t) {
        this.titolo = t;
    }
}
