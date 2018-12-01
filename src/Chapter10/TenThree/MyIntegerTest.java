package Chapter10.TenThree;

public class MyIntegerTest {
	public static void main(String[] args) {

		MyInteger integer1 = new MyInteger(20);
		MyInteger integer2 = new MyInteger(18);
		System.out.println("Integer1 value: " + integer1.value);
		System.out.println("Equal to 20: " + integer1.equals(20));
		System.out.println("Equal to Integer2 (" + integer2.value + "): " + integer1.equals(integer2));
		System.out.println("Even: " + integer1.isEven());
		System.out.println("Odd: " + integer1.isOdd());
		System.out.println("Prime: " + integer1.isPrime());
	
		char integerArray[] = new char[5];
		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i] = '2';
		}		
		
		String integerString = "2345";
		System.out.println("From Array: " + MyInteger.parseInt(integerArray));
		System.out.println("From String: " + MyInteger.parseInt(integerString));
	}
}