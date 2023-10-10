class Date {
    int year;
    int month;
    int day;

    public Date(int year,int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

public void isCorrectDate() {
    if (this.month < 1 || this.month > 12 || this.day < 1) {
        System.out.println("Helytelen datum");
        return;
    }

    if ((this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) && this.day > 31) {
        System.out.println("Helytelen datum");
        return;
    } else if ((this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) && this.day > 30) {
        System.out.println("Helytelen datum");
        return;
    } else if (this.month == 2) {
        if ((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)) {
            if (this.day > 29) {
                System.out.println("Helytelen datum");
                return;
            }
        } else {
            if (this.day > 28) {
                System.out.println("Helytelen datum");
                return;
            }
        }
    }
}

    public void printDate() {
        System.out.println("Datum: " + year + "." + month + "." + day);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
    
    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class DateClass {
    public static void main(String[] args) {
        
        Date datum = new Date(2020,2,30);
        datum.isCorrectDate();
        datum.printDate();
    }
}
