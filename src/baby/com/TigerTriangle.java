package baby.com;

import java.util.Scanner;

public class TigerTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line1 = scanner.nextInt();
        int line2 = scanner.nextInt();
        int line3 = scanner.nextInt();
        boolean isTriangle=true;
        if (line1 + line2 > line3 && line1 + line3 > line2 && line2 + line3 > line1) {
            System.out.println("is Triangle");
        } else {
            System.out.println("is a line");
            isTriangle = false;
        }
        if (isTriangle) {
            int maxL = line1 > line2 ? (line1 > line3 ? line1 : line3) : (line2 > line3 ? line2 : line3);
            int minL = line1 > line3 ? (line3 > line2 ? line2 : line3) : (line1 < line3 ? line1 : line3);
            int midL = line1 > line3 ? (line3 > line2 ? line3 : line1 > line2 ? line2 : line1)
                    :(line1 > line2 ? line1 : line2 > line3 ? line3 : line2);
            if ((minL * minL + midL * midL) > maxL * maxL) {
                System.out.print("銳角");
            } else if ((minL * minL + midL * midL) < maxL * maxL) {
                System.out.println("鈍角");
            } else
                System.out.println("直角");
        }
    }
}