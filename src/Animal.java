public class Animal {
    public void eat()
    {
        System.out.println(" Thís Animal eats ");
    }

}

    //Class Dog kế thừa từ class cha là Animal sở hữu các phương thức của lớp cha và có thể tạo ra các phương thức riêng cho mình
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Gau Gau Gau!!!!");
    }
}
