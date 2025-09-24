import java.util.Calendar;

public class CalendarToNewDateAdapter implements NewDateInterface {
    Calendar date;
    public CalendarToNewDateAdapter(){
        date = Calendar.getInstance();
    }

    @Override
    public void setDay(int day) {
        date.set(Calendar.DAY_OF_MONTH, day);
    }

    @Override
    public void setMonth(int month) {
        date.set(Calendar.MONTH, month - 1);
    }

    @Override
    public void setYear(int year) {
        date.set(Calendar.YEAR, year);
    }

    @Override
    public int getDay() {
        return date.get(Calendar.DATE);
    }

    @Override
    public int getMonth() {
        return date.get(Calendar.MONTH) + 1;
    }

    @Override
    public int getYear() {
        return date.get(Calendar.YEAR);
    }

    @Override
    public void advanceDays(int days) {
        date.add(Calendar.DAY_OF_MONTH, days);
    }

    public void printTime(){
        System.out.println(date.getTime());
    }
}
