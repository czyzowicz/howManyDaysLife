package howManyDaysLife;

public class Person {
    private String name;
    private String surname;
    private String Pesel;
    private String gender;
    private BirthDay birthDay;


    public Person(String name, String surname, String Pesel) {
        this.name = name;
        this.surname = surname;
        this.Pesel = Pesel;
        birthDay = new BirthDay(Pesel);
        int isFemale = Integer.parseInt(Pesel.substring(9,10));
        if (isFemale % 2 == 0) {
            gender = "Female";
        } else gender = "Male";
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

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String Pesel) {
        this.Pesel = Pesel;
    }

    public String getGender() {
        return gender;
    }

    public BirthDay getBirthDay() {
        return birthDay;
    }
}
