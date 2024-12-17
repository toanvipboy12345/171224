package Theory;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
    }
    public void print(ArrayList<String> list) {
        System.out.println("Danh sách:");
        for (var item : list) {
            System.out.println(item);
        }
    }
}
