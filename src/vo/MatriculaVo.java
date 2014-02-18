package vo;

public class MatriculaVo {

	private AlumneVo alumne;
	
	private AssignaturaVo assignatura;
	
	private int nota;

	public MatriculaVo(){
		
		
	}
	
	public MatriculaVo(AlumneVo alum,AssignaturaVo assign, int nota){
		
		this.alumne=alum;
		
		this.assignatura=assign;
		
		this.nota=nota;
	}
	/**
	 * @return the alumne
	 */
	public AlumneVo getAlumne() {
		
		return alumne;
	}

	/**
	 * @param alumne the alumne to set
	 */
	public void setAlumne(AlumneVo alumne) {
		
		this.alumne = alumne;
	}

	/**
	 * @return the assignatura
	 */
	public AssignaturaVo getAssignatura() {
		
		return assignatura;
	}

	/**
	 * @param assignatura the assignatura to set
	 */
	public void setAssignatura(AssignaturaVo assignatura) {
		
		this.assignatura = assignatura;
	}

	/**
	 * @return the nota
	 */
	public int getNota() {
		
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(int nota) {
		
		this.nota = nota;
	}
}
