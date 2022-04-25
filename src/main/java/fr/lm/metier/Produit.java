package fr.lm.metier;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="produit")
public class Produit {
	@Id
	private String ref;
	private String nom;
	private String description;
	private float poids;
	private float prix_unitaire;
	private Integer quantite_stocke;
	@ManyToOne
	private Categorie categorie;
	
	public Produit() {
		super();
	}

	public Produit(String ref, String nom, String description, float poids, float prix_unitaire, int quantite_stocke,
			Categorie categorie) {
		super();
		this.ref = ref;
		this.nom = nom;
		this.description = description;
		this.poids = poids;
		this.prix_unitaire = prix_unitaire;
		this.quantite_stocke = quantite_stocke;
		this.categorie = categorie;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public float getPrix_unitaire() {
		return prix_unitaire;
	}

	public void setPrix_unitaire(float prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}

	public int getQuantite_stocke() {
		return quantite_stocke;
	}

	public void setQuantite_stocke(int quantite_stocke) {
		this.quantite_stocke = quantite_stocke;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Produit [ref=" + ref + ", nom=" + nom + ", description=" + description + ", poids=" + poids
				+ ", prix_unitaire=" + prix_unitaire + ", quantite_stocke=" + quantite_stocke + ", categorie="
				+ categorie + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(categorie, description, nom, poids, prix_unitaire, quantite_stocke, ref);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		return Objects.equals(categorie, other.categorie) && Objects.equals(description, other.description)
				&& Objects.equals(nom, other.nom) && Float.floatToIntBits(poids) == Float.floatToIntBits(other.poids)
				&& Float.floatToIntBits(prix_unitaire) == Float.floatToIntBits(other.prix_unitaire)
				&& Objects.equals(quantite_stocke, other.quantite_stocke) && Objects.equals(ref, other.ref);
	}
	
	
	
}
