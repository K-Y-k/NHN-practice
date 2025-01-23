package SingletonAndPrototype;
import java.util.*;

public class ObjectRepository {
    static final Map<String, DataBean> repository = new HashMap();

    private ObjectRepository() {}

    public static void register(DataBean dataBean) {
        // putIfAbsent()는 해당 키의 값이 null일 때 넣어준다.
        repository.putIfAbsent(dataBean.getClass().getName(), dataBean);
    }

    public static Object getObject(String dataBeanString) {
        DataBean dataBean = repository.get(dataBeanString);

        // 싱글톤 타입 객체일 경우
        // 기존 생성한 객체의 참조 값으로 반환한다.
        if (dataBean.getClass().getDeclaredAnnotation(CreationType.class).type() == ObjectType.Singleton) {
            return dataBean;
        } 
        else { 
            // 프로토타입일 경우
            // 해당 객체를 복제해서 반환
            try {
                return dataBean.clone();
            } catch (Exception e) { // Cloneable의 클론을 반환하려면 CloneNotSupportedException을 처리해야 한다.
                e.printStackTrace();
                return null;
            }


            // Object 활용 방식
            // try {
            //     return object.getClass().getMethod("clone").invoke(object);
            // } catch (Exception e) { // 클론을 반환하려면 CloneNotSupportedException을 처리해야 한다.
            //     e.printStackTrace();
            //     return null;
            // }
        }
    }
}
