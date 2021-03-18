public class CZK implements  Interface_Convert
{
    private double rate = 1.26;

    public double convert(double rate)
    {
        return this.rate * rate;
    }
}