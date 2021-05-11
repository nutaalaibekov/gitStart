package kg.itacademy;

public class InternetMarkeApi {
    public InternaetMarket getCheepest(InternaetMarket[] internaetMarkets, Product product) {
        double minPrice = 0;
        InternaetMarket cheepestMarket = null;
        for(InternaetMarket internaetMarket : internaetMarkets) {
            double currentShipPrice = internaetMarket.countShipPrice(product);
            if (minPrice == 0) {
                minPrice = currentShipPrice;
                cheepestMarket = internaetMarket;
            }

            if (minPrice > currentShipPrice) {
                minPrice = currentShipPrice;
                cheepestMarket = internaetMarket;
            }
        }
        return cheepestMarket;
    }

    public InternaetMarket getFastest(InternaetMarket[] internaetMarkets, Product product) {
        double minSpeed = 0;
        InternaetMarket fastestMarket = null;
        for(InternaetMarket internaetMarket : internaetMarkets) {
            double currentSpeed = internaetMarket.getShipSpee();
            if (minSpeed == 0) {
                minSpeed = currentSpeed;
                fastestMarket = internaetMarket;
            }

            if (minSpeed > currentSpeed) {
                minSpeed = currentSpeed;
                fastestMarket = internaetMarket;
            }
        }
        return fastestMarket;
    }

    public InternaetMarket getMostReliable(InternaetMarket[] internaetMarkets, Product product) {
        double minRisk = 0;
        InternaetMarket fastestMarket = null;
        for(InternaetMarket internaetMarket : internaetMarkets) {
            double currentRisk = internaetMarket.getLooseRisk(product);
            if (minRisk == 0) {
                minRisk = currentRisk;
                fastestMarket = internaetMarket;
            }

            if (minRisk > currentRisk) {
                minRisk = currentRisk;
                fastestMarket = internaetMarket;
            }
        }
        if (minRisk == 0) {
            return null;
        }
        return fastestMarket;
    }

    public InternaetMarket getBest(InternaetMarket[] internaetMarkets, Product product) {
        for(InternaetMarket item : internaetMarkets) {
            item.setStars(0);
        }
        InternaetMarket cheepest = getCheepest(internaetMarkets, product);
        cheepest.setStars(cheepest.getStars() + 1);
        InternaetMarket fastest = getFastest(internaetMarkets, product);
        fastest.setStars(cheepest.getStars() + 1);
        InternaetMarket mostReliable = getMostReliable(internaetMarkets, product);
        if (mostReliable != null)
            mostReliable.setStars(cheepest.getStars() + 1);

        double maxStar = 0;
        InternaetMarket theBest = null;
        for(InternaetMarket internaetMarket : internaetMarkets) {
            if(maxStar == 0) {
                maxStar = internaetMarket.getStars();
                theBest = internaetMarket;
            }
            if(maxStar < internaetMarket.getStars()) {
                maxStar = internaetMarket.getStars();
                theBest = internaetMarket;
            }
        }

        System.out.println(theBest.getName() + " лучше подойдет для " + product.getName());

        return theBest;
    }



}
