package org.example.seminar06.cw01;

public class Worker {
    private String name;
    private int salary;
    private int age;
    private boolean vacation;
    private int cabinet;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean getVacation() {
        return vacation;
    }

    public void setVacation(boolean vacation) {
        this.vacation = vacation;
    }

    public int getCabinet() {
        return cabinet;
    }

    public void setCabinet(int cabinet) {
        this.cabinet = cabinet;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", vacation=" + vacation +
                ", cabinet=" + cabinet +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
