public class InsuredPackage extends Package {
    private double insuranceCost;

    InsuredPackage(int weightInOunces, char shippingMethod)
    {
        super(weightInOunces, shippingMethod);
        calculateInsuranceCost();
    }

    private void calculateInsuranceCost()
    {
        if(cost > 3.00F)
        {
            insuranceCost = 5.55;
        }

        else if(cost > 1.00)
        {
            insuranceCost = 3.95;
        }

        else
        {
            insuranceCost = 2.65;
        }
    }

    public void display()
    {
        System.out.println("\nOrder details: \nWeight: " + weightInOunces + "oz. \nShipping Method: " +
                calculateShippingMethod() + "\nCost: $" + cost + "\nInsurance Cost: " + insuranceCost);
    }
}
