
// LINKEDLIST: là một trong các lớp trong Java Collections Framework
// Nó là một danh sách liên kết kép, nghĩa là mỗi phần tử trong danh sách chứa liên kết đến phần tử trước đó và phần tử sau đó.
// Điều này giúp việc chèn và xóa phần tử ở bất kỳ vị trí nào trong danh sách trở nên hiệu quả hơn

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<SinhVien> sinhViens = new java.util.LinkedList<>();
        // Thêm sinh viên vào danh sách
        sinhViens.add(new SinhVien("Nguyen Van A", 20));
        sinhViens.add(new SinhVien("Tran Thi B", 21));
        sinhViens.add(new SinhVien("Le Van C", 19));

        // Hiển thị danh sách sinh viên
        System.out.println("Danh sách sinh viên:");
        for (SinhVien sv : sinhViens) {
            System.out.println(sv);
        }
        // Chèn sinh viên vào vị trí đầu và cuối danh sách
        sinhViens.addFirst(new SinhVien("Pham An D", 22));
        sinhViens.addLast(new SinhVien("Dang An", 23));

        // Hiển thị danh sách sinh viên sau khi chèn
        System.out.println("\nDanh sách sinh viên sau khi chèn:");
        for (SinhVien sv : sinhViens) {
            System.out.println(sv);
        }
        // Xóa sinh viên khỏi danh sách
        sinhViens.removeFirst();
        sinhViens.removeLast();

        // Hiển thị danh sách sinh viên sau khi xóa
        System.out.println("\nDanh sách sinh viên sau khi xóa:");
        for (SinhVien sv : sinhViens) {
            System.out.println(sv);

        }
    }
}
