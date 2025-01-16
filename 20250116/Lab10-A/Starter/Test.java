import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        list.add("James");
        list.add("Celine");

        // 이러한 반복문을 통한 조회는 빈번하다
        // 즉, 이러한 조회를 하나로 통일 시켜 사용하기 편하게 만들 필요가 있다. 
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(((ArrayList)list).getElements()[i]);
        // }
        Enumerator enumerator = list.getEnumerator();
        while (enumerator.hasNext()) {
            System.out.println(enumerator.next());
        }
        
        list.remove(1);
        System.out.println();

        Enumerator enumerator2 = list.getEnumerator();
        while (enumerator2.hasNext()) {
            System.out.println(enumerator2.next());
        }


        System.out.println();


        List list2 = new LinkedList();
        list2.add(1);
        list2.add("James");
        list2.add(3.0);
        list2.add(4);

        // LinkedList list2 = (LinkedList)list;
        // Node node = list2.head;
        // while(node != null) {
        //     System.out.println(node.data);
        //     node = node.nextNode;
        // }

        Enumerator enumerator3 = list2.getEnumerator();
        while (enumerator3.hasNext()) {
            System.out.println(enumerator3.next());
        }

        list2.remove(2);

        Enumerator enumerator4 = list2.getEnumerator();
        while (enumerator4.hasNext()) {
            System.out.println(enumerator4.next());
        }

    }
}
