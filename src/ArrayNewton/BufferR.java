package ArrayNewton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferR {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        String name=reader.readLine();
//        System.out.println(name);
//
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader reader=new BufferedReader(r);


        int val=Integer.parseInt(reader.readLine());
        System.out.println(val);





    }
}
