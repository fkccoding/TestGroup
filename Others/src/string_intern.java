public class string_intern {
    public static void main(String[] args) {
        String a =new String("abc").intern();
        String b = new String("   abc    ").trim().intern();

        String c = new String(new char[]{'a','b','c'}).intern();
        System.out.println(a==c);
        System.out.println(b==c);

    }
}
