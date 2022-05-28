package challenge30;

import challenge30.structure.HashMap;

public class Algorithm <K, V> {

    public Algorithm() {

    }
    public String repeatedWord(String text) {
        HashMap<K, V> hashMap = new HashMap<K, V>();
        String[] array = text.toLowerCase().split(" ");

        for (int i=0; i<array.length; i++) {

            if (hashMap.contains((K) array[i].replaceAll("[^a-zA-Z0-9]", ""))){
                return array[i];
            }
            hashMap.set((K) array[i].replaceAll("[^a-zA-Z0-9]", ""), (V) (array[i] + i));
        }
        return "There isn't any repeated word ! ";
    }
}
