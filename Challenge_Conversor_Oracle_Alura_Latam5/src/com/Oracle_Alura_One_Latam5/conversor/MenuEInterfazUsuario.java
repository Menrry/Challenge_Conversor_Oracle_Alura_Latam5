package com.Oracle_Alura_One_Latam5.conversor;

import java.awt.EventQueue;
import java.awt.Image;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
/**
 * 
 * @author Ing. Menrry Santana
 *correo: msantanalacruz@gmail.com
 *whatsApp: +56 937199177
 *
 */
public class MenuEInterfazUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldImporte;
	public double valor = 0.00;
	public String elementoSeleccionadoDe = "";
	public String elementoSeleccionadoA = "";
	public String TemperaturaDe = "";
	public String TemperaturaA= "";
	private JTextField textFieldTemperatura;
	public double b=459.67;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuEInterfazUsuario frame = new MenuEInterfazUsuario();
					//frame.setVisible(true);
					//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);// Maximiza la ventana Menrry
					
					
					//*************************************** MenrrySantana *************************
			        //JFrame frame = new JFrame("Mi ventana");
			        frame.setSize(975, 580);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.setVisible(true);
			        frame.setResizable(false); //deshabilitar expandir
			        frame.setLocationRelativeTo(null); // Centrar
					//*******************************************	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	
	/**
	 * Create the frame.
	 */
	public MenuEInterfazUsuario() {
		setTitle("ConversorAluraOneLatam5 || Oracle    Ing. Menrry Santana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1042, 23);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Conversiones");
		mnNewMenu.setIcon(null);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Convertir Monedas");
		mnNewMenu.add(mntmNewMenuItem);
		
		//********************************** Menú Temperatura *************************************************
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setForeground(new Color(0, 0, 0));  
		lblTemperatura.setFont(new Font("Dialog", Font.BOLD, 25));
		lblTemperatura.setBounds(70, 280, 190, 24);  
		contentPane.add(lblTemperatura);
		lblTemperatura.setVisible(false);
		
		textFieldTemperatura = new JTextField();
		textFieldTemperatura.setBounds(70, 310, 190, 24);   //ok
		contentPane.add(textFieldTemperatura);
		textFieldTemperatura.setColumns(10);
		textFieldTemperatura.setVisible(false);
		
		JLabel lblDeT = new JLabel("De :");
		lblDeT.setForeground(new Color(0, 0, 0));
		lblDeT.setFont(new Font("Dialog", Font.BOLD, 25));
		lblDeT.setBounds(280, 280, 70, 24);  
		contentPane.add(lblDeT);
		lblDeT.setVisible(false);
		
		JComboBox comboBoxDeT = new JComboBox();
		comboBoxDeT.setFont(new Font("Dialog", Font.BOLD, 14));
		comboBoxDeT.setBounds(280, 310, 215, 24);
		contentPane.add(comboBoxDeT);
		comboBoxDeT.addItem("Grados Celcius");
		comboBoxDeT.addItem("Grados fahrenheit");
		comboBoxDeT.addItem("Grados kelvin");
		comboBoxDeT.setVisible(false);
		
		JLabel lblAT = new JLabel("a");
		lblAT.setForeground(new Color(0, 0, 0));
		lblAT.setFont(new Font("Dialog", Font.BOLD, 25));
		lblAT.setBounds(540, 280, 70, 24); 
		contentPane.add(lblAT);
		lblAT.setVisible(false);
		
		JComboBox comboBoxAT = new JComboBox();
		comboBoxAT.setFont(new Font("Dialog", Font.BOLD, 14));
		comboBoxAT.setBounds(540, 310, 215, 24);   //selector A  160
        comboBoxAT.addItem("Grados Celcius");
        comboBoxAT.addItem("Grados fahrenheit");
        comboBoxAT.addItem("Grados kelvin");
		contentPane.add(comboBoxAT);
		comboBoxAT.setVisible(false);
		
		
		ImageIcon icono2 = new ImageIcon("/home/menrry/Imágenes/Imagenes_Casas_Cambios/Flecha_Dual.png");
		Image imagen2 = icono2.getImage().getScaledInstance(34, 25, Image.SCALE_SMOOTH);
		icono2 = new ImageIcon(imagen2);
		JButton btnNewButtonCambioT = new JButton("");
		btnNewButtonCambioT.setIcon(icono2);
		btnNewButtonCambioT.setBounds(500, 310, 34, 25);   // falta********************************************
		contentPane.add(btnNewButtonCambioT);
		btnNewButtonCambioT .setVisible(false);
		
		
		JButton btnNewButtonConvT = new JButton("Convertir");
		btnNewButtonConvT.setBounds(765, 305, 135, 35);
		contentPane.add(btnNewButtonConvT);
		btnNewButtonConvT.setVisible(false);
		
		//*************************************************************************************************************
		//************************************************** Interfaz-Cambio-Moneda *******************************************

	 	JLabel lblImporte = new JLabel("Importe");
		lblImporte.setForeground(new Color(0, 0, 0));  
		lblImporte.setFont(new Font("Dialog", Font.BOLD, 25));
		lblImporte.setBounds(100, 280, 123, 24);  //trabajando
		//contentPane.
		getContentPane().add(lblImporte);
		lblImporte.setVisible(false);
		
		textFieldImporte = new JTextField();
		textFieldImporte.setBounds(100, 310, 160, 24);   //ok
		textFieldImporte.setColumns(10);
		//contentPane.
		getContentPane().add(textFieldImporte);
		textFieldImporte.setVisible(false);
		
		JLabel lblDe = new JLabel("De:");
		lblDe.setForeground(new Color(0, 0, 0));
		lblDe.setFont(new Font("Dialog", Font.BOLD, 25));
		lblDe.setBounds(280, 280, 70, 24);  							//De
		//contentPane.
		getContentPane().add(lblDe);
		lblDe.setVisible(false);
		
		JComboBox<String> comboBoxDe = new JComboBox<>();  //Selector de:
		comboBoxDe.setFont(new Font("Dialog", Font.BOLD, 14));
		comboBoxDe.setBounds(280, 310, 215, 24);  //160
		contentPane.add(comboBoxDe);
        comboBoxDe.addItem("CLP-Peso chileno");
        comboBoxDe.addItem("USD-Dólar estadounidense");
        comboBoxDe.addItem("EUR-Euro");
        comboBoxDe.addItem("GBP-Libra esterlina");
        comboBoxDe.addItem("CAD-Dolar canadiense");
        comboBoxDe.addItem("JPY-Yen japonés");
        comboBoxDe.addItem("AUD-Dolar australiano");
        comboBoxDe.setVisible(false);
        

	
		//********************** 
		ImageIcon icono = new ImageIcon("/home/menrry/Imágenes/Imagenes_Casas_Cambios/Flecha_Dual.png");
		Image imagen = icono.getImage().getScaledInstance(34, 25, Image.SCALE_SMOOTH);
		icono = new ImageIcon(imagen);
		JButton btnNewButtonM = new JButton();
		btnNewButtonM.setIcon(icono);
		btnNewButtonM.setBounds(500, 310, 34, 25); 
		contentPane.add(btnNewButtonM);
		btnNewButtonM.setVisible(false);
		
		//*************************lblA
		JLabel lblA = new JLabel("a");
		lblA.setForeground(new Color(0, 0, 0));
		lblA.setFont(new Font("Dialog", Font.BOLD, 25));
		lblA.setBounds(540, 280, 70, 24); 
		contentPane.add(lblA);
		lblA.setVisible(false);
		//**********************
		
		
		
		JComboBox<Object> comboBoxA = new JComboBox<>();
		comboBoxA.setFont(new Font("Dialog", Font.BOLD, 14));
		comboBoxA.setBounds(540, 310, 215, 24);   
		contentPane.add(comboBoxA);
        comboBoxA.addItem("CLP-Peso chileno");
        comboBoxA.addItem("USD-Dólar estadounidense");
        comboBoxA.addItem("EUR-Euro");
        comboBoxA.addItem("GBP-Libra esterlina");
        comboBoxA.addItem("CAD-Dolar canadiense");
        comboBoxA.addItem("JPY-Yen japonés");
        comboBoxA.addItem("AUD-Dolar australiano");
		comboBoxA.setVisible(false);
			
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(765, 305, 135, 35);
		contentPane.add(btnConvertir);
		btnConvertir.setVisible(false);
		

		
//************************** Menu item Convertidor de Monedas ********************************************************************************			           

				mntmNewMenuItem.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 if (e.getSource() == mntmNewMenuItem) {
					          
							 lblImporte.setVisible(true);
							 textFieldImporte.setVisible(true);
							 lblDe.setVisible(true);
							 comboBoxDe.setVisible(true);
							 btnNewButtonM.setVisible(true);
							 lblA.setVisible(true);
							 comboBoxA.setVisible(true);
							 btnConvertir.setVisible(true);
							 //*************Menu temperatura
							 lblTemperatura.setVisible(false);
							 textFieldTemperatura.setVisible(false);
							 lblDeT.setVisible(false);
							 comboBoxDeT.setVisible(false);
							 btnNewButtonCambioT.setVisible(false);
							 lblAT.setVisible(false);
							 comboBoxAT.setVisible(false);
							 btnNewButtonConvT.setVisible(false);
							
						 }
			
					}
					
				});
				
		
