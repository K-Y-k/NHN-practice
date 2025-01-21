import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TokenTest {
    public static void main(String[] args) throws IOException {
        /* Sample.java Code and Split */
        String code = "public class Sample { \n";
        code += " int i = 5; \n";
        code += " } \n";
        String[] strArr = code.split(" ");

        /* Construct Sample.html */
        File file = new File("Sample.html");

        /* list about public, class ... */
        ArrayList<String> classStrList = new ArrayList<>(
            Arrays.asList("public", "class", "int", "long", "double", "byte", "short", "float", "double", "boolean")
        );

        /* For Checking In block statck */
        Stack<String> blockStack = new Stack<>();


        /* TokenList and VisitorAdaptor */
        List<Token> tokenList = new ArrayList<>();
        TokenVisitor visitAdaptor = new TokenVisitor();


        /* Sample.java Code add into TokenList  */
        for (int i = 0; i < strArr.length; i++) {
            /* Check 1. '}' */
            if (strArr[i].equals("}")) {
                blockStack.pop();
                tokenList.add(new NullToken(strArr[i]));
                continue;
            }

            /* Check 2. LineSpace and Current In block */
            if (strArr[i].equals("\n") 
                && !blockStack.isEmpty()
                && !strArr[i+1].equals("}")) {
                tokenList.add(new LineToken());
                tokenList.add(new TabToken());
                continue;
            } else if (strArr[i].equals("\n")) {
                tokenList.add(new LineToken());
                continue;
            }

            /* Check 3. classList */
            if (classStrList.contains(strArr[i])) {
                tokenList.add(new ClassToken(strArr[i]));
                continue;
            }

            /* Check 4. '{' */
            if (strArr[i].equals("{")) {
                blockStack.add("{");
                tokenList.add(new NullToken(strArr[i]));
                continue;
            }

            tokenList.add(new NullToken(strArr[i]));
        }

        
        /* File Writing */
        FileWriter writer = new FileWriter(file);

        for (Token token : tokenList) {
            if (token.getWord() != null && 
                (token.getWord().equals("}") || token.getWord().equals("{"))) {
                System.out.print(token.accept(visitAdaptor));
                writer.write(token.accept(visitAdaptor));
                continue;
            }

            System.out.print(token.accept(visitAdaptor) + " ");
            writer.write(token.accept(visitAdaptor) + " ");
        }
        
        writer.close();
    }
}
