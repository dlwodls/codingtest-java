package Bronze_04;

import java.util.Scanner;

public class Q5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 이동시간
        int[] time = new int[4];

        // 총 이동시간(초) 구하기
        int totalTime = 0;
        for (int i = 0; i < time.length; i++) {
            time[i] = sc.nextInt();
            totalTime += time[i];
        }

        // 총 이동시간(초) -> 분/초
        int min = totalTime / 60;
        int sec = totalTime % 60;

        System.out.println(min);
        System.out.println(sec);
    }
}
