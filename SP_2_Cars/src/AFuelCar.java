abstract class AFuelCar extends ACar {
    private int kmPerLitre;
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre){
        super(registrationNumber,make,model,numberOfDoors);
        this.kmPerLitre=kmPerLitre;
    }
    String getFuelType(){
        return null;
    }


    int KmPerLitre() {
        this.kmPerLitre=kmPerLitre;
        return kmPerLitre;
    }

    abstract int RegistrationFee();
}
