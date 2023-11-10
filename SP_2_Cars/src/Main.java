import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();


            GasolinCar car1 = new GasolinCar("ABC123", "Audi", "A5", 5, 25) {
                electricCar car2 = new electricCar("AQC789", "Tesla", "Y3", 5, 90);
                DieselCar car3 = new DieselCar("DFE890", "BMW", "M67", 5, 20, true) {

            fleet.addCars(GasolinCar);
            fleet.addCar(car2);
            fleet.addCar(car3);

            System.out.println(fleet);
            System.out.println("Toal Registration Fee for Fleet: "+fleet.getTotalRegistrationFeeForFleet()+"DKK");

                };

            };
        }}

