public class CoffeeMug
{

    private double radius;
    private double height;
    private double volume;
    private double weight;



    public CoffeeMug()
    {
        radius= 0.0;
        height = 0.0;
    }

    public CoffeeMug(double inputRadius, double inputHeight)
    {
        radius= inputRadius;
        height = inputHeight;
    }


    public void setRadius(double radius)
    {
        this.radius = radius;
    } // setter of radius

    public double getRadius() //getter for radius
    {
        return radius;

    }


    public void setHeight(double height) // setter for height
    {
        this.height = height;
    }

    public double getHeight() // getter for height
    {
        return height;
    }



    public double getVolume() // getter of calculating the volumr
    {
        //V = πr^2h

        double volume;

        volume= ( Math.PI  * Math.pow( radius , 2) * height );

        return volume;
    }



    public double getWeight() // getter of calculating the weight
    {
        double weight;

        weight = getVolume() / 27.68;

        return weight;
    }





}
