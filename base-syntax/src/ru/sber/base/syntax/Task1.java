package ru.sber.base.syntax;

public class Task1 {
    public static void main(String[] args) {
        int[] arr ={0,56,4,35,67,34,657,56};
        System.out.println("unsorted array");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int dop =0;
        for(int i=0;i<arr.length-1; i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j-1]>arr[j]){
                    dop =arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=dop;
                }
            }
        }
        System.out.println();
        System.out.println("sorted array");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

