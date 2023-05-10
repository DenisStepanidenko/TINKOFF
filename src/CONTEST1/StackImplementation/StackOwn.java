package CONTEST1.StackImplementation;

import java.util.ArrayList;
import java.util.List;

public class StackOwn {
    List<Integer> numbers = new ArrayList<>();

    public void push(int x) {
        numbers.add(x);
    }

    public void clear() {
        numbers = new ArrayList<>();
    }

    public void pop() {
        if (numbers.isEmpty()) {
            System.out.println("Стек пуст, удалить элементы из него нельзя");
        } else {
            numbers.remove(numbers.size() - 1);
        }
    }

    public int peek() {
        return numbers.get(numbers.size() - 1);
    }

    public void isEmpty() {
        if (numbers.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
