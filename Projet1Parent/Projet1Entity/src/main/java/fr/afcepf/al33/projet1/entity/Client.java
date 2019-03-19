package fr.afcepf.al33.projet1.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="client")
public class Client implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="dateDeNaissance")
	private Date dateDeNaissance;
	
	@Column(name="adresse")
	private String adresse;
	
	@Column(name="complementAdresse")
	private String complementAdresse;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private Ville ville;
	
	@Column(name="numeroFixe")
	private String numeroFixe;
	
	@Column(name="numeroPort")
	private String numeroPort;
	
	@Column(name="email")
	private String email;
	
	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;
	
	@Column(name="salt")
	private String salt;

	public Client() {
		super();
	}

	public Client(Integer id, String nom, String prenom, Date dateDeNaissance, String adresse, String complementAdresse,
			Ville ville, String numeroFixe, String numeroPort, String email, String login, String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.complementAdresse = complementAdresse;
		this.ville = ville;
		this.numeroFixe = numeroFixe;
		this.numeroPort = numeroPort;
		this.email = email;
		this.login = login;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getComplementAdresse() {
		return complementAdresse;
	}

	public void setComplementAdresse(String complementAdresse) {
		this.complementAdresse = complementAdresse;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public String getNumeroFixe() {
		return numeroFixe;
	}

	public void setNumeroFixe(String numeroFixe) {
		this.numeroFixe = numeroFixe;
	}

	public String getNumeroPort() {
		return numeroPort;
	}

	public void setNumeroPort(String numeroPort) {
		this.numeroPort = numeroPort;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
	
}