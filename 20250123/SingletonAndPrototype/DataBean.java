package SingletonAndPrototype;
public interface DataBean extends Cloneable {
    DataBean clone() throws CloneNotSupportedException;
}
