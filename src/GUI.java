import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
	
	int count =0;
	JLabel label;
	JPanel panel;
	JButton button;
	JFrame frame;
	public GUI() {
		
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("Login!");
		label = new JLabel("Number of clicks: 0");
		button.addActionListener(this);
		panel.setBorder(BorderFactory.createEmptyBorder(50,50,20,50));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GOOEY");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new GUI();
			
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		count++;
		label.setText("Number of clicks: "+count);
		
	}

}
