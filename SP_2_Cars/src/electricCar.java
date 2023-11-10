 class electricCar extends ACar {
    private int batteryCapacityKWH;
    private int maxRangeKm;

    public electricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacityKWh){
        super(registrationNumber,make,model,numberOfDoors);
        this.batteryCapacityKWH = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
    }

    int getBatteryCapacityKWH(){
        return batteryCapacityKWH;
    }

    int getMaxRangeKm(){
        return maxRangeKm;
    }
    int getWhPerKm(){
        return (int) (batteryCapacityKWH/maxRangeKm/91.25*100);
    }

     @Override
     public int getRegistrationFee() {
         return 0;
     }
 }
