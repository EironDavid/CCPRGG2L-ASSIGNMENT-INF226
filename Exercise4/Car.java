public class Car {

    String brand;
    String color;
    int Speed;
    String ownerName;

    Car(String carBrand, String carColor, int carSpeed ,String  carOwnerName) {
        this.brand = carBrand;
        this.color = carColor;
        this.Speed = carSpeed;
        this.ownerName = carOwnerName;
    }
       
    
        void showOwner() {
            System.out.println(" I Recieve a car that is " + this.brand + " The color is " + this.color + " The speed Limit Speed is " + this.Speed + "and the ownerName is " + this.ownerName);
        }

    }
