package java_Programming;

public class Methods {
    public static void main(String[] args) {


        Methods M1 = new Methods();
        M1.doThis();
        M1.Addition(25,45);
       int x = M1.multiply(5,5);
        System.out.println(x);
    }

    public void doThis(){
        System.out.println("Do this Execution");
    }

    public void Addition( int num1, int num2){
        System.out.println(num1 + num2);
    }
    public  int  multiply(int num1 ,int num2 ){
        int num3 = num1 * num2;
        return num3;


    }
}
