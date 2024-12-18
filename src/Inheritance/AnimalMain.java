package Inheritance;

public class AnimalMain {
    public static void main(String[] args) {


        Animal a;

        Dog d1 = new Dog();

        d1.whoAmI();

        Cat c1 = new Cat();
        c1.whoAmI();



        a = new Dog();

        a.whoAmI();

       a = new Cat();
        a.whoAmI();
    }

}
