public class Formateur{
private String nom;
private String prenom;
private String adress;

public Formateur(){
super();
}

public Formateur(){

}
public Formateur(String nom,String prenom){
this.nom=nom
this.prenom=prenom
}

public String getNom(){
return this.nom

}
public String getPrenom(){
return this.prenom
}
public String getAdress(){
return this.Adress
}

public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
}