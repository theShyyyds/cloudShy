package com.cloud.demo;

public class Test {

    public static void main(String[] args) {
        //冒泡排序算法
        int[] numbers = new int[]{1, 5, 8, 2, 3, 9, 4};
        int length = numbers.length;
        //需进行length-1次冒泡
        for (int i = 0; i < length - 1; i++) {
            for (int j = length - 1; j > i; j--) {
                if (numbers[j] > numbers[j - 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }

        System.out.println("排序后的结果是:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
