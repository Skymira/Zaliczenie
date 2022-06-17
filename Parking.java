package TestZaliczenieB;

import java.util.ArrayList;


// Pokazuje znajomosc implementacji interfejsow
public class Parking implements ParkingInterface{

    @Override
    public void doKolejki(Pojazd pojazd) {
        // doKolejki–umieszcza pojazd w kolejce
        String pojazd1 = pojazd.getMarka().toString();
        kolejkaWjazdowa.add(pojazd1);
    }

    @Override
    public void wjazd(Pojazd pojazd) {
        String n = pojazd.getMarka();

        if (n == "Osobowka") {
            strefaOsobowka.wjazd(pojazd);
        }

        if (n == "Motor") {
            strefaMotor.wjazd(pojazd);
        }
        else {
            strefaCiezarkowka.wjazd(pojazd);
        }

        System.out.println("Pojazd wjechal "+pojazd);
    }

    @Override
    public void wyjazd(Pojazd pojazd) {
        System.out.println("Pojazd wyjechal "+pojazd);
    }

    ArrayList<String> kolejkaWjazdowa = new ArrayList<>();

    Strefa strefaOsobowka = new Strefa();
    Strefa strefaMotor = new Strefa();
    Strefa strefaCiezarkowka = new Strefa();

    @Override
    public String toString() {
        return "Parking{" +
                "kolejkaWjazdowa=" + kolejkaWjazdowa +
                ", strefaOsobowka=" + strefaOsobowka +
                ", strefaMotor=" + strefaMotor +
                ", strefaCiezarkowka=" + strefaCiezarkowka +
                '}';
    }
}
