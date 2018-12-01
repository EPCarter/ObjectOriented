package Chapter9.NineNine;

public class RegularPolygonTest {
	public static void main(String[] args) {
		RegularPolygon polygon1 = new RegularPolygon(6, 4);
		polygon1.printer();

		System.out.println();

		RegularPolygon polygon2 = new RegularPolygon(10, 4, 5.6, 7.8);
		polygon2.printer();
	}
}