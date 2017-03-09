package kekiru.toandoan.com.javabasic1.homework;

/**
 * Created by framgia on 09/03/2017.
 */
public class Employee {
    /*
    0. acceess modifier : phạm vi truy xuất càng nhỏ càng tốt
    1. Kiểu dữ liệu
    2. Tên biến
    3. Gía trị khởi tạo (not require)
     */
    private String mLastName;
    private String mFirstName;
    private int mDateOfBirth;
    private int mGender;

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public int getDateOfBirth() {
        return mDateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        mDateOfBirth = dateOfBirth;
    }

    public int getGender() {
        return mGender;
    }

    public void setGender(int gender) {
        mGender = gender;
    }

    public int getAge() {
        return 2017 - mDateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "mLastName='" + mLastName + '\'' +
            ", mFirstName='" + mFirstName + '\'' +
            ", mDateOfBirth=" + mDateOfBirth +
            ", mGender=" + mGender +
            ", Age= " + getAge() +
            '}';
    }

    public boolean isLeapYear() {
        return mDateOfBirth % 4 == 0 &&
            (mDateOfBirth % 100 != 0 || mDateOfBirth % 400 == 0);
    }
}
