package entities;

public class Teacher extends Person {
    private Integer yearsExperience;
    private String subject;


    //Constructor
    public Teacher(Integer id, String firstName, String lastName, Integer age,Integer yearsExperience, String subject) {
        super(id, firstName, lastName, age);
        setYearsExperience(yearsExperience);
        this.subject = subject;
    }

    public Integer getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(Integer yearsExperience) {
        if (yearsExperience < 0) {
            System.out.println("Error: Experience cannot be negative.");
            this.yearsExperience = 0;
        } else {
            this.yearsExperience = yearsExperience;
        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
}
