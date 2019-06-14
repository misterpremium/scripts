package project;
import javax.swing.*;
import java.io.File;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;

import java.awt.event.*;
import java.awt.*;

public class Grafico extends JFrame{

	private static final long serialVersionUID = 17L;
	
	
	public Grafico() {
		// TODO Auto-generated constructor stub
		super("Ejemplo 1");
		JButton boton = new JButton("Mostrar dialogo");
		boton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		JOptionPane.showMessageDialog(null,
		"Y así¬ se ve un cuadro de dialogo de error",
		"Mensaje",JOptionPane.ERROR_MESSAGE);
}
		}
		);
		getContentPane().add(new JLabel("Asi se ve un Frame"),
				BorderLayout.NORTH);
				getContentPane().add(boton);
				setSize(200,80);
				setVisible(true);
	}	
	static void playSound() {
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/home/dani/workspace/PorjectDani/src/project/audio.mp3").getAbsoluteFile());
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
				public static void main(String args[])
				{
				JFrame.setDefaultLookAndFeelDecorated(true);
				JDialog.setDefaultLookAndFeelDecorated(true);
				playSound();
				Grafico ventana = new Grafico();
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
				}

	
	}