//*****************************************************************************************************
		
			JMenuItem mntmNewMenuItem_1 = new JMenuItem("Convertir Temperatura");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			// Menu de temperatura*****************
				
				 lblTemperatura.setVisible(true);
				 textFieldTemperatura.setVisible(true);
				 lblDeT.setVisible(true);
				 comboBoxDeT.setVisible(true);
				 btnNewButtonCambioT.setVisible(true);
				 lblAT.setVisible(true);
				 comboBoxAT.setVisible(true);
				 btnNewButtonConvT.setVisible(true);
				 //*********************Monedas******************
				 lblImporte.setVisible(false);
				 textFieldImporte.setVisible(false);
				 lblDe.setVisible(false);
				 comboBoxDe.setVisible(false);
				 btnNewButtonM.setVisible(false);
				 lblA.setVisible(false);
				 comboBoxA.setVisible(false);
				 btnConvertir.setVisible(false);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
	 	
	 	JMenuItem mntmNewMenuItem_2 = new JMenuItem("Salir");
	 	mntmNewMenuItem_2.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {     //*****************Salir
	 			System.exit(EXIT_ON_CLOSE);				// sale bruscamente(EXIT_ON_CLOSE);
	 		}
	 	});
	 	mnNewMenu.add(mntmNewMenuItem_2);
		
