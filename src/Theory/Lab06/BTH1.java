package Theory.Lab06;

import java.util.Scanner;

public class BTH1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrSinhVien = new String[3];
        System.out.print("Nhap sinh vien : ");
        for (int i = 0; i < arrSinhVien.length; i++) {
            System.out.println("Sinh viên thứ " +i);
            arrSinhVien[i] = input.nextLine();
        }
        //in
        for(var sinhVien : arrSinhVien) {
            System.out.println(sinhVien);
        }
    }
}
