package CONTEST1.ImplementingQueueAcrossTwoStacks;

public class Test {
    public static void main(String[] args) {
        QueueMyOwn test = new QueueMyOwn();
        test.addElement(6);
        test.addElement(10);
        test.addElement(15);
        test.addElement(90);
        test.addElement(100);
        //System.out.println(test.toString());

        test.pop();
        //System.out.println(test.toString());
        test.peek();
        test.pop();
        test.peek();
        test.pop();
        test.peek();
    }
}
