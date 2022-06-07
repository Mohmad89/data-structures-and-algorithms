/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge41;

public class App {

    public static void main(String[] args) {

        String s = "Moha  moa noa ";
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if ((array[i] + "").equals(" ") != true)
                System.out.println(array[i]);
        }

        System.out.println(anagramString("Astronomers", "Moon starers"));
    }

    public static Boolean anagramString (String text1, String text2){

        if (order(text1).equals(order(text2)) == true)
            return true;

        return false;
    }

    public static String order(String text) {

        String lowerCaseText = text.toLowerCase();
        char [] array = lowerCaseText.toCharArray();
        String result = "";
        char temp ;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[j] > array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            if ((array[i] + "").equals(" ") != true)
                result += array[i];
        }

        return result;
    }
}