package SetPrecision;

import java.util.Formatter;

public class PrecisionSetting2 {
    public static void main(String[] args) {
        Formatter fm=new Formatter();

        // Format 4 decimal places
        fm.format("%.4f", 123.1);
        System.out.println(fm);
        fm.close();

        //Display atmost 15 characters in a string
        fm=new Formatter();
        fm.format("%.15s", "Learning with Gfg is easy quick");
        System.out.println(fm);
        fm.close();

        // Declaring and initializing double variable
        double num = 3.141414141414;
        System.out.println(Math.round(num*10000000));

        // Rounding off above double number
        // to 7 precision
        double ans = Math.round(num * 10000000) / 10000000.0;
        System.out.println(ans);
    }
}
