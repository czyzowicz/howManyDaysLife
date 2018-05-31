package howManyDaysLife;

public class howManyDaysLife_Demo {
    public static void main(String[] args) {
        Person person = new Person("Marek", "Wachowski", "88031813965");
        BirthDay birthDay = new BirthDay(person.getPesel());
        System.out.println(person.getGender());
        System.out.println(person.getBirthDay().getYear());
        System.out.println(person.getBirthDay().getDateOfBirth());
        System.out.println(person.getBirthDay().howManyDaysLife());
    }
}
