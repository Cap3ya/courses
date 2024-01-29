import java.util.ArrayList;

public class BirdWatcher {

    private ArrayList<Bird> birdWatcher;

    public BirdWatcher() {
        this.birdWatcher = new ArrayList<>();
    }

    public void add(Bird bird) {
        this.birdWatcher.add(bird);
    }

    public void obs(String obsName) {
        for (Bird bird : birdWatcher) {
            if (bird.getName().equals(obsName)) {
                bird.incObs();
            } else {
                System.out.println("ERROR: Not a bird!");
            }
        }
    }

    public void all() {
        for (Bird bird : birdWatcher) {
            System.out.println(bird.toString());
        }
    }

    public void one(String oneName) {
        for (Bird bird : birdWatcher) {
            if (bird.getName().equals(oneName)) {
                System.out.println(bird.toString());
            }
        }
    }

    public boolean hasBird(String hasName) {
        for (Bird bird : birdWatcher) {
            if (bird.getName().equals(hasName)) {
                return true; 
            }
        }
        return false;
    }
}
