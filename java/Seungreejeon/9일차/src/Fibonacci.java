import java.util.Scanner;

class FibonacciTest {
    private int[] fibArr;
    private Scanner scan;
    private int lastElement;

    public FibonacciTest () {
        scan = new Scanner(System.in);

        System.out.print("몇 번째 피보나치 항을 구하겠습니까 ? ");

        lastElement = scan.nextInt();

        fibArr = new int[lastElement];
    }

    public Boolean calcLastElem () {
        if (lastElement <= 0) {
            System.out.println("0 혹은 음수항은 없습니다.");
            return false;
        } else if (lastElement < 3) {
            System.out.println("당신이 찾고자 하는 피보나치 수열의 항은 1입니다.");
            return false;
        } else {
            fibArr[0] = 1;
            fibArr[1] = 1;

            for (int i = 2; i < lastElement; i++) {
                fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
                // System.out.printf("fibArr[%d] = %d\n", i, fibArr[i]);
            }
        }

        return true;
    }

    public int getLastElement() {
        return lastElement;
    }
    public int[] getFibArr() {
        return fibArr;
    }

    public int getLastFibArr() {
        return fibArr[lastElement - 1];
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        FibonacciTest fib = new FibonacciTest();

        if (fib.calcLastElem()) {
            System.out.printf("피보나치수열의 %d번째 항은 %d입니다.\n",
                    fib.getLastElement(),
                    // 아래 케이스의 경우엔
                    // fib.getFibArr()가 얻어오는 것이 class Fibonacci에 있는 FibArr 배열 전체를 얻어온다.
                    // 그러므로 배열을 얻어오고 난 이후에 fib.getLastElement() - 1을 통해서
                    // index 9번 방에 접근하도록 만드는 코드라고 보면 되겠다.
                    // 치환 과정
                    // fib.getFibArr() ---> fibArr
                    // [fib.getLastElement() - 1] ---> [9]
                    // 그래서 fibArr[9]와 같은 결과를 얻는 것이다.
                    // fib.getFibArr()[fib.getLastElement() - 1]);
                    fib.getLastFibArr());
        }
    }
}

