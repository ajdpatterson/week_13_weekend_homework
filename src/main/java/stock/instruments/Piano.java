package stock.instruments;

public class Piano extends Instrument {
    private boolean stool;

    public Piano(String material, String colour, double purchasePrice, double sellPrice, String noise, boolean stool, InstrumentFamily instrumentFamily) {
        super(material, colour, purchasePrice, sellPrice, noise, instrumentFamily);
        this.stool = stool;
    }

    public boolean isStool() {
        return stool;
    }
}
