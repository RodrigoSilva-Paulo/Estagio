public class N5 {

    public static String reverse(String s) {
        StringBuilder r = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--)
            r.append(s.charAt(i));
        return r.toString();
    }

    public static void main(String[] args) {
        String s = "ABCDE";
        System.out.println(reverse(s));
    }

}
