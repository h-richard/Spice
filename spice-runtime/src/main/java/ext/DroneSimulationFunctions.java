package ext;

import ext.exceptions.DronesCollided;
import ext.exceptions.OtherDroneIsClose;

import java.util.Random;

public class DroneSimulationFunctions {

    public void handleException(Exception e) {
        System.out.println(e.toString());
    }

    public Double[] updateWind(Double[] direction) {
        Random rd = new Random();
        return new Double[] {
                ExtUtils.round(rd.nextDouble(), 2),
                0.0,
                ExtUtils.round(rd.nextDouble(), 2)
        };
    }

    /**
     * Calculates the drone's next position based on the direction and a given duration.
     *
     * @param position      its current position
     * @param direction     the direction it's going
     * @param duration      in milliseconds
     * @return the next location the drone is going to be
     */
    public Double[] calcNextPos(Double[] position, Double[] direction, Long duration) {
        Double time = duration / 1000.0;
        return new Double[]{
                ExtUtils.round(position[0] + direction[0] * time, 2),
                ExtUtils.round(position[1] + direction[1] * time, 2),
                ExtUtils.round(position[2] + direction[2] * time, 2)
        };
    }

    /**
     * Checks the position of two drones for possible collision.
     *
     * @param p1    the position of the first drone
     * @param p2    the position of the second drone
     * @throws OtherDroneIsClose    if the distance between them is <= 2.0
     * @throws DronesCollided       if the distance between them is < 1.0
     */
    public void checkForCollision(Double[] p1, Double[] p2) throws OtherDroneIsClose, DronesCollided {
        if (p1.length != p2.length) return;
        double sum = 0.0;
        for (int i = 0; i < p1.length; i++) {
            double d = p1[i] - p2[i];
            sum += d * d;
        }
        double distance = Math.sqrt(sum);
        if (distance < 1.0) throw new DronesCollided();
        if (distance <= 2.0) throw new OtherDroneIsClose();
    }

    /**
     * Calculates the next battery level after a given duration.
     *
     * @param level      of battery in MJ
     * @param speed      in m/s
     * @param mass       in kg
     * @param efficiency the engine efficiency (between 0 and 1)
     * @param duration   in second
     * @return the next battery level in MJ
     */
    public double calcNextBatLevel(double level, double speed,
                                   double mass, double efficiency,
                                   long duration) {
        double power = ExtUtils.calculatePower(efficiency, mass, speed);
        double consumedEnergy =
                ExtUtils.energyConsumption(power, (duration / 1000.0))
                        / 1_000_000; // converted in MJ
        return Math.max(level - consumedEnergy, 0);
    }

    /**
     * Converts a given level to a percentage.
     *
     * @param level    of battery in MJ
     * @param capacity of battery in MJ
     * @return the percentage of battery between 0 and 100
     */
    public double toPercent(double level, double capacity) {
        return level / capacity * 100;
    }


}

