import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 16-21
 * @date Oct. 24, 2018
 * @summary (Count-down stopwatch) Write a program that allows the user to enter
 *          time in seconds in the text field and press the Enter key to count
 *          down the seconds, as shown in Figure 16.45d. The remaining seconds
 *          are redisplayed every one second. When the seconds are expired, the
 *          program starts to play music continuously
 **/
class SixteenTwentyOne {
	public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		System.out.println("Enter seconds: ");
		countdown(getInput());
		System.out.println("Music!");
		SixteenTwentyOne sixTwentyOne = new SixteenTwentyOne();
		sixTwentyOne.sound();
	}

	public static int getInput() {
		Scanner reader = new Scanner(System.in);
		int input = reader.nextInt();
		reader.close();
		return input;
	}

	public static void countdown(int input) throws InterruptedException {
		for (int i = 0; i < input; i++) {
			Thread.sleep(1000);
			System.out.println("Seconds: " + (input - i));
		}
	}

	public void sound() {
	    try {	        
			//AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getResource("/Users/Administrator/Git/CSCI_1110_OOP_Coursework/Chapter_16/music.wav"));
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(SixteenTwentyOne.class.getResource("music.wav"));

			Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	        // If you want the sound to loop infinitely, then put: clip.loop(Clip.LOOP_CONTINUOUSLY); 
	        // If you want to stop the sound, then use clip.stop();
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	}
}