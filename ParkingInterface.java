package TestZaliczenieB;

public interface ParkingInterface {

    void doKolejki(Pojazd pojazd);
    void wjazd(Pojazd pojazd) throws Exception;
    void wyjazd(Pojazd pojazd);

}
