package InterfaceInheritanceAndLamdaEx;
// 타입의 정의가 필요하여 추상 클래스가 아닌 인터페이스를 사용한 것
// 인터페이스는 타입을 정의하는 것
public interface Person extends Comparable<Person> {
    int getNo();      // Comparable의 compareTo() 구현할 때 공통으로 사용되므로 선언한 것
    String getName(); // Comparator의 compare() 구현할 때 이름 기준으로 공통 사용되므로 선언한 것
}
