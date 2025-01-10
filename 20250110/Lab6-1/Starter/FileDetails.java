import java.io.*;

public class FileDetails {
    public static void summerize(char[] contents) {
        int vowel = 0, consonats = 0, lines = 0;

        for (char c : contents) {
            if (Character.isLetter(c)) {
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    vowel++;
                } else {
                    consonats++;
                }
            } else if (c == '\n') {
                lines++;
            }
        }

        System.out.println("total count = " + contents.length);
        System.out.println("vowel count = " + vowel);
        System.out.println("consonats count = " + consonats);
        System.out.println("lines count = " + lines);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileDetaos <file_name>");
            return;
        }
        String fileName = args[0];

        System.out.println(fileName);

        // To-do: Add code here
        //

        // read the file that passed from parameter of main method
        File file = new File(fileName);

        // 메모리 누수를 방지하기 위해 try () 안에 생성자를 넣은 것
        try (FileInputStream stream = new FileInputStream(file)) {
            // To-do Add code here
            char[] contents = new char[(int)file.length()];
            
            for (int i = 0; i < contents.length; i++) {
                // 파일 스트림의 read() 메소드는 String 문자 하나씩 읽어온다.
                contents[i] = (char)stream.read();
            }

            for (char c : contents) {
                System.out.print(c);
            }

            System.out.println();

            summerize(contents);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}