package entites;

public class AdressePostale {

    Integer numero;
    String libelle;
    String codePostal;
    String ville;

    public AdressePostale(Integer numero, String libelle, String codePostal, String ville){
        this.numero = numero;
        this.libelle = libelle;
        this.codePostal = codePostal;
        this.ville = ville;
    }

}
