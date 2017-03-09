package kekiru.toandoan.com.javabasic1.first_package;

/**
 * Created by framgia on 07/03/2017.
 */
public class Operator {
    public static void main(String[] args) {
        // 1. Gán
        int firtNumber = 10;
        System.out.println(firtNumber);
        firtNumber = firtNumber + 10;
        System.out.println(firtNumber);
        // firtNumber ++ mean firtNumber = firtNumber+1
        // or firtNumber +=1;
        // ++firtNumber (cộng trước rồi thực hiện câu lệnh)
        // firtNumber++ (thực hiện lệnh rồi coongnj sau)
        // và tương tự cho --;
        firtNumber++;
        System.out.println(firtNumber);  // 21
        System.out.println(++firtNumber); //  22
        System.out.println(firtNumber++); // 22
        System.out.println(firtNumber); // 23
        firtNumber *= 3;
        System.out.println(firtNumber);
        firtNumber /= 13;
        System.out.println(firtNumber);// 4, 5.2, 5
        // Chia lấy dư
        firtNumber %= 7;
        System.out.println(firtNumber); // 5

        /*
        Toán tử quan hệệ
        */
        firtNumber = 10;
        int secondNumber = firtNumber * 5;
        System.out.println(5 == 5); // true
        System.out.println(6 == 5); // true
        System.out.println(firtNumber == secondNumber / 5); // true
        if (firtNumber == 11 || secondNumber == 50) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (firtNumber == 11 || firtNumber++ == 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println(firtNumber);
        firtNumber = 10;
        if (firtNumber == 10 | firtNumber++ == 10) {
            System.out.println(true); // true
        } else {
            System.out.println(false);
        }
        System.out.println(firtNumber); // 10
        // 1 | kiểm tra tất cả các điều kiện, 2 || đúng ở đâu dừng ngay ở đấy


        /*
        Bài toán
        cho n =21;
        Viết ra màn hình n là số chẵn hay số lẻ
         */
        String result = "";
        if (21 % 2 == 0) result = " số chẵn";
        else result = "số lẻ";
        // Toán tử 3 ngôi
        // (condition) ? true value : false value;
        result = (21 % 2 == 0) ? "Số chẵn " : "Số lẻ";

        System.out.println(result);
        // Ép kiểu dữ liệu
        // 1. Ép lên : K vấn đề gì, tự động
        // 2. Ép xuống : mất mát dữ liệu, bắt buộc phải có khai báo ép kiểu
        // (kiểu dữ liệu) 
        firtNumber = 10;
        float thirdNumber = firtNumber;
        thirdNumber = 10.4f;
        firtNumber = (int) thirdNumber;

        System.out.println(firtNumber);
    }
}
