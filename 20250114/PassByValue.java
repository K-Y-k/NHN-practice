public class PassByValue {
    public static void changeSomething(int i) {
        i++; // 값을 반환하지도 않았기에 이 값은 사라진다.
    }

    public static void changeSomething(int[] i) {
        i[0]++;
    }

    public static void main(String[] args) {
        int i = 0;
        changeSomething(i);       // 값만 전달했으므로 내부 메소드의 +가 적용되지 않음
        System.out.println(i);


        int[] iArr = {0};
        changeSomething(iArr);     // 주소값을 전달하므로 적용된다.
        System.out.println(iArr[0]);


        int[] iArr2 = {0};
        changeSomething(iArr2[0]); // 원소 값만 전달했으므로 적용되지 않음
        System.out.println(iArr2[0]);
    }
}
