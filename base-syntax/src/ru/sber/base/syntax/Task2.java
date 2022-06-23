package ru.sber.base.syntax;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        int s;
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        int gap = array.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        s=array[c];
                        array[c]=array[c+gap];
                        array[c+gap]=s;
                    }
                }
            }
            gap = gap / 2;
        }
        System.out.println();
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
}
