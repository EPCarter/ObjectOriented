import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("resource")
/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 10-25
 * @date Oct. 24, 2018
 * @summary (New string split method) The split method in the String class
 *          returns an array of strings consisting of the substrings split by
 *          the delimiters. However, the delimiters are not returned. Implement
 *          the following new method that returns an array of strings consisting
 *          of the substrings split by the matching delimiter, including the
 *          matching delimiter. You do not need to worry about the case of
 *          multiple delimiters.
 * 
 *          public static String[] split(String s, String regex)
 * 
 *          For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
 *          array of String. split("ab#12#453#", "#") returns ab, #, 12, #, 453,
 *          # in an array of String
 **/
class SplitString {
	public static void main(String[] args) {
		System.out.println("String to split: ");
		String s = getInput();
		System.out.println();
		System.out.println("Delimiter: ");
		String regex = getInput();
		if (regex.matches("\\W")) {
			regex = "\\" + regex;
		}

		s = s.replaceAll(regex, "," + regex + ",");
		regex = ",";
		String output = cleaner(split(s, regex).toString());
		System.out.println();
		System.out.println(output);
	}

	public static String cleaner(String toClean) { // removes most punctuation
		String cleanedString = toClean.replaceAll("\\[|\\]", " ");
		cleanedString = cleanedString.replaceAll(" , ,", "");
		cleanedString = cleanedString.replaceAll("\\s{2,}", " "); // removes extra spaces
		cleanedString = cleanedString.replaceAll("\\s{2,}", " ");
		cleanedString = cleanedString.replaceAll("^\\s{1,}", "");
		return cleanedString;
	}

	public static String getInput() {
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		return input;
	}

	public static List<List<String>> split(String s, String regex) {
		List<List<String>> data = new ArrayList<>();
		String[] split = s.split(regex);
		data.add(Arrays.asList(split));
		return data;
	}
}