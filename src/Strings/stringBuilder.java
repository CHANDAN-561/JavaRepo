package Strings;

public class stringBuilder {
    public static void main (String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
//        String str = sb.toString();

        sb.append (" World!");
        String str = sb.toString();
        System.out.println(str);
    }
}
