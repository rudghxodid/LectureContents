public class InterruptComment {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0;; i++) {
            if (i % 2 == 0) {
                System.out.println("안녕 난 짝수야!");
            } else {
                System.out.println("하이 난 홀수야!");
            }

            Thread.sleep(500);
        }
    }
}

// Interrupt: 인터럽트란 무엇인가 ?
// 사실 인터럽트라는 용어는 하드웨어 개발자들이 주로 사용하는 단어다.
// 보통 자바나 GUI 개발자들 혹은 애플리케이션 개발자들은 이벤트라고 표현한다.
// 결국 이벤트와 인터럽트는 동의어란 뜻이다.
// 그렇다면 인터럽트라고 부르지말고 이벤트라고 불러보자!
// 이벤트는 뭘까 ?

// 연인끼리 100일 이벤트를 챙긴다고 해보자
// 100일은 사실 어쩌면 존재할 수도 있고 어쩌면 존재하지 않을 수도 있다.

// 조금 더 구체적인 예제로 몰컴을 예로 들어보자!
// 전제조건: 부모님이 안방에서 주무시고 계신다.
//          나는 자는척하다가 일어나서 컴퓨터를 키고 게임을 시작한다.
// 1. 몰컴을 하고 있었음. 펜타킬찍음
// 2. 갑자기 안방의 문이 열렸음. <<<--- 이벤트(인터럽트)
// ???? 어떻게 해야할까요 ???? ---> 빨리 모니터 끄고 여차하면 컴퓨터도 끄고 자는척 시전
// ----> 문을 열어보시고 걸리면 이제 인생온라인 로그아웃
// ----> 이게 아니라면 문을 열어보시고 잘못 들었나 ? 하고 화장실갔다가 다시 주무시러 가실것임
// ----> 부모님의 퇴거를 확인하면 다시 일어나서 컴퓨터를 키고 탈주닌자 복귀를 한다.
// 3. 이후부터 다시 여러분의 시간

// 기본적으로 이벤트라는 것은 최우선적으로 처리해야 하는 작업으로
// 어떤 작업보다도 우선순위가 높은 녀석들입니다.
// 마찬가지로 여기서 Thread.sleep()하는 작업도 일종의 이벤트(인터럽트)에 해당한다.
// 그러므로 이 작업이 시작되면 다른 모든 작업들을 제쳐두고 이것을 최우선적으로 처리하게 된다.
// 물론 조금 더 정확한 것은 CPU의 동작과 Thread의 동작 과정에 대해 설명할 때 자세히 기술하도록 하겠다.

// 결국 Thread.sleep(500)이 가장 중요한 작업이므로
// 이 작업을 완료하기 전까지는 어떠한 작업도 수행하지 않는다는 뜻이다.
// 그래서 0.5초동안은 무조건적인 대기를 하게 된다.
