package co.edu.konradlorenz.model;

public class estudiante {
	private String estudiante;
	private String nombreEstudiante;
	private String programa;
	private int codigoEstudiante;
	
	public estudiante() {
		
	}

	public estudiante(String nombreEstudiante, String programa, int codigoEstudiante) {
		super();
		this.nombreEstudiante = nombreEstudiante;
		this.programa = programa;
		this.codigoEstudiante = codigoEstudiante;
	}
	
	public String getNombreEstudiante() {
		return nombreEstudiante;
	}
	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public int getCodigoEstudiante() {
		return codigoEstudiante;
	}
	public void setCodigoEstudiante(int codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	public void nuevoEstudiante (String nombreEstudiante,String programa,int codigoEstudiante) {
		estudiante Estudient = new estudiante ( nombreEstudiante, programa, codigoEstudiante); 
		
	}
	public void read() {
		
	}
	
	public void borrarEstudiante(String nombreEstudiante,String programa,int codigoEstudiante) {
		estudiante Estudient = new estudiante( "", "", 0); 
	
	}
	
	public String getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
		
	}
	@Override
	public String toString() {
		return "estudiante nombreEstudiante=" + nombreEstudiante + ", programa=" + programa + ", codigoEstudiante="
				+ codigoEstudiante ;
	}
}
