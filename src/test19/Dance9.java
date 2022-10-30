package test19;

public class Dance9 {
	enum Type {
		HIPHOP("hiphop"),
		JAZZ("jazz"),
		IRISH("irish"),
		SWING("swing"),
		BALLET("ballet");

		private final String value;

		Type(final String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	public static void main(String[] args) {
		System.out.println(Type.HIPHOP);
		System.out.println(Type.JAZZ.ordinal());
		System.out.println(Type.IRISH.name());
		System.out.println(Type.BALLET.getValue());
	}
}
