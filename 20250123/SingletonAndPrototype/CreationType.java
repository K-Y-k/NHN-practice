package SingletonAndPrototype;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CreationType {
    ObjectType type() default ObjectType.Prototype;
}