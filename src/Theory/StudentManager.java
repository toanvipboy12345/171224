package Theory;

import java.util.Scanner;

/**
 * Khởi tạo mảng student 100 phần tử
 * Nhập số sinh viên n
 * In ra màn hình n sinh viên
 * Sắp xếp theo tuổi giảm dần
 */
public class StudentManager {
    public static void main(String[] args) {
        Student[] students = new Student[10]; // Tạo mảng 10 phần tử
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Nhập thông tin từng sinh viên
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Xử lý dòng thừa
            System.out.print("Tên: ");
            String name = sc.nextLine();
            System.out.print("Tuổi: ");
            int age = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(id, name, age);
        }

        // In ra danh sách sinh viên trước khi sắp xếp
        System.out.println("\nDanh sách sinh viên trước khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.println("Id: " + students[i].getId() + ", Name: " + students[i].getName() + ", Age: " + students[i].getAge());
        }

        // Sắp xếp theo tuổi giảm dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].getAge() < students[j].getAge()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        // In ra danh sách sinh viên sau khi sắp xếp
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo tuổi giảm dần:");
        for (int i = 0; i < n; i++) {
            System.out.println("Id: " + students[i].getId() + ", Name: " + students[i].getName() + ", Age: " + students[i].getAge());
        }
    }
}
