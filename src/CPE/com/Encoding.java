package CPE.com;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ServiceConfigurationError;
import java.util.StringTokenizer;

public class Encoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        while (count >= 0) {
            String a = scanner.nextLine();
            int i = 0;
            String l = String.valueOf(a.charAt(i));
            String n = "";
            String num = "";
            String ans = "";
            String result = "";
            while (i != a.length() - 1) {
                i++;
                n = String.valueOf(a.charAt(i));
                if (isNum(n)) {
                    num += n;
                    if (i == a.length() - 1) {
                        for (int j = 0; j < Integer.parseInt(num); j++) {
                            ans += l;
                        }
                    }
                } else {
                    for (int j = 0; j < Integer.parseInt(num); j++) {
                        ans += l;
                    }
                    l = n;
                    num = "";
                }
            }
            System.out.println(ans);
            count--;
        }

    }

    static boolean isNum(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
