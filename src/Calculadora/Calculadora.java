package Calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCalculadora mimarco=new MarcoCalculadora();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
	}

}

class MarcoCalculadora extends JFrame {
	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500,300,450,300);//Posible uso de pack(); de la clase windows
		LaminaCalculadora milamina=new LaminaCalculadora();
		add(milamina);
		
	}
}

class LaminaCalculadora extends JPanel{
	private JPanel milamina2;
	private JButton pantalla;
	private boolean principio;
	public LaminaCalculadora(){
		principio=true;
		setLayout(new BorderLayout());
		pantalla=new JButton("0");
		pantalla.setEnabled(false);
		add(pantalla,BorderLayout.NORTH);
		milamina2=new JPanel();
		milamina2.setLayout(new GridLayout(4,4));		
		ActionListener insertar=new InsertaNumero();
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		//ponerBoton("/");		
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
		//ponerBoton("*");		
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		//ponerBoton("-");
		ponerBoton("0",insertar);
		ponerBoton(".",insertar);
		//ponerBoton("=");
		//ponerBoton("+");
		add(milamina2, BorderLayout.CENTER);
				
	}
	private void ponerBoton(String rotulo, ActionListener oyente) {//2 funciones:coloca los botones y los hace escuchar
		JButton boton=new JButton(rotulo);
		boton.addActionListener(oyente);
		milamina2.add(boton);
		
	}
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String entrada=e.getActionCommand();
			if(principio==true) {
				pantalla.setText("");
				principio=false;
			}
			pantalla.setText(pantalla.getText()+entrada);
						
		}
		
	}
}