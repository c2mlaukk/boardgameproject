import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

class MyDrawingAreaComponent extends JPanel {
	private int ovalx, ovaly;
    private int ovalWidth, ovalHeight;
	private MyMouseListener mouseLstr;
	
	public MyDrawingAreaComponent() {
    
		ovalx = 10;
		ovaly = 10;
        ovalWidth = 50;
        ovalHeight = 25;
	}
	public int getOvalX() {
		return ovalx;
	} 
	public int getOvalY() {
		return ovaly;
	}
	public void setOvalX(int x) {
		ovalx = x;
		repaint();
	}
	public void setOvalY(int y) {
		ovaly = y;
		repaint();
	}
    
    public int getOvalWidth() {
		return ovalWidth;
	} 
	public int getOvalHeight() {
		return ovalHeight;
	}
	public void setOvalWidth(int w) {
		ovalWidth = w;
	}
	public void setOvalHeight(int h) {
		ovalHeight = h;
	}
    public void setAreaSize(int startX, int startY) {
        System.out.println("alueen x: " + (ovalx+ovalWidth));
        // setBounds(startX, startY, getWidth(), getHeight());
        setSize(ovalx + ovalWidth, ovaly + ovalHeight);
        invalidate();
        repaint();
    }
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);        
        g.setColor(Color.blue);
        g.fillOval(ovalx, ovaly, ovalWidth, ovalHeight);
	}
}