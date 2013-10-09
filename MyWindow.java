import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;

class MyWindow extends JFrame implements ActionListener {

	private JButton okButton;
	private JButton cancelButton;
	private MyDrawingAreaComponent myPanel;
    private BorderLayout myLayout;
	
	// private JPanel masterPanel;
	
	private JPanel board;
	Container window;
	
	public MyWindow() {
		// masterPanel = new JPanel(new BorderLayout());
		myLayout = new BorderLayout();
		
		board = new JPanel(new GridLayout(8,8));
		addButtons();
		setLayout(myLayout);
		add(board, BorderLayout.CENTER);
		add(new JButton("ok"), BorderLayout.PAGE_START);
		
		// setLayout(board);
	
		// addPanel();
		
		// masterPanel.add(board, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	void addButtons() {
		
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				JButton nextToAdd = new JButton(i + ", " + j);
				nextToAdd.setMaximumSize(new Dimension(10, 10));
				board.add(nextToAdd);
			}
			
		}
		
		// add listener to myButton
		// okButton.addActionListener(this);
		
	}
	
	
	void addPanel() {
		myPanel = new MyDrawingAreaComponent();
        MyMouseListener mouseLstr = new MyMouseListener(myPanel);
		myPanel.addMouseListener(mouseLstr);
        myPanel.addMouseMotionListener(mouseLstr);
		add(myPanel, BorderLayout.CENTER);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
			if (e.getSource() == okButton) {
				System.out.println("ok");
			}
			else if (e.getSource() == cancelButton) {
				System.out.println("cancel");
			}
		
	}

}