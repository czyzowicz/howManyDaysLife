package zadania_utrwalajace.zad11;

public class BirthDay {

    private String day;
    private String year;
    private String month;
    private String dateOfBirth;


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
        int monthFromPesel = Integer.parseInt(Pesel.substring(2,4));
        if (( monthFromPesel >= 81) && ( monthFromPesel <= 92)){
            month = (monthFromPesel - 80) + "";
        }
        else if ((monthFromPesel >= 21) && (monthFromPesel <= 32)){
            month = monthFromPesel - 20 + "";
        }
        else {
            month = monthFromPesel + "";
        }
        year = Pesel.substring(0,2);
        day = Pesel.substring(4,6);
        dateOfBirth = getDay() + "-" + getMonth() + "-" + getYear();
    }

    public long howManyDaysLife() {
        int month = Integer.parseInt(getMonth());
        if (( month >= 81) && ( month <= 92)){
            long howManyYearsLife = 2018 - (Long.parseLong(getYear()) + 1800) ;
            long howManyMonthsLife = Long.parseLong(getMonth()) - 80;
            long howManyDaysLife = howManyYearsLife * 365 + howManyMonthsLife * 30 + Long.parseLong(getDay());
            return howManyDaysLife;}
        else if ((month >= 21) && (month <= 32)){
            long howManyYearsLife = 2018 - (Long.parseLong(getYear()) + 2000) ;
            long howManyMonthsLife = Long.parseLong(getMonth())-20;
            long howManyDaysLife = howManyYearsLife * 365 + howManyMonthsLife * 30 + Long.parseLong(getDay());
            return howManyDaysLife;}
        else {
            long howManyYearsLife = 2018 - (Long.parseLong(getYear()) + 1900) ;
            long howManyMonthsLife = Long.parseLong(getMonth());
            long howManyDaysLife = howManyYearsLife * 365 + howManyMonthsLife * 30 + Long.parseLong(getDay());
            return howManyDaysLife;
        }
    }
}
