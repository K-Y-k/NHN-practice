import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DictionaryList {
    public static void main(String[] args) {
        List<String[]> list = new ArrayList<>();

        // 읽을 파일의 경로
        String filePath = "words.txt";

        // BufferedReader로 파일 읽기
        try (BufferedReader br =
                new BufferedReader(
                    new InputStreamReader(
                        new FileInputStream(filePath), "UTF-8"))) {
            String line;
            
            // 파일에서 한 줄씩 읽어 출력
            while ((line = br.readLine()) != null) {
                // String[] temp = part

                // 탭과 스페이스바 여백 기준 처리
                String[] splitStr = line.split("\t| ");

                // new String[2]; 이렇게 선언하면 null로 초기화 되므로
                String[] pair = {splitStr[1], ""};

                for (int i = 2; i < splitStr.length; i++) {
                    pair[1] += " " + splitStr[i];
                }

                // 양쪽 여백 자르기
                pair[1] = pair[1].trim();

                list.add(pair);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter word: ");
            String inputWord = sc.nextLine();

            if (inputWord.equals("exit")) {
                break;
            }

            int count = 0;
            for (String[] strArray : list) {
                count++;
                if (strArray[0].equals(inputWord)) {
                    System.out.println(strArray[1]);
                    break;
                }
            }

            System.out.println("반복 횟수: " + count);
        }

        sc.close();
    }
}
