public class Package {
    //Data fields for weight, shipping method, and shipping cost
    int weightInOunces;
    private char shippingMethod;
    double cost;

    //Constructor requiring argument for weight and method
    //Also calls calculateCost method
    Package(int weight, char method)
    {
        weightInOunces = weight;
        shippingMethod = method;
        calculateCost();
    }

    //Method to calculate shipping cost
    private void calculateCost()
    {
        double rate = 0.00;

        if(weightInOunces <= 8)
        {
            switch(shippingMethod)
            {
                case 'A':
                    rate = 2.00;
                    break;
                case 'T':
                    rate = 1.50;
                    break;
                case 'M':
                    rate = 0.75;
                    break;
            }
        }

        else if(weightInOunces <= 16)
        {
            switch(shippingMethod)
            {
                case 'A':
                    rate = 3.00;
                    break;
                case 'T':
                    rate = 2.35;
                    break;
                case 'M':
                    rate = 1.50;
                    break;
            }
        }

        else {
            switch(shippingMethod)
            {
                case 'A':
                    rate = 4.50;
                    break;
                case 'T':
                    rate = 3.25;
                    break;
                case 'M':
                    rate = 2.25;
                    break;
            }
        }
        //Set shipping cost based on weight and shipping method
        cost = rate;
    }



    //Assign Shipping method char values
    String calculateShippingMethod()
    {
        String label = "";
        switch(shippingMethod)
        {
            case 'A':
                label = "Air";
                break;
            case 'T':
                label = "Truck";
                break;
            case 'M':
                label = "Mail";
                break;
        }
        return label;
    }

    //Display values in all 4 fields
    public void display()
    {
        System.out.println("\nOrder details: \nWeight: " + weightInOunces + "oz. \nShipping Method: " +
                calculateShippingMethod() + "\nCost: $" + cost);
    }
}
