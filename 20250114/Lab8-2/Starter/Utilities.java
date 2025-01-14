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

    public static String reverseString(String s) {
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }

        return result;
    }

    //
    // isCharSequence method
    // 
    public static boolean isCharSequence(Object o) {
        return (o instanceof CharSequence);
    }

    //
    // display method
    //
    public static void display(Object item) {
        if (item instanceof IPrintable) {
            // 받아온 매개객체가 자식인데 부모 객체로 참조 받아 온다면
            // 부모 -> 자식 명시적 형변환으로 가능
            IPrintable i = (IPrintable)item;
            i.print();
        }
    }
}