public class Euro implements Converterable {
    private double rate = 33.3;

    public double convert(double rate){
        return this.rate * rate;
    }
}