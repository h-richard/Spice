package observers;

import Spice.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Facade {
    private final List<View> views;
    private final HashMap<Integer, HashMap<String, Object>> contents;
    private int currentStep;

    private Facade() {
        views = new ArrayList<>();
        contents = new HashMap<>();
        currentStep = 1;
        contents.put(currentStep, new HashMap<>());
    }

    private static class Holder {
        private static final Facade INSTANCE = new Facade();
    }

    public static Facade getInstance() { return Holder.INSTANCE; }

    public void register(View v) {
        views.add(v);
    }

    public void notifyViews() {
        for (View v : views) v.update();
    }

    public void update(String id, Object val) {
        contents.get(currentStep).put(id, val);
        notifyViews();
    }
    
    public void step() {
    	currentStep++;
    	contents.put(currentStep, new HashMap<>());
    }

    public synchronized Object get(int step, String id) { return contents.get(step).get(id); }
    
    public synchronized int getCurrentStep() { return currentStep; }
}
