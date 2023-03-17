package Multimedia;

public interface Riproducibile {
    void play();

    void abbassaVolume();

    void alzaVolume();

    int getVolume();

    void setVolume(int v);

    int getDurata();

    void setDurata(int d);
}
