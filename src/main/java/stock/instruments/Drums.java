package stock.instruments;

public class Drums extends Instrument {
    private boolean cymbals;


    public Drums(String material, String colour, double purchasePrice, double sellPrice, String noise, boolean cymbals, InstrumentFamily instrumentFamily) {
        super(material, colour, purchasePrice, sellPrice, noise, instrumentFamily);
        this.cymbals = cymbals;
    }

    public boolean isCymbals() {
        return cymbals;
    }
}
