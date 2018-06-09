import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener {
	static JFrame frame = new JFrame();
public static void main(String[] args) {
	new SensitiveKeyboard().wasd(frame);
	frame.setVisible(true);;
}
public void wasd(JFrame frame) {
	
	frame.addKeyListener(this);

}
static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }
@Override
public void keyPressed(KeyEvent e) {
	speak("ouch");
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}

