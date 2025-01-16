public class TypeCovariant<T> {
    T value;

    public void add(T value) {
        this.value = value;
    }
}

class Test5 {
    public static void main(String[] args) {
        // 배열 타입은 공변성을 지원
        Integer[] integers = {1,2,3};

        int[] intArr = {1,2,3};
        // 배열 타입은 공변성을 지원하지만, 
        // int와 long은 서로 다른 타입이기 때문에 배열 간의 형변환은 불가능
        // long[] longArr = intArr;

        // 암시적 형 변환이 적용된다.
        long[] longArr = {1,2,3};
        longArr[0] = 1;


        // 제네릭은 불가능 (불공변성(서로 관련성이 없다)을 가짐)
        // GenericBox<Long> b = new GenericBox<Integer>();

        // Generic 파라미터로 지정된 타입 인스턴스의 동작은 공변적
        TypeCovariant<Number> t = new TypeCovariant<Number>();
        t.add(new Integer(10));   // OK
        t.add(new Double(10.1));  // OK
    }
}