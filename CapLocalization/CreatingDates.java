import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Month;

public class CreatingDates {
	
	public static void main(String[] args) {

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());

		LocalDate date1 = LocalDate.of(2022, Month.OCTOBER, 14);
		LocalDate date2 = LocalDate.of(2022, 10, 14);

		System.out.println(date1);
		System.out.println(date2);

		LocalTime localTime1 = LocalTime.of(6, 15); //Hour and minute
		LocalTime localTime2 = LocalTime.of(6, 15, 30); // Hour, minute and second

		System.out.println(localTime1);
		System.out.println(localTime2);

		LocalDateTime ltd1 = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
		System.out.println(ltd1);

	}
}