public class Hangar {
    public static void main(String[] args) {

        Car clio = new Car("clio", 20);
        
        Boat titanic = new Boat("Titanic", 2687);

        System.out.println(clio.doStuff());

        System.out.print(titanic.doStuff());
    }
}