import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffects implements MouseListener{
	public static void main(String[] args) throws Exception {
		new SoundEffects().getGoing();
	}
	void getGoing() {
	String q = "labrador-barking-daniel_simon.wav";
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	frame.setVisible(true);
	frame.add(label);
	JButton button = new JButton();
	frame.add(button);
	button.addMouseListener(this);
	frame.getDefaultCloseOperation();
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
	playSound("labrador-barking-daniel_simon.wav");
	System.out.println("Test");
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
