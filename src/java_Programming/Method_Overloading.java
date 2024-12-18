package java_Programming;

public class Method_Overloading {
    // Methods having the same name as long as they differ with the Arguments( in terms of the data type of the Arguments, no of arguments or order)

    public void Addition(int num1, int num2){
        System.out.println( num1 + num2);
    }
    public void Addition(double num1, double num2){
        System.out.println( num1 - num2);
    }

    public void Addition(double num1, int num2){
        System.out.println( num1 + num2);
    }

    public void Addition(int num1, double num2){
        System.out.println( num1 + num2);
    }
}
