public class N2 {

    public static boolean isFibonacci(int number) {
        int a = 0, b = 1;
        while (a < number) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == number;
    }

    public static void main(String[] args) {
        int number = 852;
        System.out.println(number + ((isFibonacci(number) ? " " : " não ") + "pertence à sequência."));
    }

}
