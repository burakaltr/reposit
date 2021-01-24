import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Example implements ActionListener {
	JFrame frame = new JFrame();
	private int ii;
	JButton butt;
	JPanel test;

	public Example() {

	 

		JTextArea field = new JTextArea();

 	 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		// frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		//frame.setLayout(null);
		
 	

     	
		JButton bx = new JButton("HITTTTTTTTTTTt me");
		bx.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, e.getSource() == bx);

			}

		});
    	
          JPanel panel = new JPanel(); 
          panel.add(bx)
;         ;
        //JPanel addPanel = new JPanel();
    //    addPanel.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, Color.LIGHT_GRAY));

         
      

 	
 	/*
	 * deleteButton.addActionListener(new ActionListener() { public void
	 * actionPerformed(ActionEvent arg0) { // if (addPanel.getComponentCount() > 0)
	 * {
	 * 
	 * addPanel.remove(addPanel.getComponent(addPanel.getComponentCount() - 1));
	 * addPanel.revalidate(); panel.setPreferredSize(new Dimension(150+ii,150+ii));
	 * 
	 * addPanel.repaint();
	 * 
	 * 
	 * } } });
	 */
	 
	//butt.setBounds(new Rectangle(0,0,5,5));
   	frame.add(panel,BorderLayout.EAST);panel.add(butt=bx);
	JPanel buttonPanel = new JPanel();
 
 
  	//panel.add(addPanel);panel.add(buttonPanel,BorderLayout.SOUTH);
	// panel.setPreferredSize(panel.getPreferredSize());
	//panel.setPreferredSize(new Dimension(150 ,150));test=panel;return panel;
	}

	public static void main(String[] args) {
         EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Example();
            }
        });
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if(e.getSource()==butt)	JOptionPane.showMessageDialog(null, "dell");
	}

}