public class Method2 {

    public static int max(int i, int j) {
        // 함수는 static이 붙은 메서드 + return 되어야 한다. 
        // static이 없으면 객체 메소드
        // return이 없으면 프로시저
        return (i > j) ? i : j;
    }

    public static int max3(int i, int j, int k) {
        // 절차적 수행 방식
        // int temp = 0;
        // if (i > j) {
        //     temp = i;
        // } else {
        //     temp = j;
        // }

        // if (temp > k) {
        //     return temp;
        // } else {
        //     return k;
        // }


        // 기존 max 함수 활용 방식
        // int temp = max(i, j);
        // return max(temp, k);

        
        // 최대로 줄인 방식
        return max(max(i, j), k);
    }

    public static void doSomething() {
        for (int i = 0; i < 10; i++) {
        }
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        short s = 5;
        int result = max(s, 2); // int형보다 더 작은 short는 암시적 형 변환이 된다.
        sayHello();
    }
}

class Test {
    public static void main(String[] args) {
        // 다른 클래스의 staitc 함수는 클래스명.함수명으로 호출한다.
        Method2.max(1, 2);
    }
}
