package StackStructure;

public class ParenthesisMatching {

   public static boolean isBalance( Character[] exp) {
        Stack<Character> stack = new Stack<>(exp.length);

        for ( int i = 0 ; i < exp.length ; i++){
            if ( exp[i] == '(') {
                stack.push(exp[i]);
            }else if ( exp[i] == ')') {
                if (stack.isEmpty()){
                   return false;
                }else {
                    stack.pop();
                }
            }
        }


        return stack.isEmpty();
    }

    public static boolean AdvIsBalance(Character[] exp) {
       Stack<Character> stack = new Stack<>(exp.length);

       for ( int i = 0 ; i < exp.length ;i++) {
           char ch = exp[i];

           if ( ch == '(' || ch == '[' || ch == '{') {
               stack.push(ch);
           }else if ( ch == ')' || ch == ']' || ch == '}' ){
               if (stack.isEmpty()){
                   return false;
               }

               char top = stack.pop();
               if ( ( ch == ')' && top != '(') || ( ch == ']' && top != '[') || ( ch == '}' && top != '{') ){
                   return false;
               }
           }
       }

       return stack.isEmpty();
    }

    public static void main(String[] args) {
       String param = "((a+b)*(c-d))";
       String param2 = "{([a+b]*[c-d])/e}";

       Character[] exp = new Character[param2.length()];
       for ( int i = 0 ; i < param2.length() ;i++){
           exp[i] = param2.charAt(i);
       }
        boolean ismatch = AdvIsBalance(exp);

        System.out.println(ismatch);

    }
}
