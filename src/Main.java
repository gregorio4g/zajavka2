import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
  public static void main(String[] args) {
    test16();
  }

  private static void test16() {
    // 1
    System.out.println("*** 1 ***");
    LocalDate date = LocalDate.of(2020, 12, 31);
    System.out.println(date);
    System.out.println();

    // 2
    System.out.println("*** 2 ***");
    quiz2();
    System.out.println();

    // 3
    System.out.println("*** 3 ***");
    quiz3();
    System.out.println();

    // 4
    System.out.println("*** 4 ***");
    quiz4();
    System.out.println();

    // 5
    System.out.println("*** 5 ***");
    quiz5();
    System.out.println();

    // 6
    System.out.println("*** 6 ***");
    quiz6();
    System.out.println();

    // 7
    System.out.println("*** 7 ***");
    quiz7();
    System.out.println();

  }

  private static void quiz7() {
    LocalDateTime dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
    ZoneId zoneId = ZoneId.systemDefault();
    ZonedDateTime.of(dateTime, zoneId);
    Instant instant = Instant.now();
    System.out.println(instant);
  }

  private static void quiz6() {
    Duration durationMinute1 = Duration.of(60, ChronoUnit.SECONDS);
    Duration durationMinute2 = Duration.ofMinutes(1);
    String durationMinuteString1 = durationMinute1.toString();
    String durationMinuteString2 = durationMinute2.toString();
    Duration durationDay = Duration.ofDays(1);
    Period periodDay = Period.ofDays(1);
    String durationDayString = durationDay.toString();
    String periodDayString = periodDay.toString();

    if (durationMinute1 == durationMinute2) {
      System.out.println("durationMinute1 == durationMinute2");
    }
    if (durationMinute1.equals(durationMinute2)) {
      System.out.println("durationMinute1.equals(durationMinute2)");
    }
//    if (durationMinuteString1 == durationMinuteString2) { not used
//      System.out.println("durationMinuteString1 == durationMinuteString2"); not used
//    } not used
    if (durationMinuteString1.equals(durationMinuteString2)) {
      System.out.println("durationMinuteString1.equals(durationMinuteString2");
    }
//    if (durationDay.equals(periodDay)) { not used
//      System.out.println("durationDay.equals(periodDay)"); not used
//    } not used
//    if (durationDayString == periodDayString) { not used
//      System.out.println("durationDayString == periodDayString"); not used
//    } not used
    if (durationDayString.equals(periodDayString)) {
      System.out.println("durationDayString.equals(periodDayString)");
    }

  }

  private static void quiz5() {
    Period period = Period.ofYears(2);
    LocalDateTime localDateTime = LocalDateTime.of(2020, 12, 31, 10, 0, 0, 0);
    localDateTime = localDateTime.minus((period));
    System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(localDateTime));
  }

  private static void quiz4() {
    Duration duration1 = Duration.of(2, ChronoUnit.DAYS);
    Duration duration2 = Duration.of(1, ChronoUnit.HOURS);
    LocalDateTime dateTime = LocalDateTime.of(2020, 12, 31, 10, 0, 0, 0);
    dateTime = dateTime.minus(duration1);
    dateTime = dateTime.minus(duration2);
    System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss")));
  }

  private static void quiz3() {
    Period period = Period.of(1, 2, 3);
    LocalDateTime dateTime = LocalDateTime.of(2020, 12, 31, 10, 0, 0, 0);
    dateTime = dateTime.minus(period);
    System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
  }

  private static void quiz2() {
    LocalDateTime dateTime = LocalDateTime.of(2020, 12, 31, 10, 0, 0, 0);
//    dateTime.plusDays(1); not used
//    dateTime.plusHours(1); not used
//    dateTime.plusSeconds(1); not used
//    dateTime.plusMinutes(1); not used
    System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
  }
}