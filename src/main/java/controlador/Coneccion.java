package controlador;

import java.sql.*;

import javax.swing.JOptionPane;

public class Coneccion {

Connection cnn;

public Connection  conexionbd() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			cnn=DriverManager.getConnection("jdbc:mysql://localhost/mercado","root","");
			JOptionPane.showMessageDialog(null,"coneccion exitosa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"coneccion NO exitosa");
		}
	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return cnn;
}

}
