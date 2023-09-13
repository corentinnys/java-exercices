import java.io.*;
import java.util.*;

public class counting_letter {
    public static void  main(String[] args)
    {
        readFile();
    }
    private static void readFile()
    {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        try {
            File file = new File("example.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                for (int i = 0; i < alphabet.length; i++) {

                    char letter = alphabet[i];
                    int result =countMatches(line, String.valueOf(letter));
                    System.out.print("la lettre "+letter+" est presente "+result+" fois");
                }
                System.out.println("------");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int countMatches(String str, String sub) {

        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        return count;
    }
}



