package Test;

import java.util.Comparator;
import java.util.Objects;

/**
 * 用泛型实现栈，并利用Comparator<T>实现排序
 * @param <T>
 */
public class StackTest<T> {
    int top = 1;
    T[] arr = (T[]) new Object[1000];
    Comparator<T> comparator = null;

    public StackTest(Comparator<T> comparator) {
        arr[0] = null;
        this.comparator = comparator;
    }

    public void push(T m) {
            arr[top] = m;
            top++;
    }

    public T pop() {
        if (top > 0) {
            arr[0] = null;
            return arr[--top];
        } else {
            return null;
        }
    }

    public T getMin() {
        if (top >= 1) {
            if (arr[0] == null) {
                arr[0] = arr[1];
                for (int i = 1; i < top; i++) {
                    if (comparator.compare(arr[0], arr[i]) > 0) {
                        arr[0] = arr[i];
                    }
                }
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        StackTest<Person> stack = new StackTest<>(Comparator.comparing(Person::getName));
        stack.push(new Person(1,"zaaaa"));
        stack.push(new Person(2,"bbbbb"));
        stack.push(new Person(3,"acccc"));
        System.out.println(stack.getMin());
        System.out.println(stack.pop());
        System.out.println(stack.getMin());
    }


}
class Person {
    private int num;
    private String name;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}