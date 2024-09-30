/*
Mohammed Qutu
03/30/24
21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
*/

public class MonthComparisonApp {

    public static void main(String[] args) {
        MonthInfo month1 = new MonthInfo(10);
        MonthInfo month2 = new MonthInfo(11);

        System.out.println(month1.toString());
        System.out.println(month2.toString());

        if (month1.equals(month2)) {
            System.out.println("Months are equal.");
        } else {
            System.out.println("Months are not equal.");
        }
    }
}