//********************************************************************** intercambia temperatura ********
		btnNewButtonCambioT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Revertir selección Temperatura
        		
				String TemperaturaDe = (String) comboBoxDeT.getSelectedItem();
				String TemperaturaA= (String) comboBoxAT.getSelectedItem();
        		comboBoxDeT.setSelectedItem(TemperaturaA);
        		comboBoxAT.setSelectedItem(TemperaturaDe);
        		
			}
		});	 	
	 	
	 	
//***************** Enento del Boton Convertir Temperatura **
		btnNewButtonConvT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String temperatura = textFieldTemperatura.getText();
				TemperaturaDe = (String) comboBoxDeT.getSelectedItem();
				TemperaturaA = (String) comboBoxAT.getSelectedItem();
				//**************************************************************
    			
				if (temperatura.isEmpty()){
    				JOptionPane.showMessageDialog(null, "Por favor introducir el Importe...! \n ");
    			} else {
    	
    				;//**************** Valor  *********************************
    				
    				if (temperatura.matches("[0-9]+")) {
    				
    				valor = Double.parseDouble(temperatura);
    			
				//****************************************************************
		    		 switch(TemperaturaDe) {
				    	case "Grados Celcius" :
				    		 switch (TemperaturaA) {
				             case "Grados Celcius" :
				            	 Conversion(valor,0);
				               	 break;
				             case "Grados fahrenheit" :
				            	 double resultado = 0.0;
					             resultado = (valor * 9 / 5) + 32;
					             Conversion(resultado,1);
					             break;
				             case "Grados kelvin" :
				            	 resultado = valor + 273.15;
				            	 Conversion(resultado,1);
				            	 break;
				             }
				    		 break;
				       case "Grados fahrenheit":
				    	   switch (TemperaturaA) {
				             case "Grados Celcius" :
				            	 double resultado = 0.0;
				            	 resultado = (valor - 32) * 5 / 9;
				            	 Conversion(resultado,1);
				            	 break;
				             case "Grados fahrenheit" :
				            	 Conversion(valor,0);
				            	 break;
				             case "Grados kelvin" :
				            	 double b = 459.67;
				            	 resultado = (valor + b) * (5.0 / 9.0);
				            	 Conversion(resultado,1);
				            	 break;
				             }
				    	   	 break;
				       case "Grados kelvin":
				    	   switch (TemperaturaA) {
				             case "Grados Celcius" :
				            	 double resultado = 0.0;
				            	 double b = 273.15;
				            	 resultado = valor - b;
				            	 Conversion(resultado,1);
				            	 break;
				             case "Grados fahrenheit" :
				            	 b = 459.67;
				            	 resultado = (valor * 9.0/5.0) - b;
				            	 Conversion(resultado,1);
				            	 break;
				             case "Grados kelvin" :
				            	 Conversion(valor,0);	 
				            	 break;
				             }
				    	   	 break;				    	 
				    					    	   	
				        default:
				    	     break;
				    	} 
    				}
    				else { 
    					JOptionPane.showMessageDialog(null, " Por favor introducir sólo números");
    	    	}
    			}
				
			}
		});
	    btnNewButtonM.addActionListener(new ActionListener() {  // Boton Cambalache Moneda
        	public void actionPerformed(ActionEvent e) {
        		
        		//Revertir selección Monedas
        		
				String elementoSeleccionadoDe = (String) comboBoxDe.getSelectedItem();
				String elementoSeleccionadoA = (String) comboBoxA.getSelectedItem();
        		comboBoxDe.setSelectedItem(elementoSeleccionadoA);
        		comboBoxA.setSelectedItem(elementoSeleccionadoDe);
				
        	}
        });
		
		
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				elementoSeleccionadoDe = (String) comboBoxDe.getSelectedItem();
				elementoSeleccionadoA = (String) comboBoxA.getSelectedItem();
				
								
	//-----------------------------------Logica del Conversor de Moneda ---------------------------
				String importe =textFieldImporte.getText();
    			
				if (importe.isEmpty()){
    				JOptionPane.showMessageDialog(null, "Por favor introducir el Importe...! \n ");
    			} else {
    	
    				;//**************** Valor  *********************************
    				
    				if (importe.matches("[0-9]+")) {
    				
    				valor = Double.parseDouble(importe);
    				String valorado = String.format("%,.1f", valor);	
    				
		    	switch(elementoSeleccionadoDe) {
		    	case "CLP-Peso chileno" :
		    		 switch (elementoSeleccionadoA) {
		             case "CLP-Peso chileno" :
		            	 obtenerCambio(0);
		            	break;
		             case "USD-Dólar estadounidense":
		            	 obtenerCambio(0.0012);
		            	break;
		             case "EUR-Euro" :
		            	 obtenerCambio(0.0011);
		            	 break;
		             case "GBP-Libra esterlina" :
		            	 obtenerCambio(0.00094);
		            	 break;
		             case "CAD-Dolar canadiense" :
		            	 obtenerCambio(0.0016);
		            	 break;
		             case "JPY-Yen japonés" :
		            	 obtenerCambio(0.17);
		            	 break;
		             case "AUD-Dolar australiano" :
		            	 obtenerCambio(0.0018);
		            	 break;
		            }
		    		 break;
		       case "USD-Dólar estadounidense":
		    	   switch (elementoSeleccionadoA) {
		             case "CLP-Peso chileno" :	
		            	 obtenerCambio(814);
		            	 break;
		             case "USD-Dólar estadounidense":
		            	 obtenerCambio(0);
		            	 break;
		             case "EUR-Euro" :
		            	 obtenerCambio(0.89);
		            	 break;
		             case "GBP-Libra esterlina" :
		            	 obtenerCambio(0.76);
		            	 break;
		             case "CAD-Dolar canadiense" :
		            	 obtenerCambio(1.32);
		            	 break;
		             case "JPY-Yen japonés" :
		            	 obtenerCambio(5.87);
		            	 break;
		             case "AUD-Dolar australiano" :
		            	 obtenerCambio(556.78);
		            	 break;
		             }
		    	   	break;
		       case "EUR-Euro" :
		    	   switch (elementoSeleccionadoA) {
		             case "CLP-Peso chileno" :
		            	 obtenerCambio(922.90);
		            	 break;
		             case "USD-Dólar estadounidense":
		            	 obtenerCambio(1.12);
		            	 break;
		             case "EUR-Euro" :
		            	 obtenerCambio(0);
		            	 break;
		             case "GBP-Libra esterlina" :
		            	 obtenerCambio(0.86);
		            	 break;
		             case "CAD-Dolar canadiense" :
		            	 obtenerCambio(1.48);
		            	 break;
		             case "JPY-Yen japonés" :
		            	 obtenerCambio(155.49);
		            	 break;
		             case "AUD-Dolar australiano" :
		            	 obtenerCambio(1.64);
		            	 break;
		             }
		    	   	break;
		       case "GBP-Libra esterlina" :
		    	   switch (elementoSeleccionadoA) {
		             case "CLP-Peso chileno" :
		            	 obtenerCambio(1074.25);
		            	 break;
		             case "USD-Dólar estadounidense":
		            	 obtenerCambio(1.31);
		            	 break;
		             case "EUR-Euro" :
		            	 obtenerCambio(1.17);
		            	 break;
		             case "GBP-Libra esterlina" :
		            	 obtenerCambio(0);
		            	 break;
		             case "CAD-Dolar canadiense" :
		            	 obtenerCambio(1.73);
		            	 break;
		             case "JPY-Yen japonés" :
		            	 obtenerCambio(181.34);
		            	 break;
		             case "AUD-Dolar australiano" :
		            	 obtenerCambio(1.92);
		            	 break;
		             }
		    	   break;
		       case "CAD-Dolar canadiense" :
		    	   switch (elementoSeleccionadoA) {
		             case "CLP-Peso chileno" :
		            	 obtenerCambio(615.64);
		            	 break;
		             case "USD-Dólar estadounidense":
		            	 obtenerCambio(0.76);
		            	 break;
		             case "EUR-Euro" :
		            	 obtenerCambio(0.67);
		            	 break;
		             case "GBP-Libra esterlina" :
		            	 obtenerCambio(0.58);
		            	 break;
		             case "CAD-Dolar canadiense" :
		            	 obtenerCambio(0);
		            	 break;
		             case "JPY-Yen japonés" :
		            	 obtenerCambio(104.75);
		            	 break;
		             case "AUD-Dolar australiano" :
		            	 obtenerCambio(1.11);
		            	 break;
		             }
		    	   break;
		       case "JPY-Yen japonés" :
		    	   switch (elementoSeleccionadoA) {
		             case "CLP-Peso chileno" :
		            	 obtenerCambio(5.88);
		            	break;
		             case "USD-Dólar estadounidense":
		            	 obtenerCambio(0.0072);
		            	 break;
		             case "EUR-Euro" :
		            	 obtenerCambio(0.0064);
		            	 break;
		             case "GBP-Libra esterlina" :
		            	 obtenerCambio(0.0055);
		            	 break;
		             case "CAD-Dolar canadiense" :
		            	 obtenerCambio(0.0095);
		            	 break;
		             case "JPY-Yen japonés" :
		            	 obtenerCambio(0);
		            	 break;
		             case "AUD-Dolar australiano" :
		            	 obtenerCambio(0.011);
		            	 break;
		             }
		    	   break;
		       case "AUD-Dolar australiano" :
		    	   switch (elementoSeleccionadoA) {
		             case "CLP-Peso chileno" :
		            	 obtenerCambio(555.81);
		            	 break;
		             case "USD-Dólar estadounidense":
		            	 obtenerCambio(0.68);
		            	 break;
		             case "EUR-Euro" :
		            	 obtenerCambio(0.61);
		            	 break;
		             case "GBP-Libra esterlina" :
		            	 obtenerCambio(0.52);
		            	 break;
		             case "CAD-Dolar canadiense" :
		            	 obtenerCambio(0.90);
		            	 break;
		             case "JPY-Yen japonés" :
		            	 obtenerCambio(94.51);
		            	 break;
		             case "AUD-Dolar australiano" :
		            	 obtenerCambio(0);
		            	 break;
		             }
		       		default:
		           // Por cumplir con el cierre
		       		break;
		    	   
		    	}  
			    		 
//***********************************************************************************************************		
			}else { 
    					JOptionPane.showMessageDialog(null, " Por favor introducir sólo números");
    	    	}
    	} 
