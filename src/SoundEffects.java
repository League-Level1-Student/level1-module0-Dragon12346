import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffects implements MouseListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonq = new JButton();
	JButton buttonw = new JButton();
	JButton buttone = new JButton();
	JButton button = new JButton();
	public static void main(String[] args) throws Exception {
		new SoundEffects().getGoing();
	}
	void getGoing() {
	String q = "labrador-barking-daniel_simon.wav";
	
	frame.setVisible(true);
	frame.add(panel);
	
	panel.add(button);
	
	
	panel.add(buttonq);
	

	panel.add(buttonw);
	
	
	panel.add(buttone);
	



	button.addMouseListener(this);
	buttonq.addMouseListener(this);
	buttonw.addMouseListener(this);
	buttone.addMouseListener(this);

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
}
//public void mouseClicked(MouseEvent e) {
//	
//}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if (e.getComponent()==button) {
		playSound("labrador-barking-daniel_simon.wav");	
	}
	
	if (e.getComponent()==buttonq) {
		playSound("sawing-wood-daniel_simon.wav");	
	}
	
	if (e.getComponent()==buttonw) {
		playSound("drum.wav");	
	}
	
	if (e.getComponent()==buttone) {
		playSound("cymbal.wav");	
	}

}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub

}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
