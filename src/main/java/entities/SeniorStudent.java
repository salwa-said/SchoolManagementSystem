package entities;

public class SeniorStudent extends Student {
    private String specialization;

    public SeniorStudent(Integer id, String firstName, String lastName, Integer age, double fee,
                         String gradeLevel,String specialization) {
        super(id, firstName, lastName, age, fee, gradeLevel);
        this.specialization = specialization;
    }
    public String getSpecialization() {

        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}
