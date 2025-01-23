package com.booleanuk.api.employee;

public class Employee {
    private int id;
    private String name;
    private String jobName;
    private int salaryGrade_id;
    private int department_id;

    public Employee(int id, String name, String jobName, int salaryGrade_id, int department_id){
        this.id = id;
        this.name = name;
        this.jobName = jobName;
        this.salaryGrade_id = salaryGrade_id;
        this.department_id = department_id;
    }

    public Employee(String name, String jobName, int salaryGrade_id, int department_id){
        this.name = name;
        this.jobName = jobName;
        this.salaryGrade_id = salaryGrade_id;
        this.department_id = department_id;
    }

    public Employee(int id){
        this.id = id;
    }

    public Employee(){

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJobName() {
        return jobName;
    }

    public int getSalaryGrade_id() {
        return salaryGrade_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public String toString() {
        String result = "";
        result += this.id + " - ";
        result += this.name + " - ";
        result += this.jobName + " - ";
        result += this.salaryGrade_id + " - ";
        result += this.department_id;
        return result;
    }
}
