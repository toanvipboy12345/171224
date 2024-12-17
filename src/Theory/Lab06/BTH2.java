package Theory.Lab06;

import java.util.Scanner;

public class BTH2 {

    String[][] arrNhanVien = new String[3][2];

    public void Nhapdulieu() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arrNhanVien.length; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ": ");
            System.out.print("Tên nhân viên: ");
            arrNhanVien[i][0] = input.nextLine();
            System.out.print("Lương nhân viên: ");
            arrNhanVien[i][1] = input.nextLine();
        }
    }
    public void Sapxep() {
        for (int i = 0; i < arrNhanVien.length; i++) {
            for (int j = i+1; j < arrNhanVien[i].length; j++) {
                if (Float.parseFloat(arrNhanVien[i][1]) < Float.parseFloat(arrNhanVien[j][1])) {
                    // Tạo mảng tạm để lưu giá trị hoán đổi
                    String temp[][] = new String[1][2];

                    temp[0][0] = arrNhanVien[j][0];
                    temp[0][1] = arrNhanVien[j][1];

                    arrNhanVien[j][0] = arrNhanVien[i][0];
                    arrNhanVien[j][1] = arrNhanVien[i][1];

                    arrNhanVien[i][0] = temp[0][0];
                    arrNhanVien[i][1] = temp[0][1];

                }
            }
        }
    }
    public void Hienthi(){
        for (int i = 0; i < arrNhanVien.length; i++) {
            System.out.println("Tên nhân viên: " +arrNhanVien[i][0] + ", lương: " + arrNhanVien[i][1]);
        }
    }

    public static void main(String[] args) {
        BTH2 bth2 = new BTH2();

        // Gọi các phương thức
        System.out.println("Nhập thông tin nhân viên:");
        bth2.Nhapdulieu();

        bth2.Sapxep();
        bth2.Hienthi();
    }
}
