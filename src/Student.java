public class Student {
    String fName;
    String lName;
    int gradYear;
    double GPA;
    String major;

    public Student(String fName, String lName, int gradYear, double GPA, String major) {
        this.fName = fName;
        this.lName = lName;
        this.gradYear = gradYear;
        this.GPA = GPA;
        this.major = major;
    }

    public void incrementExpectedGradYear() {
        this.gradYear = this.gradYear + 1;
    }

}
