package StringBuilder;
  //String Buildder class is used to create mutable (modified ) String
//StringBuilder Methods are insert, replace, delete, reverse
public class StringBuilderClass {
    public static void main(String[] args) {

        String str1= "i";
        str1= str1+" love ";
        str1 =str1+" java ";

        System.out.println(str1);
       // I/ love / i love /java / i love java

        StringBuilder sb1 = new StringBuilder( " I ");
        sb1.append("love");
        sb1.append(" java ");

        System.out.println(sb1);


        StringBuilder sb2 = new StringBuilder("Learning is fun");
        sb2.insert(9,"java ");

        sb2.replace(0,8,"Studying");
        System.out.println(sb2);

    }
}
