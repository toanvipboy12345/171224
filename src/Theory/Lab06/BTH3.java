package Theory.Lab06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BTH3 {
    ArrayList<String> lstMonHoc = new ArrayList<>();

    public void test(){
        lstMonHoc.add("Java");
        lstMonHoc.add("SQL");
        lstMonHoc.add("PHP");
        lstMonHoc.add("C#");
        lstMonHoc.add("Android");

        System.out.println("Danh sách chưa sắp xếp:");
        for(int i = 0; i < lstMonHoc.size(); i++){
            System.out.println(lstMonHoc.get(i));
        }

        // Sắp xếp danh sách
        Collections.sort(lstMonHoc);

        System.out.println("\nDanh sách đã sắp xếp:");
        for(int i = 0; i < lstMonHoc.size(); i++){
            System.out.println(lstMonHoc.get(i));
        }
    }

    public static void main(String[] args) {
        BTH3 bth3 = new BTH3();
        bth3.test();  // Gọi phương thức test để chạy chương trình
    }
}
