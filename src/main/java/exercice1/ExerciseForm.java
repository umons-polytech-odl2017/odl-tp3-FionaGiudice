package exercice1;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExerciseForm {

	private JRadioButton rectangleButton;
	private JPanel panel1;
	private JRadioButton squareButton;
	private JRadioButton ellipsisButton;
	private JRadioButton circleButton;
	private JTextArea messageArea;
	private JPanel drawingpanel;

	public ExerciseForm(){
		rectangleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				messageArea.setText("Affichage d'un rectangle");
			}
		});

		squareButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				messageArea.setText("Affichage d'un carré");
			}
		});

		ellipsisButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				messageArea.setText("Affichage d'une ellipse");
			}
		});

		circleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				messageArea.setText("Affichage d'un cercle");
			}
		});

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("ExerciseForm");
		frame.setContentPane(new ExerciseForm().panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
