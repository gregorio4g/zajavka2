import org.jetbrains.annotations.NotNull;
import zad14.IFace1;
import zad14.IFace1Impl;
import zad14.IFace2;
import zad14.IFace2Impl;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
	public static void main(String @NotNull [] args) {
//    zad11();
//    test16();
//    zad13();
//		test17();
//		zad14();
//    test18();
		zad15();
//		test19();
	}

	private static void test19() {
	}

	private static void zad15() {
		System.out.println("*** Exc 15-1 ***");
		String input1 = "Red rum, sir, is murder.";
		System.out.printf("'%s' %sjest palindromem.%n", input1, (exc1501(input1) ? "" : "nie "));
		System.out.println();

		System.out.println("*** Exc 15-2 ***");
		StringBuilder input2 = new StringBuilder("Red rum, sir, is murder.");
		System.out.printf("'%s' -> '%s'%n", input2, exc1502(input2));
		System.out.println();
	}

	private static @NotNull StringBuilder exc1502(StringBuilder sentence) {
		StringBuilder sb = new StringBuilder(sentence);
		for (int i = 0; i < sb.length(); i++) {
			char charCurrent = sb.charAt(i);
			char charPrevious = (i == 0 ? '.' : sb.charAt(i-1));
			if (Character.isLetter(charCurrent) && !Character.isLetter(charPrevious)) {
				sb.replace(i, i+1, String.valueOf(Character.toUpperCase(charCurrent)));
			}
		}
		return sb;
	}

	private static boolean exc1501(@NotNull String inputString) {
		StringBuilder sb = new StringBuilder(inputString.toLowerCase().replaceAll("[^a-ząćęłóśźż]", ""));
		return sb.toString().equals(sb.reverse().toString());
	}

	private static void zad14() {
		System.out.println("*** Exc 14-1 ***");
    int x1 = 5;
		exc1401(x1);
		System.out.println();
		System.out.println("*** Exc 14-2 ***");
    int x2 = -23;
		String s2 = "Ala ma kota!";
		exc1402(x2, s2);
		System.out.println();

	}

	private static void exc1402(int x2, @NotNull String s2) {
		System.out.println("input1 = " + iFace2Call(x2, s2, (x, s) -> s + x));
		System.out.println("input2 = " + iFace2Call(x2, s2,
				(x, s) -> new StringBuilder(s)
				.appendCodePoint(Math.abs(x) + 32)
				.toString()));
		System.out.println("input3 = " + iFace2Call(x2, s2, (x, s) -> s.repeat(Math.abs(x)/s.length() + 1)));
		System.out.println("input4 = " + iFace2Call(x2, s2, new IFace2Impl()));
	}

	static @NotNull String iFace2Call(int x, @NotNull String s, @NotNull IFace2 iF2) {
		return iF2.iFace2(x, s);
	}

	private static void exc1401(int x1) {
		System.out.println("input1 = " + iFace1Call(x1, String::valueOf));
		System.out.println("input2 = " + iFace1Call(x1, (int i) -> new StringBuilder().appendCodePoint(Math.abs(i) + 32).toString()));
		System.out.println("input3 = " + iFace1Call(x1, i -> String.valueOf(i).repeat(Math.abs(i))));
		System.out.println("input4 = " + iFace1Call(x1, new IFace1Impl()));
	}

	static @NotNull String iFace1Call(int x, IFace1 iF1) {
		return iF1.iFace1(x);
	}

	private static void test18() {
		System.out.println("*** test 18_1 ***");
		quiz1801();
		System.out.println();
		System.out.println("*** test 18_2 ***");
		quiz1802();
		System.out.println();
		System.out.println("*** test 18_3 ***");
		quiz1803();
		System.out.println();
		System.out.println("*** test 18_4 ***");
		quiz1804();
		System.out.println();
		System.out.println("*** test 18_6 ***");
		quiz1806();
		System.out.println();
		System.out.println("*** test 18_7 ***");
		quiz1807();
		System.out.println();
		System.out.println("*** test 18_8 ***");
		quiz1808();
		System.out.println();
	}

	private static void quiz1808() {
		Optional<Double> dbl = Optional.of("Java bootcamp!")
				.flatMap(x -> Optional.ofNullable(null))
				.map(x -> 2)
				.map(x -> 1.9);
		System.out.println(dbl);
	}

	private static void quiz1807() {
		Optional<Integer> opt = Optional.of(123);
		Optional<String> opt2 = opt
				.map(x -> 1.0)
				.map(x -> Integer.valueOf(12).toString())
				.filter(x -> x.contains("2"));
		opt2.ifPresentOrElse(x -> System.out.println("Printing: " + x), () -> System.out.println("default"));
	}

	private static void quiz1806() {
		Optional<String> opt = Optional.of("null");
		System.out.println(opt);
	}

	private static void quiz1804() {
		StringBuilder sb = new StringBuilder("Java Bootcamp!");
		sb.append("!!").insert(2, "##");
		sb.delete(1, 3).insert(1, "#");
		sb.reverse();
		System.out.println(sb);
	}

	private static void quiz1803() {
		StringBuilder sb = new StringBuilder("Java Bootcamp!");
		sb.append("!!").insert(2, "##");
		sb.delete(1, 3).insert(1, "#");
		sb.reverse();
		System.out.println(sb);
	}

	private static void quiz1802() {
		String s1 = "Java bootcamp!";
		StringBuilder sb2 = new StringBuilder("Java bootcamp!");
		if (s1.equals(sb2)) {
			System.out.println("s1.equals(sb2)");
		} else {
			System.out.println("false");
		}
//    if (s1 == sb2) {
//      System.out.println("s1 == sb2");
//    }
	}

	private static void quiz1801() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("one").insert(2, "two").insert(3, "three");
		System.out.println(stringBuilder);
	}

	private static void zad13() {
		System.out.println("*** Exc 13-1 ***");
		exc1301();
		System.out.println();
		System.out.println("*** Exc 13-2 ***");
		exc1302();
		System.out.println();
		System.out.println("*** Exc 13-3 ***");
		exc1303();
		System.out.println();
		System.out.println("*** Exc 13-4 ***");
		exc1304();
		System.out.println();
		System.out.println("*** Exc 13-6 ***");
		exc1306();
		System.out.println();

	}

	private static void exc1306() {
		ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.systemDefault());
		System.out.println(zdt1);
		System.out.println(zdt1.withZoneSameInstant(ZoneId.of("America/New_York")));
	}

	private static void exc1304() {
		Instant i = Instant.now();
		System.out.println(i.getEpochSecond());
		Duration d = Duration.ofSeconds(i.getEpochSecond());
		System.out.println(d);
		Period p = Period.between(LocalDate.EPOCH, LocalDate.now());
		System.out.println(p);
	}

	private static void exc1303() {
		LocalDate date = LocalDate.of(2012, 6, 24);
		System.out.println(date.getMonth());
	}

	private static void exc1302() {
		LocalDate date = LocalDate.of(2018, 5, 6);
		System.out.println(date + " was " + (date.getDayOfWeek()));
	}

	private static void exc1301() {
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime);
		System.out.println(offsetDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		System.out.println(offsetDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		System.out.println(offsetDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm a")));
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
		System.out.println("*** Exc 11_1 ***");
		exc1101();
		System.out.println();
		System.out.println("*** Exc 11_2 ***");
		exc1102();
		System.out.println();
		System.out.println("*** Exc 11_3 ***");
		exc1103();
		System.out.println();
		System.out.println("*** Exc 11_4 ***");
		exc1104();
		System.out.println();
		System.out.println("*** Exc 11_5 ***");
		exc1105();
		System.out.println();
		System.out.println("*** Exc 11_6 ***");
		exc1106();
		System.out.println();
		System.out.println("*** Exc 11_7 ***");
		exc1107("Dupa Romana!");
		System.out.println();
	}

	private static void exc1107(String inputString) {
		List<String> strings = new ArrayList<>(Arrays.asList(inputString.split("")));
		System.out.println(strings);
		Map<String, Integer> map = new HashMap<>();
		for (String s : strings) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
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
			squares.add(new Square(random.nextInt(10) + 1));
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
			if (map.containsKey(integer)) {
				map.put(integer, map.get(integer) + 1);
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

	private static void highestToEnd(List<Integer> integerList) {
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
		stringSet.add("Alę?");
		Iterator<String> iterator = stringSet.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			if (iterator.hasNext()) {
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