/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge13;

import challenge13.Stack.Balanced;
import challenge13.Stack.Stack;

public class App {

    public static void main(String[] args) {

        // instance Balanced
        Balanced balanced = new Balanced();
        String text = "({})[{}]";
        System.out.println(balanced.validateBrackets(text));// true

    }
}
