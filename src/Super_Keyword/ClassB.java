package Super_Keyword;

public class ClassB extends  ClassA {
   int num1;
    public void doThis(){
        System.out.println("Do this from A");
    }
   public void xyz(){
       System.out.println(num1);
        super.doThis();
       System.out.println("XYZ Execution");
   }


}
