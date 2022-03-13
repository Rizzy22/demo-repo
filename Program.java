public class Program {

    public static void main(String[] args) {

        String x = "Boys";
        String y = "Girls";
        String Temp;

        Temp = x;
        x = "Girls";
        y = "Boys";

        System.out.println("x =" + x);
        System.out.println("y =" + y);
        System.out.println("Temp =" + Temp);
    }
}