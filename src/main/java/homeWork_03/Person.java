package homeWork_03;

public class Person {
    private String name;
    private String surname;
    private String patronymic;
    private String date_of_birth;
    private String telephone;
    private char sex;

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", telephone=" + telephone +
                ", sex=" + sex;
    }

    public static Person addPerson(String name, String surname, String patronymic, String date_of_birth, String telephone, char sex){

        Person person = new Person(name, surname, patronymic, date_of_birth, telephone, sex);

        return person;
    }

    public Person(String name, String surname, String patronymic, String date_of_birth, String telephone, char sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.date_of_birth = date_of_birth;
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

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
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
