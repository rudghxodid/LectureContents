import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // 용도 : 일종의 배열임
        //       배열의 사이즈를 지정하고 사용해야 하지만
        //       이 녀석은 넣고 싶은대로 아무때나 막넣어도 된다.
        //       (참고로 이 녀석도 Heap을 이용한 동적할당을 수행함)

        // 사용법 : ArrayList<내부에 저장할 데이터타입> 변수명 = new ArrayList<내부에 저장할 데이터타입>

        // 일반 배열과의 차이점은?
        // 배열은 메모리가 연속적으로 배치된다.
        // 이 녀석은 불연속 배치다.
        // 어떻게 ? (장점 : 유연성이 뛰어남/ 단점: 속도가 느리다)
        // | 데이터1 | 다음링크 | ---> | 데이터2 | 다음링크 | ---> | 데이터3 | 다음링크 | ---> ...
        // 배열은??  (장점 : 속도가 빠르다 / 단점: 유연성이 좋지 못하다)
        // | 데이터1 | 데이터2 | 데이터3 | 데이터4 | 데이터5 | 데이터6 | 데이터7| ...

        // 내가 몇개를 쓸지 알고 있는 상황 :  배열
        //     몇개를 사용할지 모르는 상황 : ArrayList
        // ex) 회원가입 몇명??? 할지 모르기때문에 ArrayList 를 사용하기 좋다.
        ArrayList<String> lists = new ArrayList<String>();

        lists.add("빵");
        lists.add("버터");
        lists.add("유유");
        lists.add("계란");
        lists.add("쥬스");
        lists.add("베이컨");
        lists.add("파스타");
        lists.add("비프샐러드");
        lists.add("피자");

        for (String list : lists) {
            System.out.println("현재 항목은 = " + list);
        }

    }
}
