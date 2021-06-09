import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketsValidation {

    /*
        Write an algorithm that given a string containing just the characters
        '(', ')', '{', '}', '[' and ']', determines if the input string is valid.

        An input string is valid when:

        - Opening brackets are closed by the same type of closing brackets, and
        - Opening brackets are closed in the correct order.

        Note that an empty string is also considered valid.


        Examples:

        1. "()" -> true
        2. "()[]{}" -> true
        3. "(]" -> false
        4. ")(" -> false
        5. "([)]" -> false
        6. "{[]}" -> true
        7. ")" -> false
        8. "([]" -> false
        9. "{" -> false
        10. "([)])" -> false
        11. "(((((((((())))))))))" -> true
        12. "" -> true

     */

    public static void main(String[] args) {
        Map<Character, Character> bracketsPairMap = new HashMap<Character, Character>(3);
        bracketsPairMap.put(')', '(');
        bracketsPairMap.put(']', '[');
        bracketsPairMap.put('}', '{');

        String input1 = "()";
        System.out.println("\"" + input1 + "\" -> " + validateBrackets(input1, bracketsPairMap));

        String input2 = "()[]{}";
        System.out.println("\"" + input2 + "\" -> " + validateBrackets(input2, bracketsPairMap));

        String input3 = "(]";
        System.out.println("\"" + input3 + "\" -> " + validateBrackets(input3, bracketsPairMap));


        String input4 = ")(";
        System.out.println("\"" + input4 + "\" -> " + validateBrackets(input4, bracketsPairMap));

        String input5 = "([)]";
        System.out.println("\"" + input5 + "\" -> " + validateBrackets(input5, bracketsPairMap));

        String input6 = "{[]}";
        System.out.println("\"" + input6 + "\" -> " + validateBrackets(input6, bracketsPairMap));


        String input7 = ")";
        System.out.println("\"" + input7 + "\" -> " + validateBrackets(input7, bracketsPairMap));

        String input8 = "([]";
        System.out.println("\"" + input8 + "\" -> " + validateBrackets(input8, bracketsPairMap));

        String input9 = "{";
        System.out.println("\"" + input9 + "\" -> " + validateBrackets(input9, bracketsPairMap));

        String input10 = "([)])";
        System.out.println("\"" + input10 + "\" -> " + validateBrackets(input10, bracketsPairMap));

        String input11 = "(((((((((())))))))))";
        System.out.println("\"" + input11 + "\" -> " + validateBrackets(input11, bracketsPairMap));

        String input12 = "";
        System.out.println("\"" + input12 + "\" -> " + validateBrackets(input12, bracketsPairMap));

    }

    private static boolean validateBrackets(String input1, Map<Character, Character> bracketsPairMap) {

        boolean isValid = true;
        if(input1.length() % 2 == 1){
            isValid = false;
            return isValid;
        }
        Stack<Character> stack = new Stack<Character>();
        char bracket, popedBracket;
        for (int i = 0; i < input1.length(); i++) {
            bracket = input1.charAt(i);
            switch (bracket){
                case '{':
                case '[':
                case '(':
                    stack.push(bracket); break;

                case '}':
                case ']':
                case ')':
                    isValid = isValidBrackets(bracketsPairMap, stack, bracket);
                    break;

            }

            if(!isValid){
                break;
            }
        }

        if(stack.size() > 0){
            isValid = false;
        }
        return isValid;


    }

    private static boolean isValidBrackets(Map<Character, Character> bracketsPairMap, Stack<Character> stack, char key) {
        boolean isValid = true;
        if(stack.size() == 0) {
            isValid = false;
        }else if(stack.pop() != bracketsPairMap.get(key)){
            isValid = true;
        }
        return isValid;
    }
}
