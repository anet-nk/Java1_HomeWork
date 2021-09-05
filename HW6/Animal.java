package Lesson06;

public class Animal {
    private String type;
    protected String name;
    private int maxSwim;
    private int maxRun;
    public static int createdAnimals = 0;

    public Animal(String type, String name, int maxRun, int maxSwim) {
        this.type = type;
        this.name = name;
        this.maxSwim = maxSwim;
        this.maxRun = maxRun;
        ++createdAnimals;
    }

    String getName() {return name;}
    String getType() {return type;}
    int getMaxSwim() {return maxSwim;}
    int getMaxRun() {return maxRun;}

    String fullAnimalInfo() {
        return this.type + " " + this.name + " can run Max distance - " + this.maxRun +
                " meters and swim max distance - " + this.maxSwim + " meters. ";
    }

    public String runDistance(int runDistanceValue) {
        if (maxRun >= runDistanceValue) {
            return name + " run " + runDistanceValue + " meters. ";
        } else {
            return name + " was able to run only " + maxRun + " meters. ";
        }
    }
    public String swimDistance(int swimDistanceValue) {
        if (maxSwim == 0) {
            return name + " cannot swim " + swimDistanceValue + " meters (" + type + " cannot swim). ";
        } else if (maxSwim >= swimDistanceValue) {
            return name + " swim " + swimDistanceValue + " meters. ";
        } else {
            return name + " was able to swim only " + maxSwim + " meters. ";
        }
    }
}
