import java.util.Calendar;

public class Clock {
    public static void main(String[] args) {
        while (true) {
            // Создаем объект календаря для получения текущего времени
            Calendar cal = Calendar.getInstance();

            // Выводим текущие часы, минуты и секунды
            System.out.println("Текущее время: " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));

            // Засыпаем на 1 секунду
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Ничего не делаем
            }
        }
    }
}