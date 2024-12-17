package Theory.Lab06;

import java.util.Scanner;

public class Book {
    private String bookName;
    private String nxb;
    private int yearOfPublish;
    private String author;
    private String numOfPage; // Đổi tên cho thống nhất với ảnh
    private float price;

    // Hàm nhập dữ liệu
    void Nhapdulieu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập dữ liệu: ");
        System.out.print("Tên sách: ");
        bookName = sc.nextLine();

        System.out.print("Nhà xuất bản: ");
        nxb = sc.nextLine();

        System.out.print("Năm xuất bản: ");
        yearOfPublish = sc.nextInt();
        sc.nextLine(); // Xử lý ký tự ngắt dòng

        System.out.print("Tác giả: ");
        author = sc.nextLine();

        System.out.print("Số trang: ");
        numOfPage = sc.nextLine();

        System.out.print("Giá sách: ");
        price = sc.nextFloat();
    }

    // Hàm xuất thông tin
    void Xuatthongtin() {
        System.out.println(this.toString());
    }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", nxb='" + nxb + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", author='" + author + '\'' +
                ", numOfPage='" + numOfPage + '\'' +
                ", price=" + price +
                '}';
    }

    // Hàm main để chạy chương trình

}
