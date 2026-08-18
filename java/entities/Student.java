package entities;

import interfaces.Displayable;

public class Student extends Person implements Displayable {
    private double fee;
    private String gradeLevel;

    //Constructor
    public Student(Integer id, String firstName, String lastName, Integer age, double fee, String gradeLevel) {
        super(id, firstName, lastName, age);
        setFee(fee);
        this.gradeLevel = gradeLevel;
    }

    //Setter and Getter
    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        if(fee<0){
            System.out.println("Error: Fee cannot be negative.");
            this.fee=0;
        }else {
            this.fee = fee;
        }
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }


}
