package homeWork_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReadInput {
    public static String readName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.next();

        while (!checkString(name)) {
            return  readName();
        }
        return name;
    }

    public static String readSurname(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter surname: ");
        String surname = scanner.next();

        while (!checkString(surname)) {
            return  readSurname();
        }

        return surname;
    }

    public static String readPatronymic(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter patronymic: ");
        String patronymic = scanner.next();

        while (!checkString(patronymic)) {
            return  readPatronymic();
        }

        return patronymic;
    }

    public static String readDateOfBirth() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date of birth in format dd.mm.yyyy: ");
        String dateOfBirthString = scanner.next();

        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        formatter.setLenient(false);

        Date dateOfBirth;
        try {
            dateOfBirth = formatter.parse(dateOfBirthString);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in format dd.mm.yyyy");
            return readDateOfBirth();
        }

        return dateOfBirthString;
    }

    public static String readTelephone(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter telephone number (only digits)): ");
        String telephone = scanner.next();

        while (!telephone.matches("\\d+")) {
            System.out.println("Error: Telephone number should consist of only digits!");
            telephone = scanner.next();
        }
        return telephone;
    }

    public static char readSex(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sex, 'm' for male or 'f' for female: ");
        String sexString = scanner.next();
        char sex = sexString.charAt(0);
        while (sexString.length() != 1 & (sex != 'm' && sex != 'f')) {
            System.out.println("Invalid input, please enter 'm' for male or 'f' for female: ");
            sex = scanner.next().charAt(0);
        }

        return sex;
    }

    /**
     *  the method checks the string for correctness
     *
     * @param str string for checking
     *
     * @return boolean
     */
    public static boolean checkString(String str){
        if (!str.matches("[a-zA-Z\\-]+") || (str == null)) {
            System.out.println("Invalid input. Please enter only letters and hyphens and name cannot be null.");
            return false;
        }
        return true;
    }

}
