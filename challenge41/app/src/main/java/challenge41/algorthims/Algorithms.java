package challenge41.algorthims;

public class Algorithms {

    public Algorithms() {
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


    public String reverseText(String text){

        return textToArray(text);
    }

    public String textToArray(String text){

        char [] arrayOfArray = text.toCharArray();
        char [] newArray = new char [arrayOfArray.length];
        int newArrayIndex = 0;

        for (int index = arrayOfArray.length - 1; index >= 0; index--) {
            newArray[newArrayIndex] = arrayOfArray[index];
            newArrayIndex++;
        }

        return convertingBackToString(newArray);
    }

    public  String convertingBackToString(char[] array) {

        String text = "";

        for (int index = 0; index < array.length ; index++)
            text += array[index] + "";

        return text;
    }

    public int maxMultiplyThreeNumber(int [] array) {

        int temp = 0, max = 0, length = array.length;

        if (array.length >= 3) {
            // First Sort The array
            for (int index = 0; index < array.length; index++) {
                temp = 0;
                for (int j = index + 1; j < array.length; j++) {
                    if (array[index] > array[j]) {
                        temp = array[index];
                        array[index] = array[j];
                        array[j] = temp;
                    }
                }
            }

                if (array[length - 1] * array[length - 2] * array[length - 3] > array[0] * array[1] * array[length - 1])
                    return array[length - 1] * array[length - 2] * array[length - 3];
                else
                    return array[0] * array[1] * array[length - 1];
        }
        return 0;
    }
}
