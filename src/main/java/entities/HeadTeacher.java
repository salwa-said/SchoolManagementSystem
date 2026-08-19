package entities;

public class HeadTeacher extends Teacher {
    private  double salaryBonus;


    public HeadTeacher(Integer id, String firstName, String lastName, Integer age,
                       Integer yearsExperience, String subject, double salaryBonus) {
        super(id, firstName, lastName, age, yearsExperience, subject);
        this.salaryBonus=salaryBonus;
    }

    public double getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(double salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    @Override
    public  void displayInfo() {
        super.displayInfo();
        System.out.println("Salary Bonus: " + salaryBonus);
    }
}
