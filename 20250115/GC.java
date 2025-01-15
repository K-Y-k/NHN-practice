public class GC {
    
}

class Test3 {
    public static void main(String[] args) {
        // 가비지 콜렉터는 사용 안하는 객체를 자동으로 제거해준다.
        // 언제 소멸될지는 모른다.
        GC g = new GC();
    }
}
