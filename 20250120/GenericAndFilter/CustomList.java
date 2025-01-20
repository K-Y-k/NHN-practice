package GenericAndFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

class ZipUtil { 
    public static <T, E> List<List<Object>> zip(List<T> list1, List<E> list2) {
        List<List<Object>> resultList = new ArrayList<>();
        
        for (int i = 0; i < Math.max(list1.size(), list2.size()); i++) {
            List<Object> list = new ArrayList<>();

            list.add(list1.get(i));
            list.add(list2.get(i));

            resultList.add(list);
        }
        
        return resultList;
    }
}


public class CustomList<E> {
    ZipUtil zipUtil = new ZipUtil();
    List<E> elements = new ArrayList<>();


    public void add(E e) {
        elements.add(e);
    }


    public CustomList<E> map(UnaryOperator<E> op) {
        List<E> resultList = new ArrayList<>();

        for (int i = 0; i < this.elements.size(); i++) {
            resultList.add(op.apply(this.elements.get(i)));
            // elements.set(i, op.apply(elements.get(i)));
        }

        this.elements = resultList;
        return this;
    }

    // public List<Object> zip(List<Object> list2) {
    //     List<Object> resultList = new ArrayList<>();
    //     ZipUtil zipUtil = new ZipUtil();

    //     List<List<Object>> zipList = zipUtil.zip(elements, list2);
        
    //     for (List<Object> list : zipList) {
    //         for (Object o : list) {
    //             resultList.add(o);
    //         }
    //     }

    //     return resultList;
    // }
    

    public List<E> filter(Predicate<E> predicate) {
        List<E> resultList = new ArrayList<>();

        for (E e : this.elements) {
            if (predicate.test(e)) {
                resultList.add(e);
            }
        }

        return resultList;
    }
}
