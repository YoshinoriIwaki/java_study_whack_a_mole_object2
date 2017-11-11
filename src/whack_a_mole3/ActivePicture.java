package whack_a_mole3;

import ActionApplet;
import java.awt.*;

public class ActivePicture {
	ActionApplet owner;
	Image myImage;
	int left, top;
	
	public void init(ActionApplet anApplet, String imageFileName) {
		owner = anApplet;
		myImage = owner.getImage(owner.getDocumentBase(), imageFileName);
		left = 0;
		top = 0;
		
	}
	
	public void paint(Graphics g) {
		g drawImage(myImage, left, top, owner);
	}
	
	public void timerAction() {
		
	}
	
	public boolean inside(int x, int y) {
		if(x < left) return false;
		if(y < top) return false;
		if(x > (left + myImage.getWidth(owner))) return false;
		if(y > (top + myImage.getHeight(owner))) return false;
		return true;
	}
	
	public boolean mouseDown(Event evt, int x, int y) {
		return true;
	}
}
