package Hashset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet();
        set.add(44);
        set.add(443);
        set.add(4422);

        Iterator <Integer> i=set.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }


        //clone method
//        Set<Integer> num= new HashSet<>();
//        num= (Set<Integer>) set.clone();
//        System.out.println(num);


        System.out.println(set.contains(42));
        System.out.println(set.remove(44));
        System.out.println(set.spliterator());


//        set.clear();


//        System.out.println(set);
//        System.out.println(set.size());

    }
}
