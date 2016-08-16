package interview;

public class test {

	private String fname;

	public test(String name) {

		fname = name;
	}

	public String getname() {
		return fname;
	}

	public static void main(String args[]) {
		test s = new test("Test");
		System.out.println(s.getname());
	}
}