package homeWork_03;

import java.util.Scanner;

public class ReadData {
    public static String readName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.next();
        return name;
    }

    public static String readSurname(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname: ");
        String surname = scanner.next();
        return surname;
    }

    public static String readPatronymic(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patronymic: ");
        String patronymic = scanner.next();
        return patronymic;
    }

    public static String readDateOfBirth(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date of birth in format dd.mm.yyyy: ");
        String date_of_birth = scanner.next();
        return date_of_birth;
    }

    public static String readTelephone(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter telephone number in format 8XXXXXXXXXX: ");
        String telephone = scanner.next();
        return telephone;
    }

    public static char readSex(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sex in format m/f: ");
        char sex = scanner.next().charAt(0);
        return sex;
    }

}
