package LinkedListBasics;

public class MainLL {

    public static void main(String[] args) {

        LL first=new LL();

        first.insertFirst(44);
        first.insertFirst(34);
        first.insertFirst(14);
        first.insertFirst(4);
        first.insertLast(66);

//        System.out.println(first.size);
        first.display();
        first.insert(7,3);
        first.display();
    }
}
