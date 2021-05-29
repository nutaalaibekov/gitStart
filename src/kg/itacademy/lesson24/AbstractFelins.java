package kg.itacademy.lesson24;

public abstract class AbstractFelins extends AbstractAnimal {
    private int nailsAmount;
    private double trailLength;
    private double mustacheLength;

    public AbstractFelins(int nailsAmount, double trailLength , double mustacheLength, String color, double weight, int age) {
        super(color, weight, age);
        this.nailsAmount = nailsAmount;
        this.trailLength = trailLength;
        this.mustacheLength = mustacheLength;
    }

    public final void murr(){
        System.out.println("Murrr");
    }

    public final void tochitKogti(){
        System.out.println("tochitKogti");
    }

    public final void landOnLeaps(){
        System.out.println("landOnLeaps");
    }

    public void meetOwner() {
        murr();
        tochitKogti();
        landOnLeaps();
    }


    public int getNailsAmount() {
        return nailsAmount;
    }

    public void setNailsAmount(int nailsAmount) {
        this.nailsAmount = nailsAmount;
    }

    public double getTrailLength() {
        return trailLength;
    }

    public void setTrailLength(double trailLength) {
        this.trailLength = trailLength;
    }

    public double getMustacheLength() {
        return mustacheLength;
    }

    public void setMustacheLength(double mustacheLength) {
        this.mustacheLength = mustacheLength;
    }
}
