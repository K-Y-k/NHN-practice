import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Sample {
    // 1~큰값의 연속된 수열 중
    // 짝수만 받아오서 출력하려면 

    // 1~큰값을 리스트에 추가한 후 조회해서 짝수만 출력하려는데
    // 1~큰값을 리스트에 추가할 때
    // 너무 많은 데이터로 인해 java.lang.OutOfMemoryError가 발생
    // 이럴 때는 Lazy Evaluation 방식이 필요하다.
    public static List<Integer> getIntegers() {
        List<Integer> result = new ArrayList<>();

        // 2억개의 데이터는 java.lang.OutOfMemoryError가 발생한다.
        // 너무 많은 연산으로 메모리가 부족하다.
        for (int i = 1; i < 100000000; i++) {
            result.add(i);
        }

        return result;
    }
}


/* Generator는 Iterator를 만들어주는 역할 */
public class Generator implements Iterable<Integer> {
    // 기존 값을 위한 필드
    static int result = 1;

    // IntIterator로 구현한 클래스 필드
    private class IntIterator implements Iterator<Integer> {
        // 무한 반복을 위해 true로 부여
        @Override
        public boolean hasNext() {
            return true;
        }

        // 다음이 있으면 기존 값에 +1
        @Override
        public Integer next() {
            try {
                result += 1;

                // 0.5초 간격으로 설정
                // Thread.sleep(500);
            } catch (Exception e) {
            }

            return result;
        }
    }


    // Iterable의 iterator() 메소드를 오버라이딩
    @Override
    public Iterator<Integer> iterator() {
        return new IntIterator();
    }
}

class GeneratorTest {
    public static void main(String[] args) {
        // 평소 코드는 한번에 읽고 처리하려 한다.
        // List<Integer> list = Sample.getIntegers();
        //
        // for (int i : list) {
        //     if (i % 2 == 0) {
        //         System.out.println(i);
        //     }
        // }

        // Lazy Evaluation
        // 데이터를 한 번에 모두 처리하지 않고,
        // 필요한 시점에 하나씩 처리하는 방식으로
        // 자바에서는 Iterator를 활용한다.
        // 원본 값을 유지한다.
        Generator generator = new Generator();
        Iterator<Integer> iterator = generator.iterator();

        while (iterator.hasNext()) {
            int i = iterator.next();

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // BigDecimal[] decimals = new BigDecimal[2000000000];
    }
}
