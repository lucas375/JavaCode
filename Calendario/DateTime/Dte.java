package DateTime;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Dte {

	public static void main(String[] args) {

		LocalTime t1 = LocalTime.now(ZoneId.of("America/Chicago"));
		LocalTime t2 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
		LocalDateTime LDT = LocalDateTime.now();


		System.out.println("Chicago EUA => "+t1);
		System.out.println("\n***********************");
		System.out.println("São Paulo BRASIL => "+t2);
		System.out.println("\n***********************");
		System.out.print(LDT);
		System.out.println("\n***********************");



		LocalTime t3 = LocalTime.of(12,0);
		LocalDate t4 = LocalDate.of(2020,12,25);
		LocalDate t5 = LocalDate.of(2020,Month.DECEMBER,25);


		System.out.print(t3);
		System.out.println("\n***********************");
		System.out.print("Natal de "+ t4);
		System.out.println("\n***********************");
		System.out.print("Natal de "+ t5);
		System.out.println("\n***********************");

		LocalDate t7 = LocalDate.of(2020,12,25);
		System.out.println(t7);
		System.out.println(t7.getYear());
		System.out.println(t7.getMonth());
		System.out.println("\n***********************");


		LocalDate t8 = LocalDate.of(2022, 01, 01);
		LocalDate t9 = t8.withMonth(3).withYear(2001);

		System.out.println("Data original "+ t8);
		System.out.println("Data auterada " + t9);


		System.out.println("\n***********************");

		Instant  t10 = Instant.now();
		Duration dezSec = Duration.ofSeconds(10);
		Instant t11 = t10.plus(dezSec);

		System.out.println(t10);
		System.out.println(t11);

		System.out.println("\n***********************");

		LocalDateTime t12 =  LocalDateTime.now();
		DateTimeFormatter t13 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println(t12);
		System.out.println(t13.format(t12));
		System.out.println(t12.format(t13));


		LocalDate t14 = LocalDate.parse("23/08/1982",t13);
		System.out.println(t14);



	}
}
