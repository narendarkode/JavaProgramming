package Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("please enter the string");
        String st2 = s1.nextLine();


        System.out.println(st2);

        String temp = "";

        for (int i =0; i<=st2.length()-1;i++){
            temp= st2.charAt(i)+ temp;
            System.out.println("Reverse String " + temp);
        }
        //System.out.println("Reverse String " + temp);



    }
}
