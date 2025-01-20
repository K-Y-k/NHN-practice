package GenericAndFilter;
import java.util.ArrayList;
import java.util.List;

public class CustomListTest {
    public static void main(String[] args) {
        CustomList<Integer> customList = new CustomList<>();

        for (int i = 0; i < 1000; i++) {
            customList.add(i);
        }

        customList.map(i -> i + 1)
            .filter(i -> i < 10)
            .forEach(System.out::println);


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("two");
        list2.add("three");

        customList.zipUtil.zip(list1, list2).forEach(System.out::println);

        // List<Object> list3 = list1.zip(list2);
        
    }
}