//----------------------------------------------------------------------------------------------						
				
		}
	});


		JLabel labelMonedasColoridas = new JLabel("");
		labelMonedasColoridas.setIcon(new ImageIcon("/home/menrry/eclipse-workspace/Challenge_Conversor_Oracle_Alura_Latam5/img/paisajesModernos.png"));
		labelMonedasColoridas.setBounds(0, 0, 978, 182);
		contentPane.add(labelMonedasColoridas);
		
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(0, 400, 1070, 183); 
		lblFondo.setIcon(new ImageIcon("/home/menrry/eclipse-workspace/Challenge_Conversor_Oracle_Alura_Latam5/img/FondoTop.png"));
		contentPane.add(lblFondo);
		
		JLabel lblMapa = new JLabel("");
		lblMapa.setIcon(new ImageIcon("/home/menrry/eclipse-workspace/Challenge_Conversor_Oracle_Alura_Latam5/img/paisajeHermoso.png"));
		lblMapa.setBounds(0, 165, 1550, 300);
		contentPane.add(lblMapa);
		//lblFondo.setVisible(false);
	}
    
	public void obtenerCambio(double estimado) {
		String valorde = String.format("%,.1f", valor); // le paso el valor a multiplicar a través de estimado
		
		if (estimado == 0) {
			JOptionPane.showMessageDialog(null, "Seleccionó el mismo importe...! \n " + elementoSeleccionadoDe + " a " + elementoSeleccionadoA + ", importe: " + valorde);
        return;     
		}
    	
    	double cambio = valor*estimado;
    	String cambioFormateado = String.format("%,.1f", cambio);	
		JOptionPane.showMessageDialog(null, valorde + " " + elementoSeleccionadoDe +  " a " + elementoSeleccionadoA + " son: \n " + cambioFormateado + " " + elementoSeleccionadoA);
		return;
    }	
	
	public void Conversion(double resultado, int aux) {
		String valorde = String.format("%,.1f", resultado);
		
		if (aux == 0) {
			JOptionPane.showMessageDialog(null, "Seleccionó la misma escala, para " + valorde +" "+ TemperaturaDe);
        return;     
		}
    
    		JOptionPane.showMessageDialog(null, "La conversión de " + valor +" "+ TemperaturaDe +  " a " + TemperaturaA + " son: \n " + valorde + " "+TemperaturaA );
		return;
    }	
}
