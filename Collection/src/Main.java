/*
        COLLECTION: LIST & SET
        List : ArrayList & LinkedList

 */
//      List : Trong Java Collection Framework, List sẽ lưu trữ các phần tử theo chỉ số (index)
//      Trong List sẽ có :
//      ArrayList : Mảng động có thể thay đổi theo kích thước
//      LinkedList: là 1 danh sách liên kết kép

//      SET : dùng khi bạn muốn lưu trữ các phần tử KHÔNG TRÙNG LẶP và không quan tâm thứ tự cụ thể.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // áp dụng ArrayList để quản lý danh sách sinh viên
        ArrayList<SinhVien> sinhVienList = new ArrayList<>();
        sinhVienList.add(new SinhVien("Minh", 23));
        sinhVienList.add(new SinhVien("Tan", 22));
        sinhVienList.add(new SinhVien("Vu", 18));
        // hiển thị danh sách sinh viên
        for (SinhVien s : sinhVienList) {
            System.out.println(" Tên: " + s.getTen().toString() + " Tuổi : " + s.getTuoi());
        }
        //Sắp xếp danh sách sinh viên theo tuổi sử dụng sort trong Collection Framework
        // Sort này sử dụng gọi là TimSort : là 1 thuật toán kết hợp giữa MergeSort và InsertionSort
        Collections.sort(sinhVienList, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien s1, SinhVien s2) {
                return Integer.compare(s1.getTuoi(), s2.getTuoi());
            }
        });
        System.out.println("\n Danh sách sinh viên sau khi sắp xếp theo tuổi");
        //hiển thị danh sách sinh viên sau khi đã sắp xếp
        for (SinhVien s : sinhVienList) {
            System.out.println(" Tên: " + s.getTen().toString() + " Tuổi : " + s.getTuoi());
        }
        //Tìm kiếm sinh viên theo tên
        System.out.println("Nhập tên sinh viên cần tìm: ");
        String chuoiTimKiem = sc.nextLine();
        ArrayList<SinhVien> sinhVienTimThay = timKiemSinhVien(sinhVienList, chuoiTimKiem);
        System.out.println("Kết quả sinh viên cần tìm: ");
        for(SinhVien s : sinhVienTimThay)
        {
            System.out.println(s);
        }

        sc.close();

    }

    private static ArrayList<SinhVien> timKiemSinhVien(ArrayList<SinhVien> sinhViens, String chuoi) {
        ArrayList<SinhVien> ketQuaTimKiem = new ArrayList<>();
        Pattern p = Pattern.compile(".*" + chuoi + ".*", Pattern.CASE_INSENSITIVE);
        /*Add sinh vien vao List neu tim thay ket qua*/
        for (SinhVien s : sinhViens) {
            if (p.matcher(s.getTen()).matches()) {
                ketQuaTimKiem.add(s);
            }
        }
        return ketQuaTimKiem;
    }
}
// PATTERN LÀ 1 BIỂU THỨC CHÍNH QUY (REGULAR EXPRESSION) ĐỂ KIỂM TRA CHUỖI CÓ KHỚP VỚI MẪU CẦN TÌM HAY KHÔNG
// ".*" LÀ ĐẠI DIỆN CHO BẤT KÌ KÍ TỰ XUẤT HIỆN KHÔNG GIỚI HẠN SỐ LẦN CẢ TRƯỚC VÀ SAU CHUỖI
// Pattern.CASE_INSENSITIVE GIÚP SO SÁNH CHUỖI KHỚP MÀ KHÔNG CẦN PHÂN BIỆT CHỮ HOA LẪN THƯỜNG