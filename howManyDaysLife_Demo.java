package zadania_utrwalajace.zad11;

public class zad11_Demo {
    public static void main(String[] args) {
        Person person = new Person("Marek", "Wachowski", "14231931965");
        BirthDay birthDay = new BirthDay(person.getPesel());
        System.out.println(java.time.LocalDate.now());
        System.out.println(person.getGender());
        System.out.println(person.getBirthDay().getYear());
        System.out.println(person.getBirthDay().getDateOfBirth());
        System.out.println(person.getBirthDay().howManyDaysLife());
    }
}
