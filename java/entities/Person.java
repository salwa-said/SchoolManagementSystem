package entities;

import utils.HelperUtils;

import java.util.Objects;

public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;


        public Person(Integer id, String firstName, String lastName, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    

}
