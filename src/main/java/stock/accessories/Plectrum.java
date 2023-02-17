package stock.accessories;

public class Plectrum extends Accessory{
    private String colour;

    public Plectrum(String material, double purchasePrice, double sellPrice, String colour) {
        super(material, purchasePrice, sellPrice);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
