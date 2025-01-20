package Annotation2;

import java.lang.annotation.Annotation;

@DeviceInformation(model = "Galaxy Book Pro") // DeviceInformation의 model()의 기본 값 설정이 없어 기본 값을 지정해야 한다.
public class Device {
    Device() {
    }

    /**
     * 자바는 new 키워드 생성 외에도
     * 리플렉션으로 생성 방식이 있다.
     */
    private DeviceInformation getDeviceInformation() {
        // 어노테이션 클래스 배열로 받고
        Annotation[] annotations = this.getClass().getAnnotations();
        // DeviceInformation이면 이 객체를 반환
        for(Annotation annotation : annotations) {
            if (annotation instanceof DeviceInformation) {
                return  (DeviceInformation) annotation;
            }
        }

        // DeviceInformation이 아니면 예외
        throw new UnsupportedOperationException("No Device Information");
    }

    public String getType() {
        try {
            return this.getDeviceInformation().type();
        }
        catch(Exception e) {
            return "unknown";
        }
    }

    public String getModel() {
        try {
            return  this.getDeviceInformation().model();
        }
        catch(Exception e) {
            return "unknown";
        }
    }
}
