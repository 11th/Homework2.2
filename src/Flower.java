public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerColor, String country, double cost) {
        this(flowerColor, country, cost,0);
    }

    public Flower(String flowerColor, String country, double cost, int lifeSpan){
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);

        if (lifeSpan > 0){
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1.0;
        }
    }

    @Override
    public String toString() {
        return String.format(
            "Цветок %s, Страна %s, Стоимость %.2f, Срок хранения %d",
            flowerColor, country, cost, lifeSpan
        );
    }
}
