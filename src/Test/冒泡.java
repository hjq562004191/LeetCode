package Test;

import java.util.Comparator;

public class 冒泡{
    public static void main(String[] args) {
        Integer[] num = {9,8,3,6,4,2,1};
        sort(num, (Comparator<Integer>) (o1, o2) -> o1.compareTo(o2));
    }
    public static <T>void sort(T[] array,Comparator com){
        Comparator<T> comparator = com;
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (comparator.compare(array[j],array[j+1]) > 0){
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
