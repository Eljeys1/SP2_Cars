public abstract class ACar implements Car {
    private String registrationNumber;
    private String make;

    private String model;

    private int numberOfDoors;
    public ACar(String RegistrationNumber, String Make, String model, int numberOfDoors) {
        this.getRegistrationNumber();
        this.getMake();
        this.getModel();
        this.getNumberOfDoors();
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }


}
