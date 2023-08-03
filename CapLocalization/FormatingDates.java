import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormatingDates {
	
	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2022, Month.JUNE, 1);

		System.out.println("Day of week: " + date.getDayOfWeek());
		System.out.println("Day of month: " + date.getDayOfMonth());
		System.out.println("Year: " + date.getYear());
		System.out.println("Month: " + date.getMonth());
		System.out.println("Day of the year: " + date.getDayOfYear());

		LocalTime time = LocalTime.of(1, 1, 34);

		LocalDateTime dt = LocalDateTime.of(date, time);

		System.out.println("=====>>> FORMATING <<<====");
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		var f = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' HH:mm");
		System.out.println(dt.format(f));


	}
}