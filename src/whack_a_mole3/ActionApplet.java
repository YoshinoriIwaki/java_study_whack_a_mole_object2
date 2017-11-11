package whack_a_mole3;

import ActivePicture;
import java.applet.*;
import java.awt.*;

public class ActionApplet extends Applet implements Runnable{
	Thread m_ActionApplet = null;
	int moveInterval;
	int totalTime;
	int elapseTime = 0;
	ActivePicture picture;
	boolean isRunning = false;
	
	public void init() {
		
	}
	
	public void start() {
		if(m_ActionApplet == null) {
			m_ActionApplet = new Thread(this);
			m_ActionApplet.start();
		}
	}
	
	public void run() {
		isRunning = true;
		while(elapseTime < totalTime) {
			try {
				timerAction();
				Thread.sleep(moveInterval);
				elapseTime = elapseTime + moveInterval;
			} catch (InterruptedException e) {
				stop();
			}
		}
		isRunning = false;
		repaint();
	}
	
	public void stop() {
		if(m_ActionApplet != null) {
			m_ActionApplet.stop();
			m_ActionApplet = null;
		}
	}
	
	private void timerAction() {
		picture.timerAction();
		repaint();
	}
	
	public void paint(Graphics g) {
		
	}
	
	public boolean mouseDown(Event evt, int x, int y) {
		if(isRunning & picture.inside(x, y)) {
			picture.mouseDown(evt, x, y);
		}
		return true;
	}
}


