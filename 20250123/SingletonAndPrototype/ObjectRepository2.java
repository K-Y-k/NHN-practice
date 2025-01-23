package SingletonAndPrototype;
import java.util.*;

public class ObjectRepository2 {
    static final Map<String, DataBean> repository = new HashMap();
    
    private ObjectRepository2() {}

    public static void register(DataBean dataBean) {
        // 싱글톤 타입 객체일 경우
        // 기존 생성한 객체의 참조 값으로 넣는다.
        if (dataBean.getClass().getDeclaredAnnotation(CreationType.class).type() == ObjectType.Singleton) {
            repository.put(dataBean.getClass().getName(), dataBean);
        } else {
            // 프로토 타입 객체일 경우
            // 기존 객체
            try {
                // if ()
                DataBean dataBeanClone = repository.get(dataBean.getClass().getName()).clone();
                repository.put(dataBean.getClass().getName(), dataBeanClone);
            } catch (Exception e) { // 클론을 반환하려면 CloneNotSupportedException을 처리해야 한다.
                e.printStackTrace();
            }
        }
    }

    public static Object getObject(String objectString) {
        return repository.get(objectString);
    }
}