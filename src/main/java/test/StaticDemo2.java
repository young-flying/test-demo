package test;

class Static {
	static {
		System.out.println("parent Static");
	}

	{
		System.out.println("parent hello");
	}

	private Static(String str) {
		System.out.println(str);
	}

	public Static() {
		this("parent counstructor");
		System.out.println("parent");
	}
}

public class StaticDemo2 extends Static {
	{
		System.out.println("Beijing!");
	}

	static {
		System.out.println("Shanghai!");
		test(new StaticDemo2());
	}

	public StaticDemo2() {
		this("counstructor");

		System.out.println("china");
	}

	private StaticDemo2(String str) {
		System.out.println(str);
	}

	private static void test(StaticDemo2 sd) {
		System.out.println("sd : " + sd);
	}

	@Override
	public String toString() {
		return "StaticDemo2";
	}

	public static void main(String[] args) {
		System.out.println("I 'm Chinese!");

		StaticDemo2 sd = new StaticDemo2();
		test(sd);

		System.out.println("I love China!");
	}
}

