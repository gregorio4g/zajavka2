public class Employee {
	private final String name;
	private final String sureName;

	public Employee(String name, String sureName) {
		this.name = name;
		this.sureName = sureName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Employee employee)) return false;

		if (!getName().equals(employee.getName())) return false;
		return getSureName().equals(employee.getSureName());
	}

	@Override
	public int hashCode() {
		int result = getName().hashCode();
		result = 31 * result + getSureName().hashCode();
		return result;
	}

	@Override
	public String toString() {
		return name + " "+ sureName;
	}

	public String getName() {
		return name;
	}

	public String getSureName() {
		return sureName;
	}
}
