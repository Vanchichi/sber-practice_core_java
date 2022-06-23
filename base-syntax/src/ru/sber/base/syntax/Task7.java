package ru.sber.base.syntax;

public class Task7 {
    public static void main(String[] args) {
        int f=1;
        int f1=1;
        int f2;
        for(int i=0;i<11;i++){
            System.out.print(f+" ");
            f2=f+f1;
            f=f1;
            f1=f2;
        }
    }
}
