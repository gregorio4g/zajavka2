package test18;

public class Dog {
  public static void addNames(StringBuilder name1, String name2) {
    name1.append("append");
    name2.concat("concat");
  }

  public static void main(String[] args) {
    StringBuilder name1 = new StringBuilder("Stefan");
    String name2 = "Roman";
    addNames(name1, name2);
    System.out.println(name1 + ", " + name2);
  }
}
