package Stringss;

public class Stringbuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Asim");
        System.out.println(sb);

        //reverse a String
//        sb.reverse();

//        Get A Character from Index
        System.out.println(sb.charAt(0));

        //set char of an index
        sb.setCharAt(1,'f');

        //Inset at particular index
        sb.insert(2,'Z');
        sb.delete(0,1);
        System.out.println(sb);

    }
}
