package com.itheima.chapter03;

public class Exervice02 {
    public static void main(String[] args) {
        int n = 8;
        int num = getNum(n);
        System.out.println("第"+n+"个数的数值是："+num);
    }
    public static int getNum(int n) {
        if (n == 1){
            return 0;
        } else if (n == 2 || n == 3) {
            return 1;
        } else {
            return getNum(n - 1) + getNum(n - 2);
        }
    }
}
