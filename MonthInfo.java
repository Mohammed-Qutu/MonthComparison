/*
Mohammed Qutu
03/30/24
21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
*/

public class MonthInfo {
    private int monthNumber;

    public MonthInfo(int m) {
        if (m < 1 || m > 12) {
            monthNumber = 1;
        } else {
            monthNumber = m;
        }
    }

    public void setMonthNumber(int m) {
        if (m >= 1 && m <= 12) {
            monthNumber = m;
        } else {
            monthNumber = 1;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[monthNumber - 1];
    }

    public String getSeason() {
        if (monthNumber >= 3 && monthNumber <= 5) {
            return "Spring";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            return "Summer";
        } else if (monthNumber >= 9 && monthNumber <= 11) {
            return "Fall";
        } else {
            return "Winter";
        }
    }

    public String toString() {
        return "Month Number: " + monthNumber + "\nMonth Name: " + getMonthName() + "\nSeason: " + getSeason();
    }

    public boolean equals(MonthInfo month2) {
        return this.monthNumber == month2.getMonthNumber();
    }
}
