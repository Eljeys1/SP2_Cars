 abstract class GasolinCar extends AFuelCar {
     public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre) {
         super(registrationNumber, make, model, numberOfDoors, kmPerLitre);
     }





     String getFuelType() {
         return "Gasoline";
     }


     public int getRegistrationFee() {
         int KmPerLitre = KmPerLitre();

         if (KmPerLitre >= 20 && KmPerLitre <= 50) {
             return 330;
         } else if (KmPerLitre >= 15 && KmPerLitre < 20) {
             return 1050;
         } else if (KmPerLitre >= 10 && KmPerLitre < 15) {
             return 2340;
         } else if (KmPerLitre >= 5 && KmPerLitre < 10) {
             return 5500;
         } else {
             return 10470;


         }
     }
 }

