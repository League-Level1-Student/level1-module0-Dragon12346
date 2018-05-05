import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	JPanel panel = new JPanel();
	static JButton button = new JButton();

	public static void main(String[] args) {

		FortuneCookie fc = new FortuneCookie();
		fc.showButton();


	}

	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if (rand==0) {
			JOptionPane.showMessageDialog(null, "Something bad will happen");
		}
		if (rand==1) {
			JOptionPane.showMessageDialog(null, "Something good will happen");
		}
		if (rand==2) {
			JOptionPane.showMessageDialog(null, "Something bad will happen to your house");
		}
		if (rand==3) {
			JOptionPane.showMessageDialog(null, "Something good will happento your house");
		}
		if (rand==4) {
			JOptionPane.showMessageDialog(null, "Something bad will happen if you keep eating fortune cookies!");
		}
	}
}
