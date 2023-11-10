 abstract class DieselCar extends AFuelCar {
     private  boolean hasParticleFilter;

   public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre, boolean hasParticleFilter) {
         super(registrationNumber, make, model, numberOfDoors, kmPerLitre);
         this.hasParticleFilter = hasParticleFilter;

     }

     @Override
     String getFuelType() {
         return "Disel";
     }

     boolean hasParticleFilter() {
         return hasParticleFilter;
     }

     @Override
     public int getRegistrationFee() {
         int kmPerLitre = 0;
         int registraionFee = 0;

         if (kmPerLitre>= 20 && kmPerLitre <= 50) {
             registraionFee = 130;
         } else if (kmPerLitre >= 15 && kmPerLitre < 20) {
             registraionFee = 1390;
         } else if (kmPerLitre > 10 && kmPerLitre < 15) {
             registraionFee = 1850;
         } else if (kmPerLitre >= 5 && kmPerLitre < 10) {
             registraionFee = 2770;
         } else {
             registraionFee = 15260;
         }
         if (!hasParticleFilter) {
             registraionFee += 1000;
         }
         return registraionFee;
     }
 }
