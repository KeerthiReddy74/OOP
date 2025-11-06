package co2_scena;
abstract class Course {
    abstract void startCourse();
    abstract void endCourse();

    public void getCourseDetails() {
        System.out.println("Course details will be available in portal.");
    }

    public void giveCertificate() { // same for all courses
        System.out.println("Certificate awarded successfully!");
    }
}

class ProgrammingCourse extends Course {
    @Override
    void startCourse() {
        System.out.println("Programming course started. Open your IDE!");
    }

    @Override
    void endCourse() {
        System.out.println("Programming course ended. Submit projects!");
    }
}

class LanguageCourse extends Course {
    @Override
    void startCourse() {
        System.out.println("Language course started. Join live sessions!");
    }

    @Override
    void endCourse() {
        System.out.println("Language course ended. Attend speaking test!");
    }
}

public class ELearningPlatform {
	public static void main(String[] args) {
        Course c1 = new ProgrammingCourse();
        c1.startCourse();
        c1.getCourseDetails();
        c1.endCourse();
        c1.giveCertificate();

        System.out.println();

        Course c2 = new LanguageCourse();
        c2.startCourse();
        c2.getCourseDetails();
        c2.endCourse();
        c2.giveCertificate();
    }
}
