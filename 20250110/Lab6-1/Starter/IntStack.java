public class IntStack {
    int[] stack = new int[4];
    int index = 0;

    public void push(int element) {
        try {
            if (index > 3) {
                throw new IllegalAccessException("현재 용량을 초과하였습니다.");
            }

            stack[index] = element;
            index++;
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }

    public int pop() {
        int result = 0;

        try {
            if (index == 0) {
                throw new IllegalAccessException("현재 가져올 원소가 없습니다.");
            }

            index--;

            result = stack[index];
            stack[index] = 0;
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }
}

class Test {
    public static void main(String[] args) {
        IntStack stack = new IntStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int val1 = stack.pop();
        int val2 = stack.pop();
        int val3 = stack.pop();
        int val4 = stack.pop();
        int val5 = stack.pop();


        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
    }
}