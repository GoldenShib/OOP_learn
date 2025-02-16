public class GasoLineCar extends Car{
    public GasoLineCar(String brand, String model)
    {
        super(brand,model);
    }
    @Override
    public void accelerate()
    {
        System.out.println(getBrand() + " " + getModel() + " is accelerating with a roar.");
    }
}
/*
Lớp GasolineCar: Tương tự, lớp này kế thừa từ Car và ghi đè phương thức accelerate() để định nghĩa cách tăng tốc đặc trưng cho xe chạy xăng.
Constructor của GasolineCar cũng sử dụng super(brand, model); để gọi constructor của lớp cha Car
 */
