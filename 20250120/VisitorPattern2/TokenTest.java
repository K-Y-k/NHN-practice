package VisitorPattern2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TokenTest {
    public static void main(String[] args) throws IOException {
        List<Token> tokenList = new ArrayList<>();
        File file = new File("result.html");
        FileWriter writer = new FileWriter(file);

        String code = "public interface List { \n";
        code += " public static void main(String[] args) {";

        String[] words = code.split(" ");

        for (String s : words) {
            if (s.equals("class") || s.equals("abstract") || s.equals("interface")) {
                tokenList.add(new ClassToken(s));
                continue;
            } else if (s.equals("public") || s.equals("static") || s.equals("void")) {
                tokenList.add(new KeywordToken(s));
                continue;
            } else if (s.equals("\n")) {
                tokenList.add(new LineToken(s));
                continue;
            } 
            tokenList.add(new NullToken(s));
        }


        TokenVisitor visitor = new ClassTokenVisitor();

        for (Token t : tokenList) {
            System.out.print(t.accept(visitor) + " ");
            writer.write(t.accept(visitor) + " ");
        }

        writer.close();
    }
}
