import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 12-15
 * @date Oct. 24, 2018
 * @summary (Write/read data) Write a program to create a file named
 *          Exercise12_15.txt if it does not exist. Write 100 integers created
 *          randomly into the file using text I/O. Integers are separated by
 *          spaces in the file. Read the data back from the file and display the
 *          data in increasing order
 **/
class TwelveFifteen {
	public static void main(String[] args) throws IOException {
		exporter(arrayMaker());
		System.out.println("Input: " + cleaner(importer().toString()));
	}

	public static String numberGenerator() {
		Random rand = new Random();
		int number = rand.nextInt(100);
		String numString = Integer.toString(number);
		return numString;
	}

	public static ArrayList<String> arrayMaker() {
		ArrayList<String> data = new ArrayList<>();
		System.out.print("Output: ");
		for (int i = 0; i < 100; i++) {
			data.add(i, numberGenerator());
		}
		System.out.println(cleaner(data.toString()));
		return data;
	}

	public static void exporter(ArrayList<String> data) throws IOException {
		String output = data.toString();
		BufferedWriter writer = new BufferedWriter(
				new FileWriter("/Users/Administrator/Git/CSCI_1110_OOP_Coursework/Chapter_12/Exercise12_15.txt"));
		writer.write(output);
		writer.close();
	}

	public static ArrayList<String> importer() {
		ArrayList<String> data = new ArrayList<>();
		String fileName = "/Users/Administrator/Git/CSCI_1110_OOP_Coursework/Chapter_12/Exercise12_15.txt";
		File file = new File(fileName);
		Scanner inputStream;
		try {
			inputStream = new Scanner(file);
			while (inputStream.hasNext()) {
				String line = cleaner(inputStream.nextLine());
				String[] values = line.split(" ");
				for (int j = 0; j < values.length; j++) {
					data.add(j, values[j]);
				}
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		data.sort(Comparator.naturalOrder());
		return data;
	}

	public static String cleaner(String toClean) {
		String cleanedString = toClean.replaceAll("\\,|\\*|\\(|\\)|\\[|\\]|\\:|\\'|\\^|\\?|\"", " ");
		cleanedString = cleanedString.replaceAll("\\s{2,}", " ");
		cleanedString = cleanedString.replaceAll("\\s{2,}", " ");
		cleanedString = cleanedString.replaceAll("^\\s", "");
		cleanedString = cleanedString.toUpperCase();
		return cleanedString;
	}
}