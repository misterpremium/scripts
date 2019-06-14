package project;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Porject extends JFrame {
	String a;
	//Int r;
	private static final long serialVersionUID = 17L;
	private JPanel contentPane;
	private JTextField txtTextHere;
	private JTextField txtResult;
	private static String scannerString(){
		  Scanner sc =new Scanner(System.in);
		  String func;
		  func = sc.nextLine();
		  if (func=="no"){
		  sc.close();
		  }
		  return func;
		 } 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Porject frame = new Porject();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Porject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton_2 = new JButton("Grafico");
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Project0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Project0();
			}
		});
		contentPane.add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("Salir");
		contentPane.add(btnNewButton_1, BorderLayout.SOUTH);
		
		txtTextHere = new JTextField();
		txtTextHere.setText("Text here");
		contentPane.add(txtTextHere, BorderLayout.CENTER);
		txtTextHere.setColumns(10);
		
		txtResult = new JTextField();
		
		contentPane.add(txtResult, BorderLayout.EAST);
		txtResult.setColumns(10);
		a=scannerString();
		txtResult.setText(a);


}}
