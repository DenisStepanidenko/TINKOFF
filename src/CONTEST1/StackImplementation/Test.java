package CONTEST1.StackImplementation;

public class Test {
    public static void main(String[] args) {
        StackOwn test = new StackOwn();

        test.push(5);
        test.push(10);
        test.push(11);

        System.out.println(test.peek());
        test.pop();
        System.out.println(test.peek());
    }
}
