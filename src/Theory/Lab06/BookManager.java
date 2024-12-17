package Theory.Lab06;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

    // Hàm hiển thị menu
    public static void showMenu() {
        System.out.println("\n--- MENU QUẢN LÝ SÁCH ---");
        System.out.println("1. Nhập dữ liệu sách");
        System.out.println("2. Hiển thị danh sách sách");
        System.out.println("3. Xóa sách theo chỉ số");
        System.out.println("4. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int choice;

        do {
            showMenu(); // Gọi hàm hiển thị menu
            choice = sc.nextInt();
            sc.nextLine(); // Xử lý ký tự ngắt dòng

            switch (choice) {
                case 1: // Nhập dữ liệu sách
                    Book book = new Book();
                    book.Nhapdulieu();
                    books.add(book);
                    System.out.println("Đã thêm sách thành công!");
                    break;
                case 2: // Hiển thị danh sách sách
                    if (books.isEmpty()) {
                        System.out.println("Danh sách sách trống!");
                    } else {
                        System.out.println("Danh sách các sách:");
                        for (int i = 0; i < books.size(); i++) {
                            System.out.print("Sách " + (i + 1) + ": ");
                            books.get(i).Xuatthongtin();
                        }
                    }
                    break;
                case 3: // Xóa sách
                    if (books.isEmpty()) {
                        System.out.println("Danh sách sách trống! Không có gì để xóa.");
                    } else {
                        System.out.print("Nhập chỉ số sách cần xóa (1 - " + books.size() + "): ");
                        int index = sc.nextInt();
                        if (index >= 1 && index <= books.size()) {
                            books.remove(index - 1);
                            System.out.println("Đã xóa sách thành công!");
                        } else {
                            System.out.println("Chỉ số không hợp lệ!");
                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
            }
        } while (choice != 4);
    }
}
