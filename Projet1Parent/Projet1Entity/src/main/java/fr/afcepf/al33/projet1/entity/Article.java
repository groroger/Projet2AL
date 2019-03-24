package fr.afcepf.al33.projet1.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="article")
public class Article implements Serializable{

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
	
	@Column(name="descriptif", length=1000)
	private String descriptif;
	
	@Column(name="image")
	private String image;
	
	@Column(name="quantiteVendue")
	private double quantiteVendue;
	
	@Column(name="prix")
	private double prix;
	
	@Column(name="prixKilo")
	private double prixKilo;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private Categorie categorie;

	@OneToOne
	@JoinColumn(referencedColumnName="id")
	private Stock stock;
	
	      
	@OneToMany(mappedBy="article", cascade=CascadeType.ALL)
	private List<Approvisionnement> approvisionnements;
	

	
	public Article() {
		super();
	}



	public Article(Integer id, String nom, String descriptif, String image, double quantiteVendue, double prix,
			double prixKilo, Categorie categorie, Stock stock, List<Approvisionnement> approvisionnements) {
		super();
		this.id = id;
		this.nom = nom;
		this.descriptif = descriptif;
		this.image = image;
		this.quantiteVendue = quantiteVendue;
		this.prix = prix;
		this.prixKilo = prixKilo;
		this.categorie = categorie;
		this.stock = stock;
		this.approvisionnements = approvisionnements;
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



	public String getDescriptif() {
		return descriptif;
	}



	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public double getQuantiteVendue() {
		return quantiteVendue;
	}



	public void setQuantiteVendue(double quantiteVendue) {
		this.quantiteVendue = quantiteVendue;
	}



	public double getPrix() {
		return prix;
	}



	public void setPrix(double prix) {
		this.prix = prix;
	}



	public double getPrixKilo() {
		return prixKilo;
	}



	public void setPrixKilo(double prixKilo) {
		this.prixKilo = prixKilo;
	}



	public Categorie getCategorie() {
		return categorie;
	}



	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}



	public Stock getStock() {
		return stock;
	}



	public void setStock(Stock stock) {
		this.stock = stock;
	}




	public List<Approvisionnement> getApprovisionnements() {
		return approvisionnements;
	}



	public void setApprovisionnements(List<Approvisionnement> approvisionnements) {
		this.approvisionnements = approvisionnements;
	}

}