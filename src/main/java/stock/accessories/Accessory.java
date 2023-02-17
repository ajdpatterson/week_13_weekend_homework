package stock.accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {
    private String material;
    private double purchasePrice;
    private double sellPrice;

    public Accessory(String material, double purchasePrice, double sellPrice) {
        this.material = material;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup(){
        double difference = sellPrice - purchasePrice;
        return (difference/purchasePrice) * 100;
    }
}
