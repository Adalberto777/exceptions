package homeWork_03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

    /**
     *  the method writes a person to a file with a name equal to her last name
     *
     * @param person the person whose data needs to be recorded
     *
     * @return creating file
     */
    public static void writeData(Person person){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(person.getSurname() +".txt", true));

            writer.write("<" + person.getName() + ">");
            writer.write("<" + person.getSurname() + ">");
            writer.write("<" + person.getPatronymic() + ">");
            writer.write("<" + person.getDateOfBirth() + ">");
            writer.write("<" + person.getTelephone() + ">");
            writer.write("<" + person.getSex() + ">");

            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file!" + e);
        }
    }
}
