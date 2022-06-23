package ru.sber.base.syntax;

public class Task4 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        double s=0;
        double min=1;
        double max =0;
        for(int i=0;i<arr.length;++i){
            arr[i]=Math.random();
            System.out.print(arr[i]+" ");
            s+=arr[i];
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println();
        System.out.println("maximum= "+max);
        System.out.println("minimum= "+min);
        System.out.println("average value= "+s/arr.length);
    }
}
