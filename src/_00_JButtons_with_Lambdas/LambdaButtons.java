package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(e -> {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter And Integer"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Another Integer"));
			JOptionPane.showMessageDialog(null,num1+num2+"");
		});
		randNumber.addActionListener(e ->  {
			Random ran = new Random();
			int ranint = ran.nextInt();
			JOptionPane.showMessageDialog(null, ranint+"");
		});
		tellAJoke.addActionListener(e -> JOptionPane.showMessageDialog(null,"What do you call a secure crocodile? A lockodile!"));
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	
	
}
