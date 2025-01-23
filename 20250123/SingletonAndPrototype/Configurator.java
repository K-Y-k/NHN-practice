package SingletonAndPrototype;
// 싱글톤타입 어노테이션 지정
@CreationType(type=ObjectType.Singleton)
public class Configurator implements DataBean {
    
    @Override
    public DataBean clone() {
        return new Configurator();
    }
}
