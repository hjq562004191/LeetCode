package Test;

import java.util.Comparator;

public class 插入 {
    public static void main(String[] args) {
        Integer[] num = {9,5,2,7};
        sort(num, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }
    public static <T>void sort(T[] array, Comparator comparator){
        int len = array.length;
        for (int i = 1; i < len; i++) {
            T temp = array[i];
            int j;
            for (j = i - 1; j >= 0 && comparator.compare(array[j],temp) > 0; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
