package whack_a_mole3;

import ActionApplet;
import Mogura3;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class MoguraApp3 extends ActionApplet{
	int score = 0;
	
	public void init() {
		setBackground(Color.white);
		moveInterval = 500;
		totalTime = 30000;
		picture = new Mogura3();
		((Mogura3)picture).init(this, 220, 140);
		resize(320, 240);
	}
	
	public void paint(Graphics g) {
		picture.paint(g);
		if(isRunning) {
			g.drawString("score=" + score, 10, 20);
		} else {
			g.drawString("score=" + score + "<end>", 10, 20);
		}
	}
	
	public void addScore(int addition) {
		score = score + addition;
	}
}