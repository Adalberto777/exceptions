package homeWork_03;

public class Person {
    private String name;
    private String surname;
    private String patronymic;
    private String dateOfBirth;
    private String telephone;
    private char sex;

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", telephone=" + telephone +
                ", sex=" + sex;
    }

    /**
     *  the method creates a person class
     *
     * @param name name of a person
     * @param surname surname of a person
     * @param patronymic patronymic of a person
     * @param dateOfBirth dateOfBirth of a person
     * @param telephone telephone number of a person
     * @param sex sex of a person
     *
     * @return a person class
     */
    public static Person addPerson(String name, String surname, String patronymic, String dateOfBirth, String telephone, char sex){

        Person person = new Person(name, surname, patronymic, dateOfBirth, telephone, sex);

        return person;
    }

    public Person(String name, String surname, String patronymic, String date_of_birth, String telephone, char sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = date_of_birth;
        this.telephone = telephone;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
