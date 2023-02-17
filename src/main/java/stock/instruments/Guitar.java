package stock.instruments;

public class Guitar extends Instrument{

    private int strings;
    public Guitar(String material, String colour, double purchasePrice, double sellPrice, String noise, int strings, InstrumentFamily instrumentFamily) {
        super(material, colour, purchasePrice, sellPrice, noise, instrumentFamily);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }
}
