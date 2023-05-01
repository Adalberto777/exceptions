package homeWork_03;

import java.util.Scanner;

import static homeWork_03.Person.*;
import static homeWork_03.ReadData.*;
import static homeWork_03.WriteData.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner01 = new Scanner(System.in);
        System.out.println("Create new Person? y/n: ");
        char answer01 = scanner01.next().charAt(0);

        if (answer01 == 'y'){
            Person person = addPerson(readName(), readSurname(), readPatronymic(), readDateOfBirth(), readTelephone(), readSex());
            System.out.printf(person.toString());
            System.out.println();
            System.out.printf("Save Person %s y/n?: ", person.getSurname());

            Scanner scanner02 = new Scanner(System.in);
            char answer02 = scanner02.next().charAt(0);
            if (answer02 == 'y'){
                writeData(person);
            }else {
                System.out.println("Goodbye");
            }
        }else {
            System.out.println("Goodbye");
        }
    }
}
