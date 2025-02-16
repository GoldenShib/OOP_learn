 class ElectricCar extends Car{
     public ElectricCar(String brand, String model) {
         super(brand, model);
     }

     @Override
     public void accelerate() {
         System.out.println(getBrand() + " " + getModel() + " is accelerating with a roar.");
     }
}

/*Lớp ElectricCar: Lớp này kế thừa từ Car và ghi đè phương thức accelerate() để định nghĩa cách tăng tốc đặc trưng cho xe điện.
Constructor của ElectricCar sử dụng super(brand, model); để gọi constructor của lớp cha Car và khởi tạo các thuộc tính brand và model
 */
