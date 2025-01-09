public class Palindrome {

    // 펠린드롬 판별 메서드
    public static boolean isPalindrome(String str) {
        // null 또는 길이가 1인 경우 자동으로 펠린드롬
        if (str == null || str.length() <= 1) {
            return true;
        }

        // 1.공백 제거 및 소문자로 변환
        str = str.replaceAll(" ", "").toLowerCase();

        // 2.문자열의 앞과 뒤에서부터 비교
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // 다른 문자가 발견되면 펠린드롬 아님
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        // 모든 비교를 통과하면 펠린드롬
        return true;
    }

    // 공백 제거 및 소문자 적용 함수
    public static char[] removeWhiteSpace(char[] charArr) {
        char[] newCharArr = new char[charArr.length];

        for (int i = 0, j = 0; i < charArr.length; i++) {
            if (charArr[i] == ' ') {
                continue;
            }

            newCharArr[j] = Character.toLowerCase(charArr[i]);
            j++;
        }

        return newCharArr;
    }

    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";

        if (isPalindrome(str)) {
            System.out.println("\"" + str + "\" is Palindrome");
        } else {
            System.out.println("\"" + str + "\" is not Palindrome.");
        }
    }
}
