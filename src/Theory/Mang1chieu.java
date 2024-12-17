package Theory;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. Khai báo
 * 2. Nhập xuất
 * 3. Thao tác, CRUD
 */
public class Mang1chieu {
    public static void main(String[] args) {
        // Khai báo mảng
        int[] b = {1, 2, 3, 4, 5};

        // Nhập số phần tử của mảng a từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số phần tử của mảng a: ");

        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Nhập các phần tử của mảng a:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        // Khai báo và gán giá trị cho mảng c
        int[] c = new int[2];
        c[0] = 1;
        c[1] = 2;

        // Xuất 3 mảng đã khai báo

        // In mảng b
        System.out.println("Mảng b: ");
        for (int value : b) {
            System.out.print(value + " ");
        }
        System.out.println();

        // In mảng a
        System.out.println("Mảng a: ");
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();

        // In mảng c
        System.out.println("Mảng c: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        //Khởi tạo và khai báo
        String[] names = {"1", "Minh", "Minhjj"};

        for (String name : names) {
            System.out.println(name);
        }
        //Gán giá trị ngẫu nhiên
        int[] array = new int[10]; // Mảng 10 phần tử

        for (int i = 0; i < array.length; i++) array[i] = new Random().nextInt(90) + 10;

        System.out.println("Các phần tử của mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
