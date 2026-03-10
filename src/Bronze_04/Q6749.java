package Bronze_04;

import java.util.Scanner;

public class Q6749 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 막내, 둘째 나이 입력
        int third = sc.nextInt();
        int second = sc.nextInt();

        // 자녀들의 나이 - 등차수열
        int first = second + (second - third);

        System.out.println(first);
    }
}
