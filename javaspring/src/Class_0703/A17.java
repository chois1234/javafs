package Class_0703;

import java.util.Scanner;

public class A17 {
    public static void main(String[] args) {
        /*
         * 문제
         * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
         * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
         * 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에
         * 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
         * • 입력
         * • 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
         * • 출력
         * • 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
         * •
         * • 예제 입력 1 복사
         * • 2000
         * •
         * • 예제 출력 1 복사
         * • 1
         * •
         * • 예제 입력 2 복사
         * • 1999
         * •
         * • 예제 출력 2 복사
         * • 0
         * 
         */

        int year = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 ~ 4000년 사이의 년도를 숫자로 입력하세요");

        int inputNum = scanner.nextInt();
        if (((inputNum % 4 == 0) && (!(inputNum % 100 == 0))) || (inputNum % 400 == 0)) {
            year = 1;

            System.out.printf("입력한 연도: " + "%d" + "년%n", inputNum);
            System.out.print(year);
            System.out.printf("%n입력하신 연도는 윤년 입니다.");

        } else {
            System.out.printf("입력한 연도: " + "%d" + "년%n", inputNum);
            System.out.print(year);
            System.out.printf("%n입력하신 연도는 윤년이 아닙니다.");
        }

    }
}
