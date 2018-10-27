package com.example.sogir.myproject6;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Sogir on 10/19/2018.
 */

public class Employee implements Serializable {
    private String name;
    private String age;
    private String gender;
    private String type;
    private List<String>languages;

    public Employee(String name, String age, String gender, String type, List<String> languages) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.type = type;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getType() {
        return type;
    }

    public List<String> getLanguages() {
        return languages;
    }



}
