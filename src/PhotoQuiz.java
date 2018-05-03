
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String NW = "https://www.nationalgeographic.com/content/dam/animals/thumbs/rights-exempt/mammals/n/narwhal_thumb.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component qwertyuiop;
		// 3. use the "createImage()" method below to initialize your Component
		qwertyuiop = createImage(NW);
		// 4. add the image to the quiz window
		quizWindow.add(qwertyuiop);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String Poem = JOptionPane
				.showInputDialog("How much ice could a narwhale break, if a narwhale could break ice?");
		// 7. print "CORRECT" if the user gave the right answer
		Poem.toLowerCase();
		if (Poem.equals("a narwhale would break as much ice as a narwhale could break if a narwhale could break ice")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect.");

		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(qwertyuiop);
		// 10. find another image and create it (might take more than one line of code)
		String asdfghjkl = "http://dogecoin.com/imgs/dogecoin-300.png";
		// 11. add the second image to the quiz window
		qwertyuiop =

				createImage(asdfghjkl);

		// 12. pack the quiz window
		quizWindow.add(qwertyuiop);
		quizWindow.pack();
		// 13. ask another question
		String zxcvbnm = JOptionPane.showInputDialog("What is the best very coin?");
		zxcvbnm = zxcvbnm.toLowerCase();
		if (zxcvbnm.equals("dogecoin")) {
			JOptionPane.showMessageDialog(null, "Correct bannanna");
		} else {
			JOptionPane.showMessageDialog(null, "You is not much doge!");
		}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
