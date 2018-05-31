package howManyDaysLife;

public class BirthDay {

    private String day;
    private String year;
    private String month;
    private String dateOfBirth;

    public long howManyDaysLife() {
        long howManyYearsLife = 2018 - (Long.parseLong(getYear()) + 1900) ;
        long howManyMonthsLife = Long.parseLong(getMonth());
        long howManyDaysLife = howManyYearsLife * 365 + howManyMonthsLife * 30 + Long.parseLong(getDay());
        return howManyDaysLife;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BirthDay(String Pesel) {
        year = Pesel.substring(0,2);
        month = Pesel.substring(2,4);
        day = Pesel.substring(4,6);
        dateOfBirth = getDay() + "-" + getMonth() + "-" + getYear();

    }
}
