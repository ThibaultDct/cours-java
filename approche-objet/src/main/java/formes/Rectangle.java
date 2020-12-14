package formes;

public class Rectangle extends Forme{

    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double calculerSurface(){
        return this.longueur * this.largeur;
    }

    public double calculerPerimetre(){
        return (2 * this.largeur) + (2 * this.longueur);
    }

}
