package Chapter9.NineThree;

public class DateTest {
	public static void main(String[] args) {
		java.util.Date date1 = new java.util.Date();
		date1.setTime(10000L);
		System.out.println(date1.getTime());
		System.out.println(date1.toString());
		System.out.println();
		date1.setTime(100000L);
		System.out.println(date1.getTime());
		System.out.println(date1.toString());
		System.out.println();
		date1.setTime(1000000L);
		System.out.println(date1.getTime());
		System.out.println(date1.toString());
		System.out.println();
		date1.setTime(10000000L);
		System.out.println(date1.getTime());
		System.out.println(date1.toString());
		System.out.println();
		date1.setTime(100000000L);
		System.out.println(date1.getTime());
		System.out.println(date1.toString());
		System.out.println();
		date1.setTime(1000000000L);
		System.out.println(date1.getTime());
		System.out.println(date1.toString());
		System.out.println();
		date1.setTime(10000000000L);
		System.out.println(date1.getTime());
		System.out.println(date1.toString());
		System.out.println();
		date1.setTime(100000000000L);
		System.out.println(date1.getTime());
		System.out.println(date1.toString());
	}
}