package ru.sber.base.syntax;

public class Task5 {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++){
            int count = 0;
            int del = 1;
            while ((count <= 3)&(del <= i)){
                if (i % del == 0){
                    count++;
                }
                del++;
            }
            if (count <= 2){
                System.out.print(i + " ");
            }}
    }
}
