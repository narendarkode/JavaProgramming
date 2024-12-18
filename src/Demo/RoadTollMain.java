package Demo;

public class RoadTollMain {
    public static void main(String[] args) {
        Road_Toll R1 = new Road_Toll();

        R1.tireCount= 4;
        R1.Vehicle_Type="Sedan";
        R1.TollAmount();

        Road_Toll R2 = new Road_Toll("Truck", 6 );
        R2.TollAmount();



    }
}
