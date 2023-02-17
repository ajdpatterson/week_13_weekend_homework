package stock.accessories;

public class Drumsticks extends Accessory{
    private int numSticks;

    public Drumsticks(String material, double purchasePrice, double sellPrice, int numSticks) {
        super(material, purchasePrice, sellPrice);
        this.numSticks = numSticks;
    }

    public int getNumSticks() {
        return numSticks;
    }
}
