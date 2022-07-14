public class LambdaProgram {
    public static String mZero(Zero worker) {return worker.doSomething();}
    public static double mOne(double x1, One worker){return worker.doSomething1(x1);}
    public static double mTwo(double x1, double x2, Two worker){return worker.doSomething2(x1,x2);}
}