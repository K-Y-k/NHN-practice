public class GenericStack<T> {
    T[] elements;
    int index = 0;

    public GenericStack(int size) {
        this.elements = (T[])new Object[size];
    }

    public void push(T elements) {
        this.elements[index] = elements;
        index++;
    }

    public T pop() {
        // 현재 인덱스는 추가할 위치의 인덱스이므로
        // 전위 감소를 하고 가져와야 한다.
        T result = elements[--index];
        return result;
    }
}

class Test3 { 
    public static void main(String[] args) {
        GenericStack<Integer> integerStack = new GenericStack<Integer>(5);

        integerStack.push(1); 
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);

        // Integer -> int 언박싱
        int i = integerStack.pop();
        System.out.println(i);


        GenericStack<String> stringStack = new GenericStack<String>(5);

        stringStack.push("aaa"); 
        stringStack.push("bbb");
        stringStack.push("ccc");
        stringStack.push("ddd");

        String s = stringStack.pop();
        System.out.println(s);
    }
}
