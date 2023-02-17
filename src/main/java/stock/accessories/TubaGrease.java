package stock.accessories;

public class TubaGrease extends Accessory{
    private String viscosity;

    public TubaGrease(String material, double purchasePrice, double sellPrice, String viscosity) {
        super(material, purchasePrice, sellPrice);
        this.viscosity = viscosity;
    }

    public String getViscosity() {
        return viscosity;
    }
}
