import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car){
        cars.add(car);
    }

    int getTotalRegistrationFeeForFleet(){
        int totalRegistrationFee = 0;
        for(Car car : cars){
            totalRegistrationFee += car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    @Override
    public String toString(){
        StringBuilder fleetInfo = new StringBuilder("Fleet of Cars: \n");
        for(Car car : cars){
            fleetInfo.append(car.toString()).append("\n");
        }
        return fleetInfo.toString();
    }
}
