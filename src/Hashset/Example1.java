package Hashset;

import java.util.HashSet;

public class Example1 {

    public static void main(String[] args) {

//       we are adding books to set and printing all the books.
        HashSet<Books> set = new HashSet<>();

        Books b1 = new Books(12, "Asim", "KhanBrothers", "Arihant", 3333);
        Books b2 = new Books(13, "Dsa", "Kunal", "Youtube", 200);
        Books b3 = new Books(14, "Clouds", "SKMaurya", "Bansal", 1000);

        set.add(b1);
        set.add(b2);
        set.add(b3);

        for(Books b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.price);

        }

    }
}


class Books{
    int id;
    String name,author,publisher;
    int price;

    //constructor
    Books(int id,String name,String author,String publisher,int price){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.price=price;
    }

}
