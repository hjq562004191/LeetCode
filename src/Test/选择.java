package Test;

import java.util.Comparator;

public class 选择 {
    public static void main(String[] args) {
        Integer[] num = {1,6,71,6,3,4,5,3};
        sort(num, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }

    public static <T>void  sort(T[] array, Comparator comparator){
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i+1; j < len; j++) {
                if (comparator.compare(array[i],array[j]) > 0){
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
