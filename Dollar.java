public class Dollar implements Converterable {
    private double rate = 28.1;

    public double convert(double rate){
        return this.rate * rate;
    }
}
