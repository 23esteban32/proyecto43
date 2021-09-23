package modelo;

public class LineasDTO {
	private int codigolinea;
	private String nombrelinea;
	
	
	public LineasDTO(int codigolinea, String nombrelinea) {

		this.codigolinea = codigolinea;
		this.nombrelinea = nombrelinea;
	}
	
	public LineasDTO(int codigolinea) {
		this.codigolinea = codigolinea;
	}
	



	public int getCodigolinea() {
		return codigolinea;
	}
	
	public void setCodigolinea(int codigolinea) {
		this.codigolinea = codigolinea;
	}
	
	public String getNombrelinea() {
		return nombrelinea;
	}
	
	public void setNombrelinea(String nombrelinea) {
		this.nombrelinea = nombrelinea;
	}
	
	
	
}
