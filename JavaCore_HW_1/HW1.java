package Lesson1;

public class HW1 {
    public static void main(String[] args) {
        Team pobeda = new Team("Pobeda");
        System.out.println("===================");
        System.out.println(pobeda.fullTeamInfo());
        System.out.println("===================");
        Course course1 = new Course(4, 21,15);
        System.out.println(course1.fullCourseInfo(course1.getCourse()));
        System.out.println("===================");
        course1.doCourse(pobeda.getTeam(), course1.getCourse());


    }
}
