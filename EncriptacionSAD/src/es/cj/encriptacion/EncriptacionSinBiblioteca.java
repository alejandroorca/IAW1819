package es.cj.encriptacion;

// Librerias de forma aspecto y escucha de campos de texto.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Apariencia gráfica del programa
public class EncriptacionSinBiblioteca extends JFrame implements ActionListener{
	JButton btnIngresar;
	JTextField caja1;
	JTextField caja2;
	JTextField caja3;
	JLabel etiqueta;
	JLabel etiqueta1;
	JLabel etiqueta2;
	JLabel etiqueta3;
	JButton btnReset;

	public EncriptacionSinBiblioteca() {
setSize(850, 200); 
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
setLayout(null);
setTitle("Encriptador by Alejandro OC");
setResizable(false);


etiqueta= new JLabel ();
etiqueta.setText("Introduzca texto a encriptar. *");
etiqueta.setBounds(50, 20, 300, 30);
getContentPane().add(etiqueta);

etiqueta1= new JLabel ();
etiqueta1.setText("Texto encriptado.");
etiqueta1.setBounds(350, 20, 200, 30);
getContentPane().add(etiqueta1);

etiqueta2= new JLabel ();
etiqueta2.setText("Texto sin encriptar.");
etiqueta2.setBounds(620, 20, 200, 30);
getContentPane().add(etiqueta2);

etiqueta3= new JLabel ();
etiqueta3.setText("El simbolo '*' indica campo obligatorio a ingresar los datos.");
etiqueta3.setBounds(250, 120, 500, 30);
getContentPane().add(etiqueta3);

caja1= new JTextField();
caja1.setBounds(30, 50, 200, 30);
getContentPane().add(caja1);

caja2= new JTextField();
caja2.setBounds(300, 50, 200, 30);
getContentPane().add(caja2);

caja3= new JTextField();
caja3.setBounds(570, 50, 200, 30);
getContentPane().add(caja3);

btnIngresar = new JButton();
btnIngresar.setText("Enviar");
btnIngresar.setBounds(220, 90, 100, 30);
getContentPane().add(btnIngresar);
btnIngresar.addActionListener(this);

btnReset = new JButton();
btnReset.setText("Limpiar campos");
btnReset.setBounds(420, 90, 200, 30);
getContentPane().add(btnReset);
btnReset.addActionListener(this);
	}
	
	// Procedimiento del programa con la escucha de los botones
	
public void actionPerformed(ActionEvent evento) {
 if(evento.getSource()==btnIngresar) {
	String texto1 = caja1.getText();
	String [] caracteres= {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
			"K", "L", "M","N","O","P","Q","R","S","T","U","V","W", "X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n",
			"ñ","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
 String lista[] = {texto1};
 String contra = "";
 for (int cont = 0; cont <=62; cont++){

  int numRandom = (int) Math.round(Math.random() * 62 ) ;
  contra = contra+""+caracteres[numRandom];
   
 }
 
 
 caja2.setText(contra);
 caja3.setText(lista[0]);
 JOptionPane.showMessageDialog(null, "Texto encriptado.");
 } else if(evento.getSource()==btnReset){
	caja1.setText(null);
	caja2.setText(null);
	caja3.setText(null);
	JOptionPane.showMessageDialog(null, "Se han reseteado los campos.");
 }
}

public static void main(String[] args) {
	new EncriptacionSinBiblioteca();
	
}
}