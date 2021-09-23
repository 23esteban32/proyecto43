package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.cj.xdevapi.Result;

import controlador.Coneccion;

public class LineasDAO {

	Coneccion con=new Coneccion();
	Connection cnn=con.conexionbd();
	PreparedStatement ps;
	ResultSet rs;
	LineasDTO lineadto=null;
	
	public boolean insertarlinea(LineasDTO lin) {
		int r;
		boolean  dat=false;
		
		try {
			ps=cnn.prepareStatement("INSERT INTO lineas Values(?,?)");
			ps.setInt(1, lin.getCodigolinea());
			ps.setString(2, lin.getNombrelinea());
			r=ps.executeUpdate();
			if(r>0) {
				dat=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dat;
	}
	
	public  LineasDTO consultar(LineasDTO cod) {
	
		try {
			ps=cnn.prepareStatement("SELECT * FROM lineas WHERE codigolinea=?");
			ps.setInt(1, cod.getCodigolinea());
			rs=ps.executeQuery();
			if(rs.next()) {
				lineadto=new LineasDTO(rs.getInt(1),rs.getString(2));
			}else {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lineadto;
	}
	
	
}
