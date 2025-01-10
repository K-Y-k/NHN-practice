import java.util.Arrays;

public class Anagram {
    
    // 약자 따오기 함수
    public static String initial(char[] charArr) {
        String result = "";

        for (int i = 0; i < charArr.length; i++) {
            if (i == 0) {
                result += Character.toUpperCase(charArr[0]);
            }
            
            if (charArr[i] == ' ') {
                result += Character.toUpperCase(charArr[i+1]);
            }
        }

        return result;
    }


    /* 애너그램 프로그램 
     * 1.공백 제거 2.tolower 적용 3.sort 4.둘이 같은지 비교
    */
    // 애너그램 판별 메서드
    public static boolean isAnagram(String str1, String str2) {
        // null이거나 길이가 다른 경우 애너그램이 아님
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // 문자열을 char 배열로 바꾸고
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        // 1.공백 제거 및 소문자로 적용
        char[] removeCharArr1 = removeWhiteSpace(charArr1);
        char[] removeCharArr2 = removeWhiteSpace(charArr2);

        // 2. 정렬
        bubbleSort(removeCharArr1);
        bubbleSort(removeCharArr2);
        
        // 3. 정렬된 배열이 동일한지 비교
        for (int i = 0; i < removeCharArr1.length; i++) {
            if (removeCharArr1[i] != removeCharArr2[i]) {
                return false;
            }
        }

        return true;
    }


    // 공백 제거 및 소문자 적용 함수
    public static char[] removeWhiteSpace(char[] charArr) {
        int whiteSpaceCount = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == ' ') {
                whiteSpaceCount++;
            }
        }
        
        char[] newCharArr = new char[charArr.length-whiteSpaceCount];

        for (int i = 0, j = 0; i < charArr.length; i++) {
            if (charArr[i] == ' ') {
                continue;
            }

            newCharArr[j] = Character.toLowerCase(charArr[i]);
            j++;
        }

        return newCharArr;
    }

    // 버블 정렬 함수
    public static void bubbleSort(char[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    char temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        /* international business machine을 각 공백기준 첫글자를 따와서 대문자로 출력하기 */
        char[] charArr = "international business machine".toCharArray();
        System.out.println(Arrays.toString(charArr));
        System.out.println(initial(charArr));

        System.out.println();

        /* 애너그램 결과 출력하기 */
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " is anagram");
        } else {
            System.out.println(str1 + " and " + str2 + " is not anagram");
        }
    }
}
