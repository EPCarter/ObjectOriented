import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 12-19
 * @date Oct. 24, 2018
 * @summary (Count words) Write a program that counts the number of words in
 *          President Abraham Lincoln’s Gettysburg address from
 *          http://cs.armstrong.edu/liang/data/Lincoln.txt.
 **/
class TwelveNineteen {
	public static void main(String[] args) throws IOException {
		String speech = internetQuery();
		speech = cleaner(speech);
		System.out.println(counter(speech));
	}

	public static String internetQuery() throws IOException {
		Scanner reader = new Scanner(System.in);
		String urlString = "http://cs.armstrong.edu/liang/Lincoln.txt";

		URL url = new URL(urlString);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");

		// int status = con.getResponseCode();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer content = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			content.append(inputLine);
		}
		in.close();
		con.disconnect();
		String contentString = content.toString();
		String output = cleaner(contentString);
		return output;
	}

	public static String cleaner(String toClean) {
		String cleanedString = toClean.replaceAll("\\,|\\*|\\(|\\)|\\[|\\]|\\:|\\'|\\^|\\?|\"|\\.|\\s\\-\\s|\\--", " ");
		cleanedString = cleanedString.replaceAll("\\s{2,}", " ");
		cleanedString = cleanedString.replaceAll("\\s{2,}", " ");
		cleanedString = cleanedString.replaceAll("^\\s", "");
		return cleanedString;
	}

	public static int counter(String speech) {
		int count = 0;
		ArrayList<String> data = new ArrayList<>();
		String[] values = speech.split(" ");
		for (int j = 0; j < values.length; j++) {
			data.add(j, values[j]);
		}
		count = data.size();
		return count;
	}
}