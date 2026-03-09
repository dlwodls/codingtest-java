package Bronze_04;

import java.util.Scanner;

// 평균 S = (R1 + R2) / 2
// R1, S로 R2의 값 구하는 프로그램 작성

public class Q3046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 -- R1, S
        int R1 = sc.nextInt();
        int S = sc.nextInt();

        // 출력 -- R2
        int R2 = 2 * S - R1;
        System.out.println(R2);
    }
}
