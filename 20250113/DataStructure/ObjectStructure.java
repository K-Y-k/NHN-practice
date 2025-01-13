package DataStructure;

/* 공통적인 필드를 사용하기 위한 추상 클래스로 선언 방식 */
public abstract class ObjectStructure {
    // 담을 곳 필드
    Object[] objects = new Object[10];

    // 모두 null로 초기화
    public void init() {
        java.util.Arrays.fill(null, this.objects);
    }
}
