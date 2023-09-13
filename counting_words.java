import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class counting_words {
    public static void main(String[] args) {
        readFile();
    }

    private static void readFile() {
        try {
            File file = new File("example.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            String search ="théâtre";
            int counter = 0;
            String[] words = null;
            while((line = br.readLine()) != null)
            {

               words = line.split(" ");
               for (String word : words)
               {
                   if (word.equals(search))
                   {
                       counter++;
                    }
               }
                sb.append(line);
                sb.append("\n");

            }
            if (counter != 0){
                System.out.println("Le mot "+search+" est present "+counter +"fois");
            }

            fr.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
