
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store students with an Integer ID as the key and SinhVien object as the value
        HashMap<Integer, SinhVien> sinhVienMap = new HashMap<>();

        // Add students to the HashMap
        sinhVienMap.put(1, new SinhVien("Nguyen Van A", 20));
        sinhVienMap.put(2, new SinhVien("Tran Thi B", 21));
        sinhVienMap.put(3, new SinhVien("Le Van C", 19));

        // Display the list of students
        System.out.println("Danh sách sinh viên:");
        for (Map.Entry<Integer, SinhVien> entry : sinhVienMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }

        // Update student information
        sinhVienMap.put(2, new SinhVien("Tran Thi B Updated", 22));

        // Display the list of students after updating
        System.out.println("\nDanh sách sinh viên sau khi cập nhật:");
        for (Map.Entry<Integer, SinhVien> entry : sinhVienMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }

        // Remove a student from the HashMap
        sinhVienMap.remove(1);

        // Display the list of students after removal
        System.out.println("\nDanh sách sinh viên sau khi xóa:");
        for (Map.Entry<Integer, SinhVien> entry : sinhVienMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}


