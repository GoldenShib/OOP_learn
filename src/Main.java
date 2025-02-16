import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Bob", 25));
        personList.add(new Person("John", 52));
        personList.add(new Person("Alice", 18));
        for (Person p : personList) {
            System.out.println("\nName " + p.getName() + " Age " + p.getAge());
        }
        System.out.println("\n");
        Animal a = new Animal();
        a.eat(); // class cha chỉ có method Eat
        Dog d = new Dog();
        d.makeSound();
        d.eat();
        // Class con là Dog kế thừa từ animal nên có thể xài được method của cha và method của mình !!!
        ElectricCar tesla = new ElectricCar("Tesla", "Model S");
        GasoLineCar bmw = new GasoLineCar("BMW", "M3");

        tesla.startEngine();
        tesla.accelerate();

        bmw.startEngine();
        bmw.accelerate();
        System.out.println("\n");
        Drivable mySuperCar = new SuperCar();
        mySuperCar.drive();
    }
}

