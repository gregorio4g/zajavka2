import org.jetbrains.annotations.NotNull;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    zad11();
    test16();
    test17();
  }

  private static void test17() {
    quiz17_2();
  }

  private static void quiz17_2() {
    List<String> list = new ArrayList<>();
    list.add("Gdańsk");
    list.add("Łódź");
    list.add("Wrocław");
    list.removeIf((String s) -> s.contains("a"));
  }

  private static void zad11() {
    System.out.println("*** Exc 1 ***");
    exc1101();
    System.out.println();
    System.out.println("*** Exc 2 ***");
    exc1102();
    System.out.println();
    System.out.println("*** Exc 3 ***");
    exc1103();
    System.out.println();
    System.out.println("*** Exc 4 ***");
    exc1104();
    System.out.println();
    System.out.println("*** Exc 5 ***");
    exc1105();
    System.out.println();
    System.out.println("*** Exc 6 ***");
    exc1106();
    System.out.println();
    System.out.println("*** Exc 7 ***");
    exc1107("Dupa Romana!");
    System.out.println();
  }

  private static void exc1107(@NotNull String inputString) {
    List<String> strings = new ArrayList<>(Arrays.asList(inputString.split("")));
    System.out.println(strings);
    Map<String, Integer> map = new HashMap<>();
    for (String s : strings) {
      if(map.containsKey(s)) {
        map.put(s, map.get(s)+1);
      } else {
        map.put(s, 1);
      }
    }
    for (String s : map.keySet()) {
      System.out.println(s + " -> " + map.get(s));
    }
  }

  private static void exc1106() {
    Random random = new Random();
    List<Square> squares = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      squares.add(new Square(random.nextInt(10)+1));
    }
    System.out.println(squares);
    squares = squares.stream().distinct().toList();
    System.out.println(squares);
  }

  private static void exc1105() {
    Random random = new Random();
    List<Integer> integerList = new ArrayList<>(100);
    for (int i = 0; i < 100; i++) {
      integerList.add(random.nextInt(10));
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (Integer integer : integerList) {
      if(map.containsKey(integer)) {
        map.put(integer, map.get(integer)+1);
      } else {
        map.put(integer, 1);
      }
    }
    for (Integer integer : map.keySet()) {
      System.out.println(integer + " -> " + map.get(integer));
    }
  }

  private static void exc1104() {
    Integer[] integers = {10, 11, -12, -12, 11, 5, 6, 7, 8, 9};
    List<Integer> integerArr = Arrays.asList(integers);
    List<Integer> integerList = new ArrayList<>(integerArr);
    System.out.println("before1: " + integerList);
    System.out.println("newList: " + highestToEndList(integerList));
    System.out.println("before2: " + integerList);
    highestToEnd(integerList);
    System.out.println("after 2: " + integerList);
  }

  private static @NotNull List<Integer> highestToEndList(List<Integer> integerList) {
    List<Integer> integerListTemp = new ArrayList<>(integerList);
    highestToEnd(integerListTemp);
    return integerListTemp;
  }

  private static void highestToEnd(@NotNull List<Integer> integerList) {
    Integer max = Integer.MIN_VALUE;
    for (Integer integer : integerList) {
      if (integer.compareTo(max) > 0) {
        max = integer;
      }
    }
    while (integerList.contains(max)) {
      integerList.remove(max);
    }
    integerList.add(max);
  }

  private static void exc1103() {
    Set<Employee> employees = new HashSet<>();
    employees.add(new Employee("Jan", "Kowalski"));
    employees.add(new Employee("Jan", "Kowalski"));
    employees.add(new Employee("Jan", "Kowalski"));
    System.out.println(employees);
  }

  private static void exc1102() {
    Random random = new Random();
    Integer[] integers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    List<Integer> list = Arrays.asList(integers);
    System.out.println(list);
    Integer tmp;
    for (int i = 0; i < list.size(); i++) {
      int randomIndex = random.nextInt(list.size());
      tmp = list.get(i);
      list.set(i, list.get(randomIndex));
      list.set(randomIndex, tmp);
    }
    System.out.println(list);
  }

  private static void exc1101() {
    Set<String> stringSet = new HashSet<>();
    stringSet.add("Ala");
    stringSet.add("ma");
    stringSet.add("kota!");
    stringSet.add("Kot");
    stringSet.add("miewa");
    stringSet.add("Alę");
    Iterator<String> iterator = stringSet.iterator();
    while(iterator.hasNext()) {
      System.out.print(iterator.next());
      if(iterator.hasNext()) {
        System.out.print(", ");
      }
    }
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