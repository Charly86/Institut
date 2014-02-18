package vo;

public class AssignaturaVo {

	
	private String nom;
	
	private int credits;
	
	private int id;
	
	public AssignaturaVo(){
		
	}
	
	public AssignaturaVo(String nom, int credits){
		
		this.nom=nom;
		this.credits=credits;
		
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		
		this.nom = nom;
	}

	/**
	 * @return the credits
	 */
	public int getCredits() {
		
		return credits;
	}

	/**
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		
		this.credits = credits;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
}
