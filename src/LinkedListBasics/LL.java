package LinkedListBasics;

public class LL {

    private Node head;
    private Node tail;
//    private int size;
     int size;

    //For Size Constructor
    public LL() {
        this.size = 0;
    }

    //Insert at the Starting of ll
    public void insertFirst(int val){
        //Creating a dabba for node
        Node newNode= new Node(val);

        newNode.next=head;
        head=newNode;

        //Initially there is nothing in LL
        if (tail==null){
            tail=head;
        }

        size+=1;
    }

    public void insertLast(int val){

        //nothing in ll
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node newNode= new Node(val);

        tail.next=newNode;
        tail=newNode;

        size++;
    }

    public void insert(int val,int index) {

        if (index<0||index>size){
            System.out.println("invalid Argument");
            return;
        }
        //index is first value
        if (index == 0) {
            insertFirst(val);
            return;
        }
        //if index is last value
        if (index == size) {
            insertLast(val);
            return;
        }

        //iterate to index-1 and  store temp.next in temp
        Node temp=head;
        for (int i =1; i <index ; i++) {
            temp=temp.next;
        }

        //create a newNode and make its next to temp.next
        Node newNode= new Node(val,temp.next);
        //and make temp.next to newNode
        temp.next=newNode;



        size++;



    }

    //To display LL
    public void display(){
        Node temp=head;

        while (temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }








    //Node Class
    static class Node{
        private int value;
        private Node next;

        //constructor to create a new node
        public Node(int val) {
            this.value = val;
        }

        //constructor to create a new node
        public Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }

    }

}
