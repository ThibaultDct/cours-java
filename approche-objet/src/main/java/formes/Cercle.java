package formes;

public class Cercle extends Forme {

    private double rayon;

    public Cercle(double rayon){
        this.rayon = rayon;
    }

    public double calculerSurface(){
        return Math.PI * Math.pow(this.rayon, 2);
    }

    public double calculerPerimetre(){
        return 2 * Math.PI * this.rayon;
    }

}
