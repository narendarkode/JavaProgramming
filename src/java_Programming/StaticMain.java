package java_Programming;

public class StaticMain {

    public static void main(String[] args) {
        Static_Keyword S1= new Static_Keyword();
        Static_Keyword s2 = new Static_Keyword();

        S1.age =10;
        S1.grade =" 5TH";
        Static_Keyword.name = "SAI";

        s2.age =10;
        s2.grade =" 5TH";
        Static_Keyword.name = "ravi";

        S1.displayDetails();
        s2.displayDetails();


    }
}
