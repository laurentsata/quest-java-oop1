public class Classroom {
    public static void main(String[] args) {

     Wilder jcvd = new Wilder("Jean-claude Van Damme", true);
        System.out.println(jcvd.whoAmI());

        Wilder hpfr = new Wilder("Henri Peifer", false);
        System.out.println(hpfr.whoAmI());

        Wilder sys = new Wilder("Sylverter Stallone", false);
        System.out.println(sys.whoAmI());
    }
}