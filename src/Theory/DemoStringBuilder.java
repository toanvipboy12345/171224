package Theory;

public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Hello");
        str.append("!");
        str.append("World");
        str.delete(2,5).reverse().insert(5,"cccc");
        System.out.println(str);
    }
}
