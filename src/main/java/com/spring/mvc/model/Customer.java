package com.spring.mvc.model;

import com.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {

    @Size(min = 2, max = 64, message = "Name must be minimum 2 symbols")
    private String name;
    @Min(value = 18)
    private String age;
    @Min(value = 500)
    @Max(value = 1001)
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private List<String> languages;

    @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$"
            , message = "incorrect number phone")
    private String phone;

    @CheckEmail
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    private Map<String, String> defaultDepartments() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human resources", "HR");
        departments.put("Sales", "Sales");
        return departments;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Customer() {
        this.departments = defaultDepartments();
    }

    public Customer(String name, String age, int salary, String department, HashMap<String, String> departments, String carBrand, List<String> languages, String phone, String email) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.departments = departments;
        this.carBrand = carBrand;
        this.languages = languages;
        this.phone = phone;
        this.email = email;
    }
}
