package cibertec004;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Empresatransporte extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JComboBox comboBoxRuta;
	private JComboBox comboBoxCalidad;
	private JTextField txtCantidad;
	private JTextArea txtArea;
	private JButton btnProcesar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empresatransporte frame = new Empresatransporte();
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
	public Empresatransporte() {
		setTitle("Empresa Transportes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Ruta");
		lblNewLabel.setBounds(53, 55, 73, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Calidad");
		lblNewLabel_1.setBounds(55, 102, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Cantidad Boletos");
		lblNewLabel_2.setBounds(49, 161, 108, 14);
		contentPane.add(lblNewLabel_2);
		
		comboBoxRuta = new JComboBox();
		comboBoxRuta.setModel(new DefaultComboBoxModel(new String[] {"Lima - Huanuco", "Lima - Huancayo"}));
		comboBoxRuta.setBounds(183, 51, 132, 22);
		contentPane.add(comboBoxRuta);
		
		comboBoxCalidad = new JComboBox();
		comboBoxCalidad.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C"}));
		comboBoxCalidad.setBounds(183, 98, 132, 22);
		contentPane.add(comboBoxCalidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(199, 158, 86, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtArea = new JTextArea();
		txtArea.setBounds(49, 204, 399, 124);
		contentPane.add(txtArea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(382, 68, 89, 23);
		contentPane.add(btnProcesar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		//inicio
		//Variables entrada
		int cantidad;
		int calidad; 
		int destino; // Huanuco:0, Huancayo:1// Huanuco:"Huanuco", Huancayo: "Huancayo"			
		//Variables salida
		double  importeCompra;
		double importeDescuento;
		double importePagar;
		//Lectura Datos
		//Lectura cantidad,calidad;//combo (indice:0,1,2) A, B , C
		cantidad=Integer.parseInt(txtCantidad.getText());
		calidad=comboBoxCalidad.getSelectedIndex();
		destino=comboBoxRuta.getSelectedIndex();
		// calculos
		//Calcular importe compra
		switch (calidad){
			case 0://A
				if(destino==0) // si(destino=="Huanuco")
					importeCompra=cantidad*45;
				else //Huancayo
					importeCompra=cantidad*38;
				break;
			case 1://B
				if(destino==0) // si(destino=="Huanuco")
					importeCompra=cantidad*35;
				else //Huancayo
					importeCompra=cantidad*33;
				break;
			default://C
				if(destino==0) // si(destino=="Huanuco")
					importeCompra=cantidad*30;
				else //Huancayo
					importeCompra=cantidad*28;
				break;
			}
		// calcular descuento
			if(calidad==0 && cantidad>4)	//Calidad A:0
				importeDescuento=0.05*importeCompra;
			else 
				importeDescuento=0;
		// calcular importe pagar
			importePagar=importeCompra - importeDescuento;			
		//Imprimir importePagar,importeCompra,importeDescuento;
			txtArea.setText("Importe compra " + importeCompra + "\n");
			txtArea.append("Importe dsto " + importeDescuento + "\n");
			txtArea.append("Importe pagar " + importePagar + "\n");
			
		//Fin
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
