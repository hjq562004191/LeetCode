package Test;

import java.util.Comparator;

public class 快速排序 {
    public static void main(String[] args) {
        Character[] arrays = {'c','d','g','h','a'};
        quicksort(arrays, 0, arrays.length - 1, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i < arrays.length ; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
    public static <T>int  sort(T[] arrays, int left,int right,Comparator comparator){
        T temp = arrays[left];
        while (left < right){
            while (right > left ){
                if ( comparator.compare(temp,arrays[right]) > 0) {
                    arrays[left] = arrays[right];
                    break;
                }else {
                    right--;
                }
            }
            while (right > left){
                if (comparator.compare(temp,arrays[left]) < 0) {
                    arrays[right] = arrays[left];
                    break;
                }else {
                    left++;
                }
            }
        }
        arrays[left] = temp;
        return left;
    }

    public static <T> void quicksort(T[] arrays,int left,int right,Comparator comparator){
        if (left < right){
            int base = sort(arrays,left,right,comparator);
            quicksort(arrays,left,base - 1,comparator);
            quicksort(arrays,base + 1,right,comparator);
        }
    }

}
