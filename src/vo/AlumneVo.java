package vo;

public class AlumneVo {
	
private String nomUser;
	
	private String password;
	
	private String nom;
	
	private String cognoms;
	
	private int edat;
	
	private int id;

	public AlumneVo(){
		
		
	}
	
	public AlumneVo(String user, String password, String nom, String cognoms, int edat){
		
		this.nomUser=user;
		this.password=password;
		this.nom=nom;
		this.cognoms=cognoms;
		this.edat=edat;
		
		
	}
	/**
	 * @return the nomUser
	 */
	public String getNomUser() {
		return nomUser;
	}

	/**
	 * @param nomUser the nomUser to set
	 */
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the cognoms
	 */
	public String getCognoms() {
		return cognoms;
	}

	/**
	 * @param cognoms the cognoms to set
	 */
	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}

	/**
	 * @return the edat
	 */
	public int getEdat() {
		return edat;
	}

	/**
	 * @param edat the edat to set
	 */
	public void setEdat(int edat) {
		this.edat = edat;
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
