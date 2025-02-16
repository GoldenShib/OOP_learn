// Đóng gói Encapsulation

/*
Đóng gói là quá trình che giấu thông tin và chỉ cho phép truy cập thông qua các phương thức được công khai.

Các thuộc tính của đối tượng thường được định nghĩa là private, và chúng được truy cập và thay đổi thông qua các phương thức getter và setter.
*/
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}