package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.LineasDAO;
import modelo.LineasDTO;

/**
 * Servlet implementation class Servletgestionlineas
 */
@WebServlet("/Servletgestionlineas")
public class Servletgestionlineas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletgestionlineas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean x;
		String nombrelinea;
		int codigo;
		LineasDTO lindto;
		LineasDAO lindao;
		LineasDTO registro;
		
		// ingresar usuario
		if(request.getParameter("btnins")!=null) {
			
			codigo=Integer.parseInt(request.getParameter("codigolinea"));
			nombrelinea=request.getParameter("nombrelinea");
			lindto=new LineasDTO(codigo, nombrelinea);
			lindao=new LineasDAO();
			x=lindao.insertarlinea(lindto);
			if(x==true) {
				JOptionPane.showInternalMessageDialog(null, " linea metodo de registro");
				response.sendRedirect("index.jsp");
			}else {
				JOptionPane.showInternalMessageDialog(null, " aqui ta el error");
			}
			
			
		}
		// consultar usuario
		
		if(request.getParameter("btncon")!= null) {
			int cod;
			String nom;
			
			codigo=Integer.parseInt(request.getParameter("codigolinea"));
			JOptionPane.showInternalMessageDialog(null, codigo);
			lindto= new LineasDTO(codigo);
			lindao=new LineasDAO();
			registro=lindao.consultar(lindto);
			cod=registro.getCodigolinea();
			nom=registro.getNombrelinea();
			response.sendRedirect("index.jsp?co="+cod+"&&no="+nom);

			
		}
		
		
	}

}
