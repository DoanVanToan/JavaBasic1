package kekiru.toandoan.com.javabasic1.homework;

import java.util.Scanner;

/**
 * Created by framgia on 09/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        // Viết 1 hàm nhập nhân viên từ bàn phím
        System.out.println("Nhập nhân viên cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ của nhân viên: ");
        String lastName = scanner.nextLine();
        System.out.println("Nhập tên của nhân viên");
        String firstName = scanner.nextLine();
        System.out.println("Nhập năm sinh: ");
        int dateOfBirth = scanner.nextInt();
        System.out.println("Nhập giới tính: 0-nam %n1-nu %n2-ko xác định");
        int gender = scanner.nextInt();

        // Tạo đối tượng để nhận dữ liệu từ người dùng
        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setDateOfBirth(dateOfBirth);
        employee.setGender(gender);

        // In thông tin của người dùng
        System.out.println(employee.toString());
        // Kiểm tra người dùng có phải sinh năm nhuận hay không
        if (employee.isLeapYear()){
            System.out.println("Nhân viên sinh năm nhuận");
        }else {
            System.out.println("Nhân viên không sinh năm nhuận");
        }
    }
}
