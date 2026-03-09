package Bronze_04;

import java.util.Scanner;

public class Q2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫째 줄 -- L, P 입력
        int L = sc.nextInt();   // 1m^2당 사람의 수
        int P = sc.nextInt();   // 파티가 열렷던 곳의 넓이

        int headCount = L * P;

        // 둘째 줄 -- 각 기사에 실려있는 참가자의 수
        int[] people = new int[5];
        for (int i = 0; i < people.length; i++) {
            people[i] = sc.nextInt();
        }

        // 출력
        int[] diff = new int[5];
        for (int i = 0; i < diff.length; i++) {
            diff[i] = people[i] - headCount;
            System.out.print(diff[i] + " ");
        }
    }
}
