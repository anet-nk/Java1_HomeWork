package Lesson1;

public class Person {
    private String namePerson;
    private int agePerson;
    private int maxAmountObstacles;
    private int maxSwimDistance;
    private int maxRunDistance;

    public Person(String namePerson,int agePerson, int maxAmountObstacles, int maxSwimDistance, int maxRunDistance) {
        this.namePerson = namePerson;
        this.agePerson = agePerson;
        this.maxAmountObstacles = maxAmountObstacles;
        this.maxSwimDistance = maxSwimDistance;
        this.maxRunDistance = maxRunDistance;
    }

    public String fullPersonInfo() {
        return "Name is " + namePerson +
                ", age - " + agePerson +
                ", can overcome obstacles - " + maxAmountObstacles +
                ", can swim - " + maxSwimDistance + "m, " +
                "can run - " + maxRunDistance + "km";
    }
    int getMaxAmountObstacles() {
        return maxAmountObstacles;
    }

    int getMaxSwimDistance() {
        return maxSwimDistance;
    }

    int getMaxRunDistance() {
        return maxRunDistance;
    }
    String getNamePerson() {
        return namePerson;
    }
}
