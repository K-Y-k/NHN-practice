package Annotation2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE}) // 어노테이션이 지정될 대상 지정 TYPE은 클래스!
@Retention(RetentionPolicy.RUNTIME) // 런타임에도 유지되기 위한 설정
public @interface DeviceInformation {
    String type() default "device";
    String model();
}