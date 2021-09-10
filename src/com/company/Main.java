
package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        int[] a = new int[n];
        random1(n, a);
        System.out.print("Random array1: ");
        print(n, a);
        sort(n, a);
        System.out.print("Sorted array1: ");
        print(n, a);
        random2(n, a);
        System.out.print("Random array2: ");
        print(n, a);
        sort(n, a);
        System.out.print("Sorted array2: ");
        print(n, a);
    }
    public static void sort(int n, int [] a) { // сортировка пузырьком
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public static void print(int n, int [] a) { // вывод значений элементов массива на экран
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void random1(int n, int [] a) { //генерация массива целых чисел случайным образом с помощью метода random класса Math
        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random() * 50 - 15);
        }
    }

    public static void random2(int n, int [] a) { //генерация массива целых чисел случайным образом с помощью класса Random
        Random r = new Random();
        for (int i = 0; i < n; i++)
            a[i] = r.nextInt(50) - 15;
    }
}
