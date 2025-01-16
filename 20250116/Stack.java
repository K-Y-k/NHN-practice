public class Stack {
    Object[] elements;
    int index = 0;

    public Stack(int size) {
        this.elements = new Object[size];
    }

    public void push(Object o) {
        elements[index] = o;
        index++;
    }

    public Object pop() {
        // 현재 인덱스는 추가할 위치의 인덱스이므로
        // 전위 감소를 하고 가져와야 한다.
        Object result = elements[--index];
        return result;
    }
}

class Test2 { 
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        // Object로 담기므로 기본형 int와 long은 Integer와 Long으로 담긴다.
        stack.push(1); 
        stack.push("Celine");
        stack.push("3");
        stack.push(4L);

        // 즉, Long클래스에서 int 기본형 변환은 불가능
        // long으로 착각하고 int형으로 변환하려고 하다가 에러 발생
        // Exception in thread "main" java.lang.ClassCastException: class java.lang.Long cannot be cast to class java.lang.Integer
        // int i = (int) stack.pop();

        // Long -> long -> int로 변환해줘야 함
        long l = (long) stack.pop();
        int i = (int) l;
        System.out.println(l);
        System.out.println(i);
    }
}
