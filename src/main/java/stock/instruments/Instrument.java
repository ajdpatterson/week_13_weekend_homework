package stock.instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private double purchasePrice;
    private double sellPrice;
    private String noise;
    private InstrumentFamily instrumentFamily;

    public Instrument(String material, String colour, double purchasePrice, double sellPrice, String noise, InstrumentFamily instrumentFamily) {
        this.material = material;
        this.colour = colour;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
        this.noise = noise;
        this.instrumentFamily = instrumentFamily;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public InstrumentFamily getInstrumentFamily() {
        return instrumentFamily;
    }

    public String play(){
        return noise;
    }

    public double calculateMarkup(){
        double difference = sellPrice - purchasePrice;
        return (difference/purchasePrice) * 100;
    }
}
