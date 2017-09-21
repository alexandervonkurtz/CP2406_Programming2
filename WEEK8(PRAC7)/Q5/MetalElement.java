public class MetalElement extends Element{

    public MetalElement(String symbol, int atomicNum, double atomicWeight) {
        super(symbol, atomicNum, atomicWeight);

    }

    public void describeElement()
    {
        System.out.println("Symbol : "+ super.getSymbol()+"\nAtomicNumber : "+ super.getAtomicNum()+ "\nAtomicWeight : " +super.getAtomicWeight());
        System.out.println("Metals are good conductors of electricity\n");
    }
}