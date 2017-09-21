public abstract class Element {

    public String symbol;
    public int atomicNum;
    public double atomicWeight;

    public Element(String symbol, int atomicNum, double atomicWeight) {
        super();
        this.symbol = symbol;
        this.atomicNum = atomicNum;
        this.atomicWeight = atomicWeight;
    }


    public String getSymbol() {
        return symbol;
    }


    public int getAtomicNum() {
        return atomicNum;
    }


    public double getAtomicWeight() {
        return atomicWeight;
    }


    public abstract void describeElement();

}