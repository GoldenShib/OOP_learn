

/*
    Tinh trừu tượng Abstraction
    Kế thừa một lần
    Có thể chứa code thực thi
    Có thể có các trường (fields)
    Tính kế thừa: Các lớp con kế thừa từ lớp trừu tượng sử dụng từ khóa extends
 */

abstract class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.model=model;
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void startEngine(){
        System.out.println("brand "+ brand + " Model "+ model);
    }
    public abstract void accelerate();

}
