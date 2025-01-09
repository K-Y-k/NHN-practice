public class BinaryAndDecimalChange {

    /* 10진수 -> 2진수 변환 함수 */
    public static String decimalToBinary(int number) {
        // 0인 경우
        if (number == 0) {
            return "0";
        }


        String binary = "";

        // 1.i가 0이 될 때까지 2로 나누고 나머지를 기록
        while (number > 0) {
            binary += number % 2;  // 나머지를 이진수로 추가
            number = number / 2;        // i를 2로 나누기
        }

        // 2.2진수는 뒤집어져 있으므로, 뒤집어서 반환
        String result = "";

        for (int i = binary.length() - 1; i >= 0; i--) {
            result += binary.charAt(i);
        }

        return result;
    }

    /* 2진수 -> 10진수 변환 함수 */
    public static String binaryToDecimal(String str) {
        // 빈 문자열 또는 null 입력 처리
        if (str == null || str.isEmpty()) {
            return "0";
        }

        //
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }


        int result = 0;
        for (int i = 0; i < reverseStr.length(); i++) {
            if (reverseStr.charAt(i) == '1') {
                result += Math.pow(2, i);
            }
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        int decimal = 10;
        String result = decimalToBinary(decimal);
        System.out.println(decimal + " -> " + result);

        String binary = "1011";
        String result2 = binaryToDecimal(binary);
        System.out.println(binary + " -> " + result2);
    }
}
