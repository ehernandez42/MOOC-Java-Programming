public class Fitbyte {

    private int age;
    private double restingHeartRate;


    public Fitbyte(int age, double restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double maxheartRate() {
        return 206.3 - (0.711 * age);
    }

    public double targetHeartRate(double percentageOfMax) {
        return ((maxheartRate() - restingHeartRate) * percentageOfMax + restingHeartRate);
    }

}
