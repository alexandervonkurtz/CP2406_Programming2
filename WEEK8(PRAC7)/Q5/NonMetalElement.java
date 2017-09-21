public class NonMetalElement extends Element{

    public NonMetalElement(String symbol, int atomicNum, double atomicWeight) {
        super(symbol, atomicNum, atomicWeight);

    }

    public void describeElement()
    {
        System.out.println("Symbol : "+ super.getSymbol()+"\nAtomicNumber : " + super.getAtomicNum() + "\nAtomicWeight : "+ super.getAtomicWeight());
        System.out.println("Non-Metals are bad conductors of electricity\n");
    }
}