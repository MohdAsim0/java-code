package HashMap;

import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args) {

        HashMap<Integer,Integer> m1=new HashMap<>();

        m1.put(2,0);
        m1.put(3,1);
        m1.put(4,2);

        System.out.println(m1);
        System.out.println(m1.get(2));
    }
}
