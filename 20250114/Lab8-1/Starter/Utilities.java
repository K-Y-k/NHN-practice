public class Utilities {
    public static int max(int i, int j) {
        if (i > j)
            return i;
        else 
            return j;
    }

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    public static int swap2(int i, int j) {
        return i;
    }

    //
    // To-do: Create reverse method here
    //
    public static String reverseString(String s) {
        // StringBuilder는 객체 하나로 연산 가능
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();


        // String은 불변 객체로 반복문을 통해 연산을 하면
        // 계속 새로운 객체를 생성해야 하는 문제
        // String result = "";
        // for (int i = s.length(); i > 0; i--) {
        //     result += s.charAt(i);
        // }

        // return result;
    }
}
