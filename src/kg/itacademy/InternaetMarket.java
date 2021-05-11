package kg.itacademy;

public class InternaetMarket {
    private double shipPrice;
    private double shipSpeed;
    private double tax;
    private String name;
    private double shipRisk;
    private double stars;

    public InternaetMarket(double shipPrice, double shipSpee, double tax, double shipRisk, String name) {
        this.shipPrice = shipPrice;
        this.shipSpeed = shipSpee;
        this.tax = tax;
        this.name = name;
        this.shipRisk = shipRisk;
        this.stars = 0;
    }

    public double getShipPrice() {
        return shipPrice;
    }

    public void setShipPrice(double shipPrice) {
        this.shipPrice = shipPrice;
    }

    public double getShipSpee() {
        return shipSpeed;
    }

    public void setShipSpee(double shipSpee) {
        this.shipSpeed = shipSpee;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getShipSpeed() {
        return shipSpeed;
    }

    public void setShipSpeed(double shipSpeed) {
        this.shipSpeed = shipSpeed;
    }

    public double getShipRisk() {
        return shipRisk;
    }

    public void setShipRisk(double shipRisk) {
        this.shipRisk = shipRisk;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public double countShipPrice(Product product) {
        double shipSum = product.getWeight() * shipSpeed;
        shipSum += product.getPrice() * tax;
        return  shipSum;
    }

    public double getLooseRisk(Product product) {
        if (product.getWeight() > 10000) {
            return shipRisk;
        }
        return 0;
    }
}
