public class Practice {
    public static void main(String[] args) {
        //25. 복습 문제
        /*1 ~ 100 까지의 숫자중 2의 배수는 모두 더한다.
        여기서 5의 배수는 모두 뺀다.
        11의 배수는 더한다.
        중복이 발생할 경우엔 무시한다.
        모든 값을 처리한 이후 결과값은 무엇인지 프로그래밍해보자!
                */

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0 && i % 5 == 0 && i % 2 == 0) {
                System.out.println("110의 배수 = " + i);
            } else if (i % 11 == 0 && i % 5 == 0) {
                System.out.println("55의 배수 = " + i);
            } else if (i % 11 == 0 && i % 2 == 0) {
                System.out.println("22의 배수 = " + i);
            } else if (i % 5 == 0 && i % 2 == 0) {
                System.out.println("10의 배수 = " + i);
            } else if (i % 11 == 0) {
                System.out.println("11의 배수 = " + i);
                sum += i;
            } else if (i % 5 == 0) {
                System.out.println("5의 배수 = " + i);
                sum -= i;
            } else if (i % 2 == 0) {
                System.out.println("2의 배수 = " + i);
                // System.out.printf("2의 배수 = %d\n", i);
                sum += i;
            }
        }

        System.out.println("최종 결과 = " + sum);


    }
}
