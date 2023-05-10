package CONTEST1.ImplementingQueueAcrossTwoStacks;

import java.util.Stack;

//import static sun.security.util.ArrayUtil.reverse;

public class QueueMyOwn {
    private Stack<Integer> left = new Stack<>();
    private Stack<Integer> right = new Stack<>();

    public void addElement(int x){
        right.push(x);
    }

    public void pop(){
        if(left.size() == 0){
            while(right.size()!=0){
                //System.out.println(right.peek());
                left.push(right.pop());
            }
        }
        //System.out.println(right.toString());
        System.out.println("Удаляемый элемент :" + left.peek());
        left.pop();
    }
    public void peek(){
        if(left.size() == 0){
            while(right.size()!=0){
                left.add(right.pop());
            }
            System.out.println("Следующий элемент " + left.peek());
        }
        else{
            System.out.println("Следующий элемент " + left.peek());
        }
    }

    public void size(){
        System.out.println("Размер очереди " + left.size() + right.size());
    }

    @Override
    public String toString(){
        if(left.size() == 0 && right.size() == 0){
            System.out.println(left.toString());
        }
        else if(left.size() == 0){
            return right.toString();
        }
        else if(right.size() == 0){
            return left.toString();
        }
        return left.toString() + right.toString();

    }
}
