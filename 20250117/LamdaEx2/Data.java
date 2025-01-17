import java.util.ArrayList;
import java.util.List;

public class Data {
    List<Integer> list;

    public Data() {
        list = new ArrayList<>();
    }

    public void add(Integer value) {
        list.add(value);
    }

    // 순수 함수 : 정확한 동작 실행
    // 람다는 상태 변경을 하지 않는 순수 함수를 표현하기 적합
    public void map(UnaryOp op) { // UnaryOp 함수형 인터페이스 타입을 받음
        for (int i = 0; i < list.size(); i++) {
            list.set(i, op.apply(list.get(i)));
        }
    }
}

class Test3 {
    public static void main(String[] args) {
        Data data = new Data();
        data.add(1);
        data.add(2);
        data.add(3);
    
        // UnaryOp 함수형 인터페이스를 람다식으로 구현하여 적용
        data.map(i -> i + 1);

        for (int i : data.list) {
            System.out.println(i);
        }
    }
}
