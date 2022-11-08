public abstract class Vehicule {

    private String brand;
    private int kilometers;

    public Vehicule(String brand, int kms) {
        this.brand = brand;
        this.kilometers = kms;
    }
    public String getBrand() {
        return this.brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKilometers(int kms) {
        this.kilometers = kms;
    }

    public abstract String doStuff();
}  