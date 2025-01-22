import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User implements Comparable<User> {
    private final int userNo;
    private final String userName;
    private final int userAge;

    public int getUserNo() {
        return userNo;
    }
    public String getUserName() {
        return userName;
    }
    public int getUserAge() {
        return userAge;
    }

    public User(int userNo, String userName, int userAge) {
        this.userNo = userNo;
        this.userName = userName;
        this.userAge = userAge;
    }

    @Override
    public int compareTo(User u) {
        // 학번 기준으로 정렬
        // return this.userNo - u.getUserNo();

        // 나이 기준으로 정렬
        // return this.userAge - u.getUserAge();

        // 이름 기준으로 정렬
        return this.userName.compareTo(u.getUserName());
    }

    @Override
    public String toString() {
        return "학번:" + userNo + ", "  + userName + ", " + userAge + "살";
    }
}

class DesendingOrder implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        // 나이 기준으로 정렬
        return u1.getUserAge() - u2.getUserAge();
    }
}


public class ComparableAndComparatorTest {
    public static void main(String[] args) {
        User user1 = new User(4, "User 1", 30);
        User user2 = new User(2, "User 3", 20);
        User user3 = new User(1, "User 4", 40);
        User user4 = new User(3, "User 2", 10);

        // List<User> users = new ArrayList<>();
        // users.add(user1);
        // users.add(user2);
        // users.add(user3);
        // users.add(user4);

        // List 초기화 할 때 할당 방식
        List<User> users = new ArrayList<>() {
            {
                add(user1);
                add(user2);
                add(user3);
                add(user4);
            }
        };

        users.forEach(System.out::println);       // 메소드 참조 방식
        System.out.println();
        

        // Comparable에서의 compareTo() 정의한 기준으로 정렬 
        Collections.sort(users);

        System.out.println("이름 기준 정렬");
        users.forEach(u -> System.out.println(u)); // 람다식 방식
        System.out.println();


        // Comparator에서의 compare()을 정의한 기준의 
        // Comparator 구현체 클래스를 전달 받아서 정렬
        Collections.sort(users, new DesendingOrder());

        System.out.println("나이 기준 정렬");
        users.forEach(u -> System.out.println(u));
        System.out.println();


        // Comparator 구현체 클래스가 아닌 
        // 람다식 타입으로 전달 받은 방식
        Collections.sort(users, (u1, u2) -> u1.getUserNo() - u2.getUserNo());
        
        System.out.println("학번 기준 정렬");
        users.forEach(u -> System.out.println(u));
        System.out.println();
    }
}
