public class Boat extends Vehicule{
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "je suis le " + getBrand() +" et je fais glou glou";
    }
}