import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;

public class csv_factory {

    public static void main(String[] agrs)
    {

        String firstName = choiceFirstName();
        String lastName = choiceLastName();
        String reason  = choiceReason();
        String depatement = choiceDepartement(reason);
        Date randomDate = choicedate();



        writeFile(firstName,lastName,reason,depatement,randomDate);

    }
    public static String[] readFile(String way)
     {

         ArrayList< String> array = new ArrayList< String>();
         try{
             File file = new File(way);
             FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr);
             String line;
             while ((line = br.readLine()) != null)
             {
                array.add(line);
             }
         }catch (IOException e) {
             throw new RuntimeException(e);
         }
         String[] resultArray = array.toArray(new String[0]);

     return resultArray;
     }
     private static void writeFile(String firstName,String lastname, String reason,String depatement,Date randomDate)
     {
         try {
             FileWriter myWriter = new FileWriter("fileName.csv",true);
             myWriter.append(firstName+","+lastname+","+reason +","+depatement+" "+randomDate+";\n"); // Write some content to the file
             myWriter.close(); // Close the FileWriter when done
         } catch (IOException e) {
             e.printStackTrace();
         }
     }

    public static String choiceFirstName()
     {
        String[] choice =readFile("firstName.txt");

         int firstChoice = (int) (Math.random() * choice.length);

        String userChoice = choice[firstChoice];
      return userChoice;

     }

    public static String choiceLastName()
    {
        String[] choice =readFile("lastName.txt");

        int firstChoice = (int) (Math.random() * choice.length);

        String userChoice = choice[firstChoice];
        return userChoice;

    }


    public static String choiceReason()
    {
        String reason;
        int index = (int) (Math.random() * 2);
        if (index == 0)
        {
            reason = "Rendez-vous";
        }else {
            reason = "visite";
        }


        return reason;

    }

    public static String choiceDepartement(String reason)
    {
        System.out.println(reason);
        String result="";

        String[] champs ={"Cardiologie","Radiologie","Pédiatrie","Pédiatrie","Pneumologie"};
        if (reason =="Rendez-vous")
        {

            int index  =   (int) (Math.random() * champs.length);
            result = champs[index];
        }
        String categorie  = result;

        return categorie;
    }
    public static  Date choicedate()
    {
        long beginTime = Timestamp.valueOf("2023-09-13 00:00:00").getTime();
        long endTime = Timestamp.valueOf("2023-12-31 00:00:00").getTime();

        long diff = endTime - beginTime + 1;
        long result = beginTime + (long) (Math.random() * diff);
        System.out.println(beginTime + (long) (Math.random() * diff));
        Date randomDate = new Date(result);
        return  randomDate;
    };

}
