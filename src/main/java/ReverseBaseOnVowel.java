import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReverseBaseOnVowel {
    public static void main(String[] args) throws IOException {
        String inputString = ReadFile();
        String[] getWordbyIndex = inputString.split(" ");
        for (int i = 0; i < getWordbyIndex.length; i++) {
            if (getWordbyIndex[i].startsWith("a") || getWordbyIndex[i].startsWith("A") || getWordbyIndex[i].startsWith("e") ||
                    getWordbyIndex[i].startsWith("E") || getWordbyIndex[i].startsWith("I") ||
                    getWordbyIndex[i].startsWith("i") || getWordbyIndex[i].startsWith("o") ||
                    getWordbyIndex[i].startsWith("O") || getWordbyIndex[i].startsWith("u") || getWordbyIndex[i].startsWith("u")
            ) {

                StringBuilder stringBuilder = new StringBuilder();
                String reverse = stringBuilder.append(getWordbyIndex[i]).reverse().toString();
                getWordbyIndex[i] = reverse;
            }
        }

        for (int k = 0; k < getWordbyIndex.length; k++) {
            System.out.print(getWordbyIndex[k] + " ");
        }
    }

    public static String ReadFile() throws IOException {
        FileReader fileReader = new FileReader("src/test/resources/name.txt");
        StringBuilder fileDataToStringBuilder = new StringBuilder();
        String fileDate = null;
        int i;
        while ((i = fileReader.read()) != -1) {
            fileDataToStringBuilder.append((char) i);
        }
        fileDate = fileDataToStringBuilder.toString();
        return fileDate;
    }
}
