package prime_no;

import java.util.Scanner;

public class Prime_no {

    public static void main(String[] args) {

        int flag = 0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(+n + "is a prime no");
        } else {
            System.out.println(+n + "is not a prime no");

        }
    }
}
