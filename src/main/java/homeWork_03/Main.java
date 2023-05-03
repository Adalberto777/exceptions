package homeWork_03;

import java.text.ParseException;
import java.util.Scanner;

import static homeWork_03.DataReader.*;
import static homeWork_03.Person.*;
import static homeWork_03.ReadInput.*;
import static homeWork_03.WriteData.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Create a new record: 1");
        System.out.println("2. Find an entry in:    2");
        System.out.println("3. Exit:                3");

        int answer01 = scanner.nextInt();
        switch (answer01){
            case 1:
                Person person = addPerson(readName(), readSurname(), readPatronymic(), readDateOfBirth(), readTelephone(), readSex());
                System.out.printf(person.toString());
                System.out.println();

                System.out.printf("Save Person %s y/n?: ", person.getSurname());
                char answer02 = scanner.next().charAt(0);
                if (answer02 == 'y'){
                    writeData(person);
                }else {
                    System.out.println("Goodbye");
                }
                break;
            case  2:
                personFinder(readName(), dataReader(readSurname()));
                break;
            case  3:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("You have to enter a number from 1 to 3");
                break;
        }


    }
}
