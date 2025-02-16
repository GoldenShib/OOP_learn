public interface Drivable {
    void drive();
    void drift();
}
class SuperCar implements Drivable
{
    @Override
    public void drive()
    {
        System.out.println("Car is driving");
    }
    @Override
   public void drift()
    {
        System.out.println("car is drifting");
    }
}
/* interface (Giao diện)
Chỉ chứa các phương thức định nghĩa và phương thức tĩnh (static methods).

Không chứa các trường dữ liệu: Giao diện chỉ có thể chứa các hằng số (public static final).

Được sử dụng để định nghĩa các hành vi mà các lớp phải thực hiện:
 Các lớp thực hiện giao diện (implements) sẽ cung cấp phần thân cho các phương thức được định nghĩa trong giao diện.
 */