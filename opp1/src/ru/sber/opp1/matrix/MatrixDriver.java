package ru.sber.opp1.matrix;

public class MatrixDriver {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2,2);
        Matrix matrix2 = new Matrix(2,2);
        matrix1.all();
        matrix2.all();
        matrix1.Print();
        matrix1.setValue(1,1,1);
        System.out.println();
        System.out.println("result1");
        matrix1.Print();
        matrix1.MiltiplicationNumber(0.02);
        System.out.println();
        System.out.println("result2");
        matrix1.Print();
        matrix1.SummaMatrix(matrix2);
        System.out.println();
        System.out.println("result3");
        matrix1.Print();
        matrix1.MiltiplicationMatrix(matrix2);
        System.out.println();
        System.out.println("result4");
        matrix1.Print();
    }
}
