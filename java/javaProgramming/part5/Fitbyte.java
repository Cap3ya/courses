public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte(int initialAge, int initialRestingHeartRate) {
        this.age = initialAge;
        this.restingHeartRate = initialRestingHeartRate;
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return (this.maximumHeartRate() - this.restingHeartRate) * percentageOfMaximum
                + this.restingHeartRate;
    }

    public static void main(String[] args) {
        Fitbyte assistant = new Fitbyte(30, 60);

        double percentage = 0.5;

        while (percentage < 1.0) {
            double target = assistant.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage = percentage + 0.1;
        }

    }
}