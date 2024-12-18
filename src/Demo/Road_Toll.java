package Demo;

public class Road_Toll {

   public  String Vehicle_Type ;
      int tireCount ;

    public void TollAmount(){
        if(tireCount ==2){
            System.out.println("your toll amount is 0");
        } else if (tireCount ==4){
            System.out.println("your toll amount is  10");
        }else if (tireCount >4){
            System.out.println("your toll amount is  20");
        }else{
            System.out.println("Incorrect tire count");
        }
    }

    public Road_Toll() {
        /*Constructor is very similar to a method and the main difference
         is name of the constructor is  similar to the class,and constructor may not have return type.and also constructor is not consider as a member of a class
         (no argument Constructor)*/
    }
//   public Road_Toll(String Vehicle_type, int tireCount ){
//        this.Vehicle_Type = Vehicle_type; //Here this refer to the member of current class
//        this.tireCount= tireCount;
//   }


    public Road_Toll(String vehicle_Type, int tireCount) {
        this.Vehicle_Type = vehicle_Type;
        this.tireCount = tireCount;
    }
    //Constructor overloading: It means having the same name with (distingush)different arguments
}
