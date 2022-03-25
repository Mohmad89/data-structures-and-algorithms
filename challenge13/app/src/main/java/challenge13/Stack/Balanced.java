package challenge13.Stack;

public class Balanced {

    private Stack stack = new Stack();

    public Balanced () {

    }

    public boolean validateBrackets (String text){

        for (int i = 0; i < text.length(); i++){

            char index = text.charAt(i);

            if (index == '(' || index == '{' || index == '['){
                stack.push(index);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (index) {
                case ')':
                    check = stack.pop();
                    if(check == '}' || check == ']')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == ')' || check == ']')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '}' || check == ')')
                        return false;
                    break;
            }
        }
        return true;
    }
}
