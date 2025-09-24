public class Main {

    static void printDate(NewDateInterface date){
        System.out.println(date.getDay() + "." + date.getMonth() + "." + date.getYear());
    }
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();

        printDate(date);
        date.advanceDays(20);
        printDate(date);

        date.setDay(1);
        date.setMonth(1);
        date.setYear(1);
        printDate(date);

        date.advanceDays(730119 + 2);
        printDate(date);
    }
}
