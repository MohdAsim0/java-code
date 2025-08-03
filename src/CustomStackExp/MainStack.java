package CustomStackExp;

public class MainStack {
    public static void main(String[] args) throws Exception {
        CustomStack stack1=new CustomStack(5);
        stack1.push(12);
        stack1.push(11);
        stack1.push(13);
        stack1.push(15);
        stack1.push(19);


        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

    }
}
