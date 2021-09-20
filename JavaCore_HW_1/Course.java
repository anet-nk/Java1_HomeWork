package Lesson1;

public class Course {
    private int amountObstacles;
    private int swimDistance;
    private int runDistance;
    private int[] course;

    public Course(int amountObstacles, int swimDistance, int runDistance) {
        course = new int[]{amountObstacles, swimDistance, runDistance};
    }
    int getAmountObstacles() {
        return amountObstacles;
    }

    int getSwimDistance() {
        return swimDistance;
    }

    int getRunDistance() {
        return runDistance;
    }
    int[] getCourse() {
        return course;
    }

    public void doCourse(Person[] team, int[] course) {
        for (int i = 0; i <= team.length - 1; i++) {
            if (team[i].getMaxAmountObstacles() >= course[0] &&
                    team[i].getMaxSwimDistance() >= course[1] &&
                    team[i].getMaxRunDistance() >= course[2])
            System.out.println(team[i].getNamePerson() + " win");
            }

    }

    public String  fullCourseInfo(int[] course) {
        return "amount obstacles - " + course[0] +
                ", swim distance - " + course[1] +
                ", run distance - " + course[2];
            
        }

}
