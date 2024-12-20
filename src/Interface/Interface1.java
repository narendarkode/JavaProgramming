package Interface;

public interface Interface1 {

     void doThis();

     static  void xyz(){
          System.out.println("Hello world");
     }
   default void uvw(){
        System.out.println("Default");
   }
}
