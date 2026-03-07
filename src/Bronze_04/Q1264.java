package Bronze_04;

import java.util.Scanner;

// 영문 문장을 입력받아 모음의 개수를 세는 프로그램 작성

public class Q1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean run = true;

        while (run) {
            String line = sc.nextLine().toLowerCase();
            int count = 0;

            // 문자열 -> char 배열로 변환
            char[] charArr = line.toCharArray();

            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] == '#') {
                    run = false;
                    return;
                }
                else if (charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u')
                    count++;
            }

            System.out.println(count);
            count = 0;
        }
    }
}