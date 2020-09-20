//Exo1
import java.util.Arrays;

class dico {
  public static void main(final String[] args) {

    String[] words = {"Basketball", "Football", "Rugby", "Tennis", "Football"};
    Arrays.sort(words);

    String[] newList = new String[words.length];

    for (int i = 0; i < words.length; i++) {
        int indexAtWord = -1;
        String word = words[i];

        for (int j = 0; j < newList.length; j++) {
            if (newList[j] == null || newList[j].equals(word)) {
                indexAtWord = j;
            }
        }

        if (indexAtWord >= 0) {
            newList[indexAtWord] = word;
        }
    }

    for(int k = 0; k < newList.length / 2; k++) {
        String temp = newList[k];
        newList[k] = newList[newList.length - k - 1];
        newList[newList.length - k - 1] = temp;
    }

    System.out.println(Arrays.toString(newList));
  }
}