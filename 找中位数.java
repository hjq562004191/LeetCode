package com;

public class 找中位数 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i = 0 , j = 0 , k = 0;
        int[] a = new int[l1+l2];
        while (i!=l1 && j!=l2){
            if (nums1[i] > nums2[j]){
                a[k++] = nums2[j++];
            }else {
                a[k++] = nums1[i++];
            }
        }
        while (i==l1 && j!=l2){
            a[k++] = nums2[j++];
        }
        while (i!=l1 && j==l2){
            a[k++] = nums1[i++];
        }
        double m ;
        if (a.length %2 == 0){
            m = ( a[a.length / 2] + a[a.length / 2 -1] ) / 2.0;
        }else {
            m = a[a.length/2] /1.0;
        }
        return m;
    }

    public static void main(String[] args) {
        int[] a = {1,3};
        int[] b = {2};
        System.out.println(findMedianSortedArrays(a,b));
    }
}
