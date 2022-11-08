public class Car extends Vehicule{
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "je suis une " + getBrand() + " et je fait vroum vroum vroum!Quand je ne suis pas chez le garagiste";
    }
    
}