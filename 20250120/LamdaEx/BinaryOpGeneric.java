@FunctionalInterface
public interface BinaryOpGeneric<T extends Number> { // 여러 타입을 받아야 할 경우 -> 제네릭 활용
    // 숫자만 필요한 경우 extends Number로 타입 제한
    public T apply(T i, T j);
}