import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Users<E extends Comparable<E>> implements Iterable<E>{
    private String name;
    private String address;

    List<E> userList;

    public Users(String name, String address) {
        this.name = name;
        this.address = address;
        this.userList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    

    public void add(E member) {
        this.userList.add(member);
    }

    public Iterator<E> iterator() {
        return this.userList.iterator();
    }
}


public class GenericAndCompareTest {
    public static void main(String[] args) {
        User user1 = new User(4, "User 1", 30);
        User user2 = new User(2, "User 3", 20);
        User user3 = new User(1, "User 4", 40);
        User user4 = new User(3, "User 2", 10);


        // 컬렉션이 아닌 제네릭 객체다!
        Users<User> users = new Users<>("String", "Somewhere");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);


        users.forEach(System.out::println);       // 메소드 참조 방식
        System.out.println();
        

        // Comparable에서의 compareTo() 정의한 기준으로 정렬 
        Collections.sort(users.userList);

        System.out.println("이름 기준 정렬");
        users.forEach(u -> System.out.println(u)); // 람다식 방식
        System.out.println();


        // Comparator에서의 compare()을 정의한 기준의 
        // Comparator 구현체 클래스를 전달 받아서 정렬
        Collections.sort(users.userList, new DesendingOrder());

        System.out.println("나이 기준 정렬");
        users.forEach(u -> System.out.println(u));
        System.out.println();


        // Comparator 구현체 클래스가 아닌 
        // 람다식 타입으로 전달 받은 방식
        Collections.sort(users.userList, (u1, u2) -> u1.getUserNo() - u2.getUserNo());
        
        System.out.println("학번 기준 정렬");
        users.forEach(u -> System.out.println(u));
        System.out.println();
    }
}