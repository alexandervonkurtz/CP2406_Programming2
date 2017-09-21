public class ElementArray {

    public static void main(String[] args) {
        Element[] elements=new Element[4];

        elements[0]=new MetalElement("Pt - Platinium", 78, 195.08);
        elements[1]=new MetalElement("Cr - Chromium", 24, 51.996);
        elements[2]=new NonMetalElement("O - Oxygen", 8, 15.999);
        elements[3]=new NonMetalElement("C - Carbon", 6, 12.011);

        for(int i=0;i<elements.length;i++)
        {
            elements[i].describeElement();
        }

    }

}