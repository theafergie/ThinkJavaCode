public class Product
{
    private String name;
    private int quantityInStock;

    public Product()
    {
        name = "Honeysuckle-Strawberry Jelly";
    }

    public String getName()
    {
        return name;
    }

    public int getQuantityInStock()
    {
        return quantityInStock;
    }

    public void stock()
    {
        int stock = 0;
        stock = quantityInStock++;
    }

    public void sell()
    {
        int sell = 0;
        sell = quantityInStock --;
    }

    public void recordLoss()
    {
        int loss = 0;
        loss = quantityInStock --;
    }

    public String toString()
    {
        return getName() + ", Quantity in Stock " + getQuantityInStock();
    }

}
