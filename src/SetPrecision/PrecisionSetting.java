package SetPrecision;
//Different Methods to Set Precision in Double Values
// Using format() Method of String class
//Using round() method of Math class

public class PrecisionSetting {

    public static void main(String[] args) {

        double a=12;
        // Setting the precision to 10 places
        System.out.println(String.format("%.5f",a));

        double b = 1;
        // Setting the precision to 10 places
        System.out.printf("%.10f%n", b);  //this also works

    }
}
