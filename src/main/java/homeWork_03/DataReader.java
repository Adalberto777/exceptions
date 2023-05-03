package homeWork_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataReader {
    /**
     *  the method returns an array of strings from a file
     *
     * @param surname name of the data file
     * @return array of strings with namesake data
     */
    public static ArrayList<String> dataReader(String surname) {
        try (
                BufferedReader br = new BufferedReader(new FileReader(surname + ".txt")))
        {
            String line;
            ArrayList<String> myArray = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                myArray.add(line);
            }
            return myArray;
        } catch (IOException e) {
            System.out.println("Can't find family " + surname);
        }
        return new ArrayList<>();
    }

    /**
     *  the method displays the contents of the record by the name you are looking for
     *
     * @param name name of the person
     */
    public static void personFinder(String name, ArrayList<String> myArray) {
        int flag = 0;
        if (myArray.size() == 0){
            flag = 1;
        }

        for (String element : myArray) {
            int startIndex = element.indexOf("<") + 1;
            int endIndex = element.indexOf(">", startIndex);
            String result = element.substring(startIndex, endIndex);

            if (result.equals(name)){
                flag = 1;
                String[] words = element.split("[><]");


                Person person = Person.addPerson(name, words[3], words[5], words[7], words[9], words[11].charAt(0));
                System.out.println(person.toString());

            }
        }
        if(flag == 0){
            System.out.println("Can't find name " + name);
        }

    }
}



