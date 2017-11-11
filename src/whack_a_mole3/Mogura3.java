package whack_a_mole3;

import ActivePicture;
import ActionApplet;
import MoguraApp3;
import java.awt.*;
import java.lang.Math;

public class Mogura3 extends ActivePicture{
	int maxLeft, maxTop;
	int myScore = 10;
	
	public void init(ActionApplet anApplet, int aMaxX, int aMaxY) {
		super.init(anApplet, "Mogura.gif");
		maxLeft = aMaxX;
		maxTop = aMaxY;
	}
	
	public void timerAction{
		left = (int)((double)maxLeft * Math.random());
		top = (int)((double)maxTop * Math.random());
	}
	
	public boolean mouseDown(Event evt, int x, int y) {
		((MoguraApp3)owner).addScore(myScore);
		return true;
	}
	
}
