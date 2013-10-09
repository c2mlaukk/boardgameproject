import java.awt.event.*;

class MyMouseListener extends MouseAdapter implements MouseListener, MouseMotionListener{

    private boolean mouseOnObject;
    private int tempX, tempY;
	private MyDrawingAreaComponent host;

	public MyMouseListener(MyDrawingAreaComponent myPanel) {
		host = myPanel;
        mouseOnObject = false;
	}
	
    @Override
    public void mousePressed(MouseEvent e) {
        host.setOvalX(e.getX());
        host.setOvalY(e.getY());
        tempX = e.getX();
        tempY = e.getY();
    }
        
    @Override
    public void mouseDragged(MouseEvent e) {
        if (tempX <= e.getX()) {
            host.setOvalX(tempX);
            host.setOvalWidth(e.getX() - tempX);
        }
        else {
            host.setOvalX(e.getX());
            host.setOvalWidth(tempX - e.getX());
        }
        
        if (tempY <= e.getY()) {
            host.setOvalY(tempY);
            host.setOvalHeight(e.getY() - tempY);
        }
        else {
            host.setOvalY(e.getY());
            host.setOvalHeight(tempY - e.getY());
        }
        
        host.repaint();
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        mouseOnObject = false;
    }
}