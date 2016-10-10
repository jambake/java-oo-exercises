package encapsulation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewForm
{

	private JFrame frmThisIsMy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					NewForm window = new NewForm();
					window.frmThisIsMy.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewForm()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frmThisIsMy = new JFrame();
		frmThisIsMy.setTitle("This is my app!");
		frmThisIsMy.setBounds(100, 100, 450, 300);
		frmThisIsMy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmThisIsMy.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(206, 6, 238, 266);
		frmThisIsMy.getContentPane().add(list);
		
		JButton btnDoSomething = new JButton("Do Something!");
		btnDoSomething.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello, World!");
			}
		});
		btnDoSomething.setBounds(6, 6, 188, 29);
		frmThisIsMy.getContentPane().add(btnDoSomething);
	}
}
