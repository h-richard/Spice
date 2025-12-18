import ext.DroneSimulationFunctions;
import Spice.*;
import Spice.util.SpiceUtils;

public class Controller {

    static final String PATH = "src/main/resources/models/";
    static final String MODELSPICE = "sim.spice";

    public static void main(String[] args) {
        DroneSimulationFunctions calcs = new DroneSimulationFunctions();
        SpiceUtils.getExtMap().put("calcs", calcs);

        Simulation sim = SpiceUtils.loadSimulationFromSpiceModel(PATH + MODELSPICE);

        sim.init();
        sim.run();
    }
}

