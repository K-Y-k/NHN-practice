import java.util.List;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        // Stack은 List의 서브 타입이다.
        // 하지만 Stack의 push(), pop()은 List에서 사용 못함
        List<String> stack1 = new Stack<>();

        
        Stack<String> stack2 = new Stack<>();

        stack2.push("Celine");
        String name = stack2.pop();

        System.out.println(name);
    }
}
