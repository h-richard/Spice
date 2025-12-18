package ext;

public class ExtUtils {
	private static final double g = 9.81;

    // Calculates the energy consumption in joules for a given power and duration
    public static double energyConsumption(double power, double duration) {
        return power * duration;
    }

    public static double calculatePower(double engineEfficiency, double mass, double speed) {
        return engineEfficiency * mass * speed * g;
    }

    public static double round(double val, int decimals) {
        return Math.round(val * (decimals * 10.0)) / (decimals * 10.0);
    }

    public static double distance(Double[] a, Double[] b) {
        if (a.length != b.length) return -1;
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            double d = a[i] - b[i];
            sum += d * d;
        }
        return Math.sqrt(sum);
    }
}
