package kekiru.toandoan.com.javabasic1.first_package;

import java.util.Scanner;

/**
 * Created by framgia on 07/03/2017.
 */
public class JavaBasic1 {
    /*
     Khai báo biến gồm 3 thành phần
     0. access modifier ( đối với instance variable)
      - private : truy xuất trong cùng 1 lớp
      - protected: truy xuất trong chính nó, trong class con
      - default: truy xuất trong package
      - public: truy xuất mọi nơi.
     1. Kiểu dữ liệu
      - int
      - char
      - float
      - double
      - long
      - String
      - Object
     2. Tên biến
      - Chứa các chữ cái, chữ số, dấu gạch dưới _ , kí tự $
      - Bắt đầu bằng chữ cái, _, $ (ko bắt đầu bằng chữ số)
      - Không trùng với từ khóa
      - dễ gợi nhớ
      - Convention Framgia :
       + non public start with m.
      - Biến instance hay (instance variable) được khai báo ngay dưới class và có thể
      sử dụng trong toàn bộ class được gọi là biến instance
     3. Giá trị mặc định (not require)
    */
    private int mAge = 10;
    private int mDateOfBirth = 1996;
    public String name;

    // format code Ctrl + Alt + L
    public static void main(String[] args) {
        /*
        print: in ra màn hình, sau khi in con trỏ ở ngay dòng hiện tại
        println: in ra màn hình, sau khi in con trỏ nhảy xuống dòng dưới
         */
        System.out.println("Hello world");
        int firstNumber = 10;
        int secondNumber = 20;
	int thirdNumber = 30;
        System.out.println("Số thứ nhất :" + firstNumber);
        System.out.println("Số thứ hai :" + secondNumber);
	System.out.println("Số thứ ba :" + thirdNumber);
        /*
        Sử dụng format để định dạng dữ liệu đầu ra
        - %d để in ra kiểu số nguyên (int, long)
        - %n để in ra kí tự xuống dòng
        - %s để in ra string (chảr, string)
        - %f để in ra kiểu số thực (floatm double)
        - %t để in ra 1 tab
         */
        long thirdNumber = 3;
        String className = "HEDSPI";
        int totalStudent = 30;
        System.out.format("Số thứ nhất : %d \n%n", firstNumber);
        System.out.format("Số thứ nhất : %d%n", firstNumber);
        System.out.format("Tên lớp học : %s%n", className);
        System.out.format("Lớp học là %s có %d học sinh%n", className, totalStudent);
        // Khai báo float bắt buộc phải có f, còn double thì ko
        float avgPoint = 4.3868182f;
        double avgSomeThing = 10.01;
        System.out.format("Trung bình cộng của lớp : %.2f", avgPoint);
        System.out.format("Trung bình cộng của lớp : %.2f \t %.2f", avgPoint, avgPoint);
    /*
    Định dạng dữ liệu đầu vào
    Cho số n nhập vào từ bàn phím, tính tổng n và n - 1 ;
     Sử dụng Scanner
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin mời nhập n: ");
        int n = scanner.nextInt();
        // String, int, float, double;
        System.out.println("N + N -1 = "+ (n + n -1) );
    }
}
