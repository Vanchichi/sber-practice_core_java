package ru.sber.opp1.matrix;

public class Matrix {
    private int row;
    private int columns;
    private double[][] matrix;
    public Matrix(int row,int columns){
        this.row=row;
        this.columns=columns;
        matrix = new double[row][columns];
    }
    public void all (){
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=Math.random();
            }
        }
    }
    public void setValue (int i, int j, double value){
        matrix[i][j]=value;
    }
    public void Print(){
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void MiltiplicationNumber(double m){
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=matrix[i][j]*m;
            }
        }
    }
    public void SummaMatrix (Matrix m){
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]+=m.matrix[i][j];
            }
        }
    }
    public void MiltiplicationMatrix (Matrix m){
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=matrix[i][j]*m.matrix[i][j];
            }
        }
    }
}
